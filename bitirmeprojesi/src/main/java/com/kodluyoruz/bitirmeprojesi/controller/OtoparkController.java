package com.kodluyoruz.bitirmeprojesi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kodluyoruz.bitirmeprojesi.model.AracEklemeDto;
import com.kodluyoruz.bitirmeprojesi.model.AracInfoResponseDto;
import com.kodluyoruz.bitirmeprojesi.service.OtoparkService;



@RestController
@RequestMapping("/api/otopark")
public class OtoparkController {
	
	 @Autowired
	OtoparkService otoparkService;
	 
	 
	 @GetMapping("/get-arac-list")
	    public List<AracInfoResponseDto> getAracList(){
	        List<AracInfoResponseDto> aracList = otoparkService.getAracList();
	        return aracList;
	    }
	 
	  @PostMapping("/add-arac")
	    public String saveArac(@RequestBody AracEklemeDto aracEklemeDto){
	        return otoparkService.saveArac(aracEklemeDto);
	    }
	  
	  @PostMapping("/delete-arac")
	    public String deleteArac(@RequestParam( required=false,name="plaka") String plaka){
	        return otoparkService.deleteArac(plaka);
	    }

}
