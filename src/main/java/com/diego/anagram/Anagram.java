package com.diego.anagram;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {

  public static int StrCount(String s){
    HashMap<String, Integer> map= new HashMap<>();

    for(int i = 0; i < s.length(); i++){
      for(int j = i; j < s.length(); j++){
        char[] valC = s.substring(i, j+1).toCharArray();
        Arrays.sort(valC);
        String val = new String(valC);
        if (map.containsKey(val))
          map.put(val, map.get(val)+1);
        else
          map.put(val, 1);
      }
    }
    int pairCountString = 0;
    for(String key: map.keySet()){
      int n = map.get(key);
      pairCountString += (n * (n-1))/2;
    }
    return pairCountString;
  }
}