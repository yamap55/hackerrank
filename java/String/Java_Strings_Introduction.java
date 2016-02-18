import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(a.length() + b.length());
        System.out.println(a.compareTo(b) > 0 ? "Yes" : "No");
        System.out.println(capitalize(a) + " " + capitalize(b));
    }
    private static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
