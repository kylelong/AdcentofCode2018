import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by kylel95 on 12/3/18.
 *
 *
 *
 * javac day2pt2.java
   java day2pt2 < day2.txt > day2output.txt
   cat day2output.txt
 */
public class day2pt2 {
    public static void main (String [] args){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        ArrayList<String> list = new ArrayList();
        String s;
        while(in.hasNext()){
            s = in.next();
            list.add(s);
        }
        String [] arr = new String[list.size()];
        arr = list.toArray(arr);
        Arrays.sort(arr);
        String s1;
        String s2;
        int curr = 0;
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            curr = i;
            s1 = arr[curr];
            for(int j = 0; j < arr.length; j++){
                s2 = arr[j];
                if(i != j && diff(s1, s2) == 1){
                    set.add(union(s1, s2));
                }
            }
        }
        Iterator i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
    public static String union(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(i)){
                sb.append(s1.charAt(i));
            }
        }
        return sb.toString();
    }
    public static int diff(String s1, String s2){
        int d = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)) {
                d++;
            }
        }
        return d;
    }
}
