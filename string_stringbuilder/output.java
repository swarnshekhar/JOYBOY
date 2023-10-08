package string_stringbuilder;

import java.util.Arrays;

public class output {
    public static void main(String[] args) {
        System.out.println(56);
        System.out.println("swarn");
        System.out.println(new int[] { 1, 2, 3, 4 });// will print any random value...
        // java dont know what type of product we want to get in.tostring it may be
        // hashmap ,array or own section,name(oops) etc..
        // so it print a random value with some hashcode and @ }
        // THAT'S WHY WE DO
        System.out.println(Arrays.toString(new int[]{1,2,3,4}));
    }
}