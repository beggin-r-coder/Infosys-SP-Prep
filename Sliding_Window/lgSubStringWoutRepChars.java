package Sliding_Window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class lgSubStringWoutRepChars {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int max = 0;

        //Using List
        List<Character> list = new ArrayList<>();
        for(char c : str.toCharArray()){
            if(!list.contains(c))
                list.add(c);
            else{
                while(list.contains(c))
                    list.remove(0);
                list.add(c);
            }
            max = Math.max(max, list.size());
        }
        System.out.println(max);

        //Using Hash Set
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        for(char c : str.toCharArray()){
            if(!set.contains(c))
                set.add(c);
            else{
                while(set.contains(c)){
                    set.remove(str.charAt(left));
                    left++;
                }
                set.add(c);
            }
            max = Math.max(max, set.size());
        }
        System.out.println(max);

        //Using HashMap
        HashMap<Character, Integer> map = new HashMap<>();
        int left_map = 0;
        int curr_len = 0;
        for(int right = 0; right<str.length(); right++){
            if(!map.containsKey(str.charAt(right)))
                map.put(str.charAt(right),right);
            else{
                left_map = Math.max(map.get(str.charAt(right)) + 1, left_map);
                map.put(str.charAt(right), right);
            }
            curr_len = right - left_map + 1;
            max = Math.max(max, curr_len);
        }
        System.out.println(max);
    }
}
