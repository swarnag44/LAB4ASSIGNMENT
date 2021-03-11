package com.cg.il.model;

public class Book extends WrittenItem {

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Author=" + getAuthor() + ", IdentificationNumber="
				+ getIdentificationNumber() + ", Title=" + getTitle() + ", NumCopies=" + getNumCopies()
				;
	}

	public Book(int identificationNumber, String title, int numCopies, String author) {
		super(identificationNumber, title, numCopies, author);
		
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

}
