package theory.data_structure.strings;

import java.util.ArrayList;

public class Oparators {
    public static void main(String[] args) {
        System.out.println('a'+'b'); // addition of ascii value of character a and b => 195
        System.out.println("a"+"b"); // concatenation of string a and b => "ab"

        System.out.println('a'+3);  // => 100
        System.out.println("a"+3); //  => "a3" -> before concat, 1 will be converted to string
//        int will be converted to Integer and that will call toString()
        System.out.println("a" + new ArrayList<>());
//        System.out.println("a" + new Integer(40));
//        System.out.println(new ArrayList<>() + new Integer(40));  -> will not work as '+' only work for primitives and string or when
//        we concat at least one of them should be string
    }
}
