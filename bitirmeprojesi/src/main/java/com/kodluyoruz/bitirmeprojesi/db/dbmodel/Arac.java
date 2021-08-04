package com.kodluyoruz.bitirmeprojesi.db.dbmodel;

public class Arac {
	private int id;
	private String model;
	private String plaka;
	private String sahipAdi;
	
	public Arac() {
	}
	
	public Arac(String model, String plaka, String sahipAdi,int id) {
		super();
		this.model = model;
		this.plaka = plaka;
		this.sahipAdi = sahipAdi;
		this.id = id;
		
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((plaka == null) ? 0 : plaka.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arac other = (Arac) obj;
		if (id != other.id)
			return false;
		if (plaka == null) {
			if (other.plaka != null)
				return false;
		} else if (!plaka.equals(other.plaka))
			return false;
		return true;
	}
	
	

	
	
	
}
