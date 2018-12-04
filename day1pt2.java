/**
 * Created by kylel95 on 12/3/18.
 * https://adventofcode.com/2018/day/1
 * resulting frequency
 * javac day1.java
 java day1 < day1.txt > day1output.txt
 cat day1output.txt
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class day1pt2 {
    public static void main(String [] args){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = 0;
        int sum = 0;
        HashSet<Integer> freq = new HashSet<>(); //contains resulting frequency
        while(in.hasNext()){
            n = in.nextInt();
            sum += n;
            if(!freq.contains(sum)){
                freq.add(sum);
            }
            else{
                System.out.println(sum);
                break;
            }
        }
    }
}
