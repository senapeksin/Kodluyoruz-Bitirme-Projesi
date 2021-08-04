package com.kodluyoruz.bitirmeprojesi.model;

public class AracEklemeDto {
	private int id;
	private String model;
	private String plaka;
	private String sahipAdi;

	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPlaka() {
		return plaka;
	}
	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}
	public String getSahipAdi() {
		return sahipAdi;
	}
	public void setSahipAdi(String sahipAdi) {
		this.sahipAdi = sahipAdi;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
