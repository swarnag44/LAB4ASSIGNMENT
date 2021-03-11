package com.cg.il.model;

public abstract class Item {
	private int identificationNumber;
	private String title;
	private int numCopies;
	public Item(){
		
	}
	public Item(int identificationNumber, String title, int numCopies) {
		//super();
		this.identificationNumber = identificationNumber;
		this.title = title;
		this.numCopies = numCopies;
	}
	
	public int getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumCopies() {
		return numCopies;
	}
	public void setNumCopies(int numCopies) {
		this.numCopies = numCopies;
	}
	public void checkIn(){
		numCopies = numCopies + 1;
		}
	public void checkOut(){
		numCopies = numCopies - 1;
		}
	public void addItem(int identificationNumber, String title, int numCopies){
		setIdentificationNumber(identificationNumber);
		setTitle(title);
		setNumCopies(numCopies);
		}
	public void print(){
		System.out.println("Title: " +title);
		System.out.println("ID: " +identificationNumber);
		System.out.println("Number of copies: " +numCopies);
	}
	public boolean equals(Object obj){
		if(obj == null)
			return false;
			Item otherItem = (Item) obj;
			return identificationNumber == otherItem.identificationNumber && title == otherItem.title && numCopies== otherItem.numCopies;
		}
	public void addItem() {
		numCopies++;
	}
	@Override
	public String toString() {
		return ", getIdentificationNumber=" + getIdentificationNumber() + ", Title=" + getTitle()
				+ ", NumCopies=" + getNumCopies() ;
	}
}
