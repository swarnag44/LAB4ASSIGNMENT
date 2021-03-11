package com.cg.il.model;

public abstract class MediaItem extends Item {
	private int runtime;
	
	public MediaItem() {
		super();
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public MediaItem(int identificationNumber, String title, int numCopies,int runtime) {
		super(identificationNumber, title, numCopies);
		this.runtime=runtime;
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
		return "runTime=" + runtime ;
	}


}
