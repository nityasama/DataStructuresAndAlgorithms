package GroupAnagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList();
        }
        Map<String, List> map = new HashMap<>();
        for(String s: strs){
            int[] charCount = new int[26];
            for(int i=0;i<s.length();i++){
                charCount[s.charAt(i)-'a']++;
            }

            StringBuilder sb = new StringBuilder(" ");
            for(int j=0;j<26;j++){
                sb.append("#");
                sb.append(charCount[j]);
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key,new ArrayList());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());

    }
}
