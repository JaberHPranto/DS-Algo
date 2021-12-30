package theory.data_structure.strings;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String a="pranto";
        String b="pranto";
//        here a sting pool be created (a memory structure in heap) and a and b will be pointed to same object
//        "pranto" in pool.Hence a==b
//        using string pool,it optimizes our program
//        System.out.println(a==b); //true

        String c= new String("pranto");
        String d= new String("pranto");
//        here we explicitly tell java to create two different string object. So even if the object value is same
//        but c and d will be pointed to two different object.Hence, c!=d
//        System.out.println(c==d); //false
//        System.out.println(c.equals(b)); // this will be true as .equals() only compare values

//        format floats
        float num=1231.21212313311f;
        System.out.printf("Formatted num : %.2f",num);
        System.out.println();
        System.out.printf("Pie : %.4f",Math.PI);
        System.out.println();

        String name = "Jaber Hossain Pranto";
        System.out.println("------------ Array Methods ------------");
        System.out.println(name.indexOf("P"));
        System.out.println(name.contains("ant"));
        System.out.println(name.substring(6,10));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(name.split(" ")));


    }
}
