package com.java3;

public class Assign16 {

    public static void main(String[] args) {

        // 
        // AUTOBOXING
        // 

        // i1 is a primitive int variable.
        int i1 = 10;

        /*
         * Autoboxing:
         *
         * Java automatically converts the primitive int
         * into an Integer wrapper object.
         *
         * int -> Integer
         *
         * We do NOT explicitly call Integer.valueOf().
         */
        Integer i2 = i1;

        System.out.println("Primitive data : " + i1);
        System.out.println("Integer object : " + i2);
        
//        ---------------------------------------------------------------------------------
//        
//        What is Integer.valueOf()?
//        		Integer i2 = Integer.valueOf(i1);
//
//        		Integer is a wrapper class for int.
//
//        		valueOf() is a static method of the Integer class.
//
//        		Its job here is to convert an int value into an Integer object.
//
//        		Conceptually:
//
//        		int value
//        		   ↓
//        		Integer.valueOf()
//        		   ↓
//        		Integer object
//
//        		Example:
//
//        		int x = 10;
//
//        		Integer obj = Integer.valueOf(x);
//
//        		This is explicit boxing, because you explicitly called valueOf().
//        ------------------------------------------------------------------------------------------
//
//        		What is intValue()?
//        		int i4 = i3.intValue();
//
//        		intValue() is an instance method of the Integer class.
//
//        		Its job is to extract the primitive int value from an Integer object.
//
//        		Conceptually:
//
//        		Integer object
//        		      ↓
//        		 intValue()
//        		      ↓
//        		 primitive int
//
//        		Example:
//
//        		Integer obj = 100;
//
//        		int x = obj.intValue();
//
//        		This is explicit unboxing, because you explicitly called intValue().
        
//        ---------------------------------------------------------------------------------


        // =====================================================
        // AUTOUNBOXING
        // =====================================================

        /*
         * i3 is an Integer wrapper object.
         *
         * Here 423457856 is automatically converted from
         * int to Integer because i3 is an Integer reference.
         *
         * int -> Integer
         */
        Integer i3 = 423457856;


        /*
         * Autounboxing:
         *
         * Java automatically converts the Integer object
         * into a primitive int.
         *
         * Integer -> int
         *
         * We do NOT explicitly call intValue().
         */
        int i4 = i3;

        System.out.println("Wrapper object : " + i3);
        System.out.println("Primitive data : " + i4);
    }
}