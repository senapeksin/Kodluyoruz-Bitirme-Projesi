package com.kodluyoruz.bitirmeprojesi;

import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kodluyoruz.bitirmeprojesi.db.Database;
import com.kodluyoruz.bitirmeprojesi.db.dbmodel.Arac;

@SpringBootApplication
public class BitirmeprojesiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BitirmeprojesiApplication.class, args);
	}
	
	
	
	@PostConstruct
	public void dbDoldur(){
		/*
		Arac arac = new Arac("BMW", "16 KJL 123", "Sena",1);
		Otopark.aracList.add(arac);

		Arac arac2 = new Arac("Mercedes", "08 KJL 123", "Mücahit",2);
	//	arac2.setModel("Şahin");
	//	arac2.setPlaka("08 KJL 123");
		Otopark.aracList.add(arac2);
		
		Arac arac3 = new Arac("Şahin", "34 KJL 123", "Ayşe",3);
		Otopark.aracList.add(arac3);
		
		Arac arac4 = new Arac("Kartal", "06 KJL 123", "Fatma",4);
		Otopark.aracList.add(arac4);
	*/
	}


}
