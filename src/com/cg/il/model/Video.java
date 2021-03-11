package com.cg.il.model;

public class Video extends MediaItem {
	private String director;
	private String genre;
	private int year;
	public Video() {
		super();
	}

	public Video(int identificationNumber, String title, int numCopies, int runtime,String director,String genre,int year) {
		super(identificationNumber, title, numCopies, runtime);
		this.director=director;
		this.genre=genre;
		this.year=year;
	}

	
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
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
		return " Director="+ getDirector() + ", Genre=" + getGenre() + ", Year=" + getYear() + ",Runtime="
				+ getRuntime() +  ",IdentificationNumber="
				+ getIdentificationNumber() + ",Title=" + getTitle() + ",NumCopies=" + getNumCopies();
	}


}
