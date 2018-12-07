/**
 * Created by kylel95 on 12/4/18.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * find overlaps in 2d array
 *
   clear
   javac day3.java
    java day3 < day3.txt > day3output.txt
    cat day3output.txt
 */
public class day3 {
    public static void main(String [] args){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s;
        int line, left, top, width, height;
        while(in.hasNext()){
            s = in.nextLine();
            line = getLine(s);
            left = getFromLeft(s);
            top = getFromTop(s);
//            width = getWidth(s);
//            height = getHeight(s);
            System.out.println(line + " " + left + " " + top);



        }
    }
    public static int getLine(String s){
        String [] arr = s.split(" ");
        String haystack = arr[0];
        haystack = haystack.replaceFirst("#", "");
        return Integer.parseInt(haystack);
    }
    public static int getFromLeft(String s){
       String [] arr = s.split(" ");
       String haystack = arr[2];
       String [] comma = haystack.split(",");
       return Integer.parseInt(comma[0]);


    }
    public static int getFromTop(String s){
        String [] arr = s.split(" ");
        String haystack = arr[2];
        haystack  = haystack.replaceFirst(":", "");
        String [] comma = haystack.split(",");
        return Integer.parseInt(comma[2]);

    }
    public static int getWidth(String s){
        String [] arr = s.split(" ");
        String haystack = arr[3];
        String [] x = haystack.split("x");
        return Integer.parseInt(x[0]);
    }
    public static int getHeight(String s){
        String [] arr = s.split(" ");
        String haystack = arr[3];
        String [] x = haystack.split("x");
        return Integer.parseInt(x[1]);
    }
}
