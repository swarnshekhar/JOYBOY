package java_dsa_2;

import java.util.Arrays;

public class search_in_string {
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i)){
                return true;
            }
            
        }
        return false;
    }
    static boolean search2(String str,char target){
        if(str.length()==0){
            return false;
        }
       for(char ch:str.toCharArray()){
        if(ch==target){
            return true;
        }
       }
            
        
        return false;
    }
    public static void main(String[] args) {
String name="swarn";
char target='r' ;
System.out.println(search2(name, target));
System.out.println(Arrays.toString(name.toCharArray()));

    }
}

