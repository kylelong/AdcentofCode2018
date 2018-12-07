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

/**
 *
  clear
 javac day1pt2.java
 java day1pt2 < day1.txt > day1output.txt
  cat day1output.txt
 */
public class day1pt2 {
    public static void main(String [] args){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = 0;
        int current = 0,  change = 0, result = 0; //current frequency, change , resultinh frequency
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>(); //to check if duplicate has been hit

        while(in.hasNext()){
            n = in.nextInt();
           list.add(n);
        }
        boolean duplicate = false;
        while(duplicate == false){
            for(int i = 0; i < list.size(); i++){
//                System.out.print("Current: " + current + " Change of: " + list.get(i));
                current += list.get(i);
                if(set.contains(current)){
                    System.out.println(current);
                    duplicate = true;
                    break;
                }
                else{
                    set.add(current);
                }
//                System.out.print(" Resulting frequency: " + current);
//                System.out.println();
            }
        }

    }
}
