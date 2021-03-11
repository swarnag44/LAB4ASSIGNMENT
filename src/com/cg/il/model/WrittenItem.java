package com.cg.il.model;

public abstract class WrittenItem extends Item {
	private String author;
	public WrittenItem() {
		super();
	}

	public WrittenItem(int identificationNumber, String title, int numCopies,String author) {
		super(identificationNumber, title, numCopies);
		this.author=author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
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
		return "author=" + author;
	}

}
