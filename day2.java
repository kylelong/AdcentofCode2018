import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by kylel95 on 12/3/18.
 */
public class day2 {
    public static void main(String [] args){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s;
        int two = 0;
        int three = 0;
        while(in.hasNext()){
            s = in.next();
            two += twoCount(s);
            three += threeCount(s);

        }
        System.out.println(two * three);
    }
    public static int twoCount(String s){
       char [] arr = s.toCharArray();
       HashMap<Character, Integer> map = new HashMap<>();
       Arrays.sort(arr);
       for(int i = 0; i < arr.length; i++){
           if(!map.containsKey(arr[i])){
               map.put(arr[i], 1);
           }
           else{
               map.put(arr[i], map.get(arr[i]) + 1);
           }
       }
       for(Character c: map.keySet()){
           if(map.get(c) == 2){
               return 1;
           }
       }
       return 0;
    }
    public static int threeCount(String s){
        char [] arr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            else{
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        for(Character c: map.keySet()){
            if(map.get(c) == 3){
                return 1;
            }
        }
        return 0;
    }
}
