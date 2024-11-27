package oops.Over.java;

import java.util.HashMap;
import java.util.Map;

public class maxOccurenceOfCharacter {
    public static void main(String[] args) {
        String s="success";
        Map<Character,Integer> hm=new HashMap<>();
        for(char ch:s.toCharArray()) {
//            if (!hm.containsKey(ch)) {
//                hm.put(ch, 1);
//            } else {
//                hm.put(ch, hm.get(ch) + 1);
//            }
                hm.put(ch,hm.getOrDefault(ch,0)+1);
            }

        char maxChar='\0';
        int maxInt=0;
        for(Map.Entry<Character,Integer>s1:hm.entrySet()){
            if(s1.getValue()>maxInt){
                maxInt=s1.getValue();
                maxChar=s1.getKey();
            }

        }
        System.out.println(maxChar + "   "+maxInt);
    }
}
