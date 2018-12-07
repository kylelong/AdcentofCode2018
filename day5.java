/**
 * Created by kylel95 on 12/5/18.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class day5 {
    public static void main(String [] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = "dabAaCBAcCcaDA";
        StringBuilder sb = new StringBuilder();
        boolean hasReacted = false;
        int pivot = 0;
        for(int i = 0; i <= s.length() - 2; i++){
          if(Character.toUpperCase(s.charAt(i)) == s.charAt(i + 1) || Character.toLowerCase(s.charAt(i)) == s.charAt(i + 1)  && hasReacted == false ){
                hasReacted = true;
                pivot = i;
                i += 2;

            }
            if(hasReacted == false || i > pivot){
                sb.append(s.charAt(i));
            }
           // dabAaCBAcCcaDA
        }
        System.out.println(sb.toString());

    }
    public static boolean isClean(String s){
        char c = ' ';
        for(int i = 0; i <= s.length() - 2; i++){
            c = s.charAt(i);
            if(s.charAt(i + 1) == Character.toUpperCase(c)){
                return false;
            }
        }
        return true;
    }
    public static boolean willReact(String s, int index){
        return Character.toUpperCase(s.charAt(index)) == s.charAt(index + 1) || Character.toLowerCase(s.charAt(index)) == s.charAt(index + 1);
    }
}
