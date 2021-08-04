package com.kodluyoruz.bitirmeprojesi.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodluyoruz.bitirmeprojesi.db.Database;
import com.kodluyoruz.bitirmeprojesi.db.dbmodel.Arac;
import com.kodluyoruz.bitirmeprojesi.model.AracEklemeDto;
import com.kodluyoruz.bitirmeprojesi.model.AracInfoResponseDto;




@Service
public class OtoparkService {

    @Autowired
    ModelMapper mapper;
    
    
    public List<AracInfoResponseDto> getAracList() {
        List<Arac> aracList = Database.aracList;
        List<AracInfoResponseDto> aracInfoResponseDtos = new ArrayList<>();
        for (Arac arac : aracList) {
        	AracInfoResponseDto aracInfoResponseDto = convertToAracResponseDtoByAracEntityMapper(arac);
        	aracInfoResponseDtos.add(aracInfoResponseDto);
        }

        return aracInfoResponseDtos;

    }

    
    public String saveArac(AracEklemeDto aracEklemeDto) {
    	
    	String model = aracEklemeDto.getModel();
    	String plaka = aracEklemeDto.getPlaka();
    	String sahipAdi = aracEklemeDto.getSahipAdi();
    	int total = 0;
    	if(!aracControl(plaka)) {
    		Arac arac = new Arac();
    		arac.setModel(model);
        	arac.setPlaka(plaka);
        	arac.setSahipAdi(sahipAdi);
        	Database.aracList.add(arac);

        	Database.kazanclist.add(5);
        	for(int b = 0; b < Database.kazanclist.size(); b++) {
        		total += Database.kazanclist.get(b);
        	}
      	  	return "Plakası "+ plaka + " olan araç otoparkımıza giriş yapmıştır. Toplam Kazanç : "+ total + "TL'dir.";

        	
    	}else {
    		return "Bu plakalı araç otoparkımızda mevcuttur.";
    	}

    }
    
    public String deleteArac(String plaka) {
    	String message = "";
		 for(int i=0; i<Database.aracList.size();i++) {
			 if(Database.aracList.get(i).getPlaka().equals(plaka)) {
				 Database.aracList.remove(i);
				 message =  "Plakası "+ plaka + " olan araç otoparkımızdan ayrılmıştır.";
			 }else {
				 message =  "Araç Mevcut değil";

			 }
		 }   
		 
		 return message;		 
    }
    
    
    
    

	private AracInfoResponseDto convertToAracResponseDtoByAracEntityMapper(Arac arac) {
		 AracInfoResponseDto  aracInfoResponseDto = mapper.map(arac, AracInfoResponseDto.class);
	        return aracInfoResponseDto;
	}
	
	public boolean aracControl(String plaka) {
		boolean status = false;
		for(int i = 0; i< Database.aracList.size(); i++) {
			status = Database.aracList.get(i).getPlaka().equals(plaka);
    	}
		return status;
	}
    
    
    
    
    
}
