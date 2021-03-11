package com.cg.il.model;

public class JournalPaper extends WrittenItem {
	private int year;
	public JournalPaper() {
		
	}

	public JournalPaper(int identificationNumber, String title, int numCopies, String author,int year) {
		super(identificationNumber, title, numCopies, author);
		this.year=year;
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
		return "year=" + year + ",Author=" + getAuthor() + ", toString()="
				+ ", IdentificationNumber=" + getIdentificationNumber() + ", Title=" + getTitle()
				+ ",NumCopies=" + getNumCopies() ;
	}

	
	

}
