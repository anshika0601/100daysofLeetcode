public class contestpractice {
    
        public long calculateScore(String[] instructions, int[] values) {
            int score=0;
            HashMap<Integer,String> map=new HashMap<>();
            
            for(int i=0;i<values.Size();i++) {
                String s=instructions[i];
                int v=values[i];
                if(map.containskey(i)) {
                    return score;
                }
                
                if(instructions[i].equals("add"))  {
                    score=score+values[i];

                }
                if(instructions[j].equals("jump")) {
                    i=i+values[i];
                }
                map.put(i,s);
            }
            
        }
    
    
}
