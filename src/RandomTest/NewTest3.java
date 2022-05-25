package RandomTest;
import java.util.*;

public class NewTest3 {
    
    
    public static boolean rotationOfString(String str1, String str2)
    {
        boolean flag = false;
        if(str1.length()==str2.length()) {
            for(int i=0; i<str1.length(); i++) {
                if (str1.charAt(i)==str2.charAt(str2.length()-i-1)) {
                    flag=true;
                }
                else {
                	flag=false;
                }
            }
        }
        else {
            System.out.println("Both strings are of differnt length, hence cannot be compared");
        }
        
        return flag;
        
    }

    public static void main(String[] args)
    {
        
        String str1 = "abcdef";
        String str2 = "fedcba";
        System.out.println("Are the both strings rotation of each other? " + rotationOfString(str1, str2));
    }
}