package com.java3;
// Purpose:
// package is used to group related Java classes.
// Here, Assign7 belongs to the package "com.java3".


public class Assign7 {
// Purpose:
// Creates a class named Assign7.
// A class is a blueprint/template for creating objects.


    static String brand;
    // Purpose:
    // "static" means brand belongs to the CLASS, not to individual objects.
    // Only ONE copy of brand is created in memory.
    // All objects share the same brand variable.
    //
    // String -> data type
    // brand  -> variable name
    //
    // Example:
    // brand = "realme";
    // brand = "apple";
    // brand = "motorola";
    //
    // Whenever we change brand, the shared static variable is changed.


    String model;
    // Purpose:
    // Instance variable.
    // Every object gets its OWN copy of model.
    //
    // Example:
    // Object a -> model = "android 16"
    // Object b -> model = "android 17"
    // Object c -> model = "android 16"


    int price;
    // Purpose:
    // Instance variable used to store the price of each mobile.
    // Every object gets its own price.


    int ram;
    // Purpose:
    // Instance variable used to store RAM of each mobile.
    // Every object gets its own RAM value.


    int rom;
    // Purpose:
    // Instance variable used to store ROM/storage of each mobile.
    // Every object gets its own ROM value.



    static {
        System.out.println("****** mobile details **********");

        // Purpose:
        // This is a STATIC BLOCK.
        //
        // A static block executes automatically when the class is loaded
        // by the JVM.
        //
        // It executes ONLY ONCE, regardless of how many objects we create.
        //
        // In this program we create 3 objects:
        // a, b and c
        //
        // But this static block executes only once.
    }



    {
        System.out.println("**********brand details*********");

        // Purpose:
        // This is an INSTANCE BLOCK.
        //
        // An instance block executes automatically whenever
        // an object is created.
        //
        // We create 3 objects:
        // a -> instance block executes
        // b -> instance block executes
        // c -> instance block executes
        //
        // Therefore, this block executes 3 times.
    }



    static void method() {
        System.out.println("mobiles:- realme, apple, motorlo");

        // Purpose:
        // This is a STATIC METHOD.
        //
        // "static" means this method belongs to the class.
        //
        // We can call it without creating an object.
        //
        // Example:
        // Assign7.method();
        //
        // Since main() is also static, we can directly write:
        // method();
        //
        // Static methods are generally used for operations
        // that do not depend on a particular object's data.
    }



    void display() {
        // Purpose:
        // This is an INSTANCE METHOD.
        //
        // It is NOT static.
        // Therefore, it belongs to an object.
        //
        // We need an object to call this method.
        //
        // Example:
        // a.display();
        // b.display();
        // c.display();



        System.out.println("brand:- " + brand);
        // Purpose:
        // Prints the value of the static variable brand.
        //
        // brand is static, so it is shared by all objects.
        //
        // Example:
        // brand = "realme";
        // Output -> brand:- realme



        System.out.println("model:- " + model);
        // Purpose:
        // Prints the model of the current object.
        //
        // model is an instance variable.
        //
        // If a.display() is called:
        // model of object a is printed.
        //
        // If b.display() is called:
        // model of object b is printed.



        System.out.println("price " + price);
        // Purpose:
        // Prints the price of the current object.
        // price is an instance variable.



        System.out.println("ram:- " + ram);
        // Purpose:
        // Prints the RAM of the current object.
        // ram is an instance variable.



        System.out.println("rom:- " + rom);
        // Purpose:
        // Prints the ROM of the current object.
        // rom is an instance variable.

    }



    public static void main(String[] args) {
        // Purpose:
        // main() is the entry point of the Java program.
        //
        // public  -> JVM can access main() from outside the class.
        // static  -> JVM can call main() without creating an object.
        // void    -> main() does not return a value.
        // main    -> special method name recognized by JVM.
        // String[] args -> receives command-line arguments.



        brand = "realme";
        // Purpose:
        // Assigns "realme" to the static variable brand.
        //
        // Because brand is static, there is only ONE copy of brand.
        // Initially:
        //
        // brand -> "realme"



        method();
        // Purpose:
        // Calls the static method.
        //
        // We don't need an object because method() is static.
        //
        // We could also write:
        // Assign7.method();



        Assign7 a = new Assign7();
        // Purpose:
        // Creates the FIRST object.
        //
        // Assign7 -> class type
        // a       -> reference variable
        // new     -> creates an object in heap memory
        // Assign7() -> constructor call
        //
        // When this object is created, the INSTANCE BLOCK executes.
        //
        // Output:
        // **********brand details*********
        //
        // The static block does NOT execute here again
        // because it already executed when the class was loaded.



        a.model = "andriod 16";
        // Purpose:
        // Assigns model value to object a.
        //
        // a's model = "andriod 16"



        a.price = 120000;
        // Purpose:
        // Assigns price to object a.
        //
        // a's price = 120000



        a.ram = 8;
        // Purpose:
        // Assigns RAM to object a.
        //
        // a's RAM = 8



        a.rom = 128;
        // Purpose:
        // Assigns ROM to object a.
        //
        // a's ROM = 128



        a.display();
        // Purpose:
        // Calls the INSTANCE METHOD display().
        //
        // Since display() is not static,
        // we need an object.
        //
        // Here object "a" calls display().
        //
        // Therefore a's model, price, RAM and ROM are displayed.



        Assign7 b = new Assign7();
        // Purpose:
        // Creates the SECOND object.
        //
        // The instance block executes again.
        //
        // Output:
        // **********brand details*********
        //
        // Static block does NOT execute again.



        brand = "apple";
        // Purpose:
        // Changes the shared static variable brand.
        //
        // IMPORTANT:
        // brand is static, so this does NOT create a new brand for b.
        //
        // It changes the ONE shared brand variable:
        //
        // Before:
        // brand = "realme"
        //
        // Now:
        // brand = "apple"



        b.model = "andriod 17";
        // Purpose:
        // Assigns model to object b.



        b.price = 120000;
        // Purpose:
        // Assigns price to object b.



        b.ram = 16;
        // Purpose:
        // Assigns RAM to object b.



        b.rom = 256;
        // Purpose:
        // Assigns ROM to object b.



        b.display();
        // Purpose:
        // Calls the instance method using object b.
        //
        // b's instance values are displayed.
        //
        // brand is "apple" because brand is static.



        Assign7 c = new Assign7();
        // Purpose:
        // Creates the THIRD object.
        //
        // Instance block executes again.
        // Static block does not execute again.



        brand = "motorlo";
        // Purpose:
        // Changes the shared static brand to "motorlo".
        //
        // Better spelling:
        // "motorola"



        c.model = "andriod 16";
        // Purpose:
        // Assigns model to object c.



        c.price = 80000;
        // Purpose:
        // Assigns price to object c.



        c.ram = 16;
        // Purpose:
        // Assigns RAM to object c.



        c.rom = 256;
        // Purpose:
        // Assigns ROM to object c.



        c.display();
        // Purpose:
        // Calls display() using object c.
        //
        // c's instance variables are displayed.
        // The current shared brand is "motorlo".

    }
}