package com.training;

public class Application2 {
	
	public static void main(String[] args) {
		// first way
		Book headfirstjava = new Book();
		headfirstjava.setAuthor("kathy");
		headfirstjava.setBookNumber(100);
		headfirstjava.setBookName("Head first java");
		headfirstjava.setPrice(100);
		System.out.println(headfirstjava.getAuthor());
		System.out.println(headfirstjava.getBookNumber());
		System.out.println(headfirstjava.getBookName());
		System.out.println(headfirstjava.getPrice());
		
		
		// second way
		Book android= new Book(102, "Android Development", 200, "xyz");
		System.out.println(android.getAuthor());
		System.out.println(android.getBookNumber());
		System.out.println(android.getBookName());
		System.out.println(android.getPrice());
		
		//third way
	
		Book ios= new Book(103, "IOS Development", 300, "pqrs");
	   System.out.println(ios.toString());
	   
	   CreditCard master=new CreditCard(34789, "abde", 30000);
	   System.out.println(master.toString());
	}

}
