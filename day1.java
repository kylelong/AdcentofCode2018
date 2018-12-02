/**
 * Created by kylel95 on 12/2/18.
 * https://adventofcode.com/2018/day/1
 * resulting frequency
 * javac day1.java
   java day1 < day1.txt > day1output.txt
   cat day1output.txt
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class day1 {
    public static void main(String [] args){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = 0;
        int sum = 0;
        while(in.hasNext()){
             n = in.nextInt();
             sum += n;
        }
        System.out.println(sum);
    }
}
