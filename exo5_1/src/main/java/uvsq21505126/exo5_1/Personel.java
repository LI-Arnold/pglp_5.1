package uvsq21505126.exo5_1;

import java.time.LocalDate;

public class Personel implements Serialisable{
	private final String nom;
	private final String prenom;
	private final String fonction;
	private final LocalDate date;
	
	public static class Builder{
		private final String nom;
		private final String prenom;
		private final String fonction;
		private final LocalDate date;
	
	public Builder(String nom, String prenom, String fonction, LocalDate date) {
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		this.date = date;
	}
	
	public Personel build() {
		return new Personel(this);
	}
}
	
	private Personel(Builder builder) {
		this.nom = builder.nom;
		this.prenom = builder.prenom;
		this.fonction = builder.fonction;
		this.date = builder.date;
	}

	public void print() {
		System.out.println("Personel");
		
	}
}