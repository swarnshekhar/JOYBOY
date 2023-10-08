package string_stringbuilder;

import java.util.ArrayList;

import JAVA_DSA_1.array_arraylist;

public class operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);  
        System.out.println((char)('a'+3));  
        System.out.println("a"+3);//is string 
        System.out.println("swarn"+new ArrayList());
        System.out.println("swarn"+new Integer(23));
        // System.out.println(new ArrayList()+new Integer(34)); WO'T WORK
        //operator + can only be applied for primitive or any one variable is string
         System.out.println(new ArrayList()+""+new Integer(34)); 
    }
    
}
