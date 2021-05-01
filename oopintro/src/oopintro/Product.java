package oopintro;

public class Product //özellik tutan class
{
	public Product() {
		System.out.println("Ben çalistim");
	}
	
	public Product(int id,String name,double unitPrice, String detail) {
		this.id = id; //this classtaki iddir.id ise constructor metodunun imzasndaki iddir.This bu classtaki demek
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		
	}
 
	int id;
	String name;
	double unitPrice;
	String detail;
	
	
}
