package com.java3;

//2.Create a Java program using both BigInteger and BigDecimal.
//Store a large number using BigInteger.
//Store a decimal price using BigDecimal.
//Add two BigInteger values.
//Add two BigDecimal values.
//Display both results.

import java.math.BigInteger;
import java.math.BigDecimal;


public class Assign15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigInteger x =new BigInteger("999999999999");
		BigInteger y =new BigInteger("111111111111");
		
		BigInteger z=x.add(y);
		
//		so if we want to assign with another value we must create biginteger for that value  we can use like below one

		BigInteger w=z.multiply(new BigInteger("2"));
		
		System.out.println(z);
		System.out.println(w);
		
		
		BigInteger b1=new BigInteger("12");
		
		BigInteger b2=new BigInteger("3");
		
		
		
		System.out.println(b1.add(b2));
		
//		so if we  already created new biginteger we can use like below one
		System.out.println(b1.multiply(b2));
		
		
		
		System.out.println("********** Big Decimal ******************");
		BigDecimal x1=new BigDecimal("999999.999999");
		BigDecimal y1=new BigDecimal("111111.111111");
		
		BigDecimal z1= x1.add(y1);
		
		BigDecimal w1= x1.multiply(y1);
		
		System.out.println(z1);
		System.out.println(w1);
		
		
		BigDecimal x2=new BigDecimal("8245.48");
		BigDecimal y2=new BigDecimal("23456.12");
		
         BigDecimal z2= x1.add(y2);
		
		 BigDecimal w2= x2.multiply(y2);
		 BigDecimal w3= z2.multiply(new BigDecimal("12.34"));
		 
		 System.out.println(z2);
			System.out.println(w2);
			
			System.out.println(w3);
		
	}
	

}
