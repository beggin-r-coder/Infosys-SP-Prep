package Sliding_Window;

import java.util.HashMap;

public class permutationInString {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbooo";
        
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char c : s1.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0)+1);
        
        HashMap<Character, Integer> curr_freq = new HashMap<>();
        for(int i = 0; i<s1.length(); i++)
            curr_freq.put(s2.charAt(i), curr_freq.getOrDefault(s2.charAt(i), 0)+1);

        int i = 0;
        int j = s1.length()-1;
        boolean flag = false;
        while(j<s2.length()){
            if(freq.equals(curr_freq)){
                flag = true;
                break;
            }
            else{
                if(curr_freq.get(s2.charAt(i))==1)
                    curr_freq.remove(s2.charAt(i));
                else
                    curr_freq.put(s2.charAt(i), curr_freq.get(s2.charAt(i))-1);
                if(j==s2.length()-1)
                    break;
                i++;
                j++;
                curr_freq.put(s2.charAt(j), curr_freq.getOrDefault(s2.charAt(j), 0)+1);
                
            }
        }
        System.out.println(flag);
    }
}