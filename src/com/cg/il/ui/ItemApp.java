package com.cg.il.ui;

import com.cg.il.model.Book;
import com.cg.il.model.Cd;
import com.cg.il.model.Item;
import com.cg.il.model.JournalPaper;
import com.cg.il.model.MediaItem;
import com.cg.il.model.Video;
import com.cg.il.model.WrittenItem;
//import com.cg.oopd.model.ComplexNumber;
public class ItemApp {

	public static void main(String[] args) {
		//Item item=new Item(1,"jaswanthi",45);
		//System.out.println(item);
		//WrittenItem w=new WrittenItem(2,"vyshu",45,"swarna");
		//System.out.println(w);
		//MediaItem m=new MediaItem(1,"swarna",15,16);
		//System.out.println(m);
		//ComplexNumber c4 = c1.sub(c2);
		//System.out.println(c4.getRealPart() +","+c4.getImaginaryPart());

		Book book=new Book(3,"rekha",34,"dhanu");
		//System.out.println(book);
		book.addItem();
		System.out.println(book);
		book.print();
		System.out.println(book);
		book.checkIn();
		System.out.println(book);
		book.checkOut();
		System.out.println(book);
		book.equals(book);
		System.out.println(book);
		Cd cd=new Cd(1,"swarna",15,16,"Srinivas","romantic");
		//System.out.println(cd);
		cd.addItem();
		System.out.println(cd);
		cd.print();
		System.out.println(cd);
		cd.checkIn();
		System.out.println(cd);
		cd.checkOut();
		System.out.println(cd);
		cd.equals(book);
		System.out.println(cd);
		JournalPaper jp=new JournalPaper(3,"singam",4,"ramcharan",1999);
		//System.out.println(jp);
		jp.addItem();
		System.out.println(jp);
		jp.print();
		System.out.println(jp);
		jp.checkIn();
		System.out.println(jp);
		jp.checkOut();
		System.out.println(jp);
		jp.equals(jp);
		System.out.println(jp);
		Video vd=new Video(7,"raceguram",6,8,"chiranjeevi","action",2020);
		//System.out.println(vd);
		vd.addItem();
		System.out.println(vd);
		vd.print();
		System.out.println(vd);
		vd.checkIn();
		System.out.println(vd);
		vd.checkOut();
		System.out.println(vd);
		vd.equals(book);
		System.out.println(vd);
	}

}
