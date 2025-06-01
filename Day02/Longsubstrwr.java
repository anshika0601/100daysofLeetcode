package Day02;

import java.util.HashMap;

class Longsubstrwr {
    public int lengthOfLongestSubstring(String s) {
        int l=s.length();
        int len=0;
        int left=0;
        int right=0;
        HashMap<Character,Integer> map=new HashMap();
        int i=0;
        while(right<l)  {
            if(map.containsKey(s.charAt(right))) {
                left=Math.max(map.get(s.charAt(right))+1,left);
            }
            map.put(s.charAt(right),right);
            len=Math.max(right-left+1,len);
            right++;
            
        }
      return len;
        
    }
}
