package com.cg.il.model;

public class Cd extends MediaItem {
	private String artist;
	private String genre;
	public Cd() {
		super();
	}

	public Cd(int identificationNumber, String title, int numCopies, int runtime,String artist,String genre) {
		super(identificationNumber, title, numCopies, runtime);
		this.artist=artist;
		this.genre=genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void print(){
		System.out.println("Display info about a book: ");
		super.print();
	}
	public void checkIn(){
		super.checkIn();
	}
	public void checkOut(){
		super.checkOut();
	}
	public void addItem(){
		super.addItem();
	}
	@Override
	public String toString() {
		return "artist=" + artist + ", genre=" + genre + ",Artist=" + getArtist() + ", Genre="
				+ getGenre() + ", Runtime=" + getRuntime() +  ", IdentificationNumber=" + getIdentificationNumber() + ", Title=" + getTitle()
				+ ", NumCopies=" + getNumCopies() ;
	}

	
	
	
}
