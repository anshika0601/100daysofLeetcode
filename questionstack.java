import java.util.*;
import java.lang.*;
public class questionstack {
    //game of stack
            public static  class b{
            Stack<Integer> f;
            Stack<Integer> s;
            b() {
               f=new Stack<>();
               s=new Stack<>();
            }
            int p=0;
            public static int xyz(int max,int[] first,int[] second) 
            {
                return xyz(max,first,second,0,0)-1;       
            }
            private static int xyz(int max,int[] a,int[] b,int sum,int count) {
              if(sum>max) {
                return count;
              }
            
              int ans=xyz(max,,b,sum+a[0];,count+=1);
    
              int right=xyz(max,a,Arraysum+r,count+=1);
              return Math.max(ans,right);
                
            }

            
                public static void main(String[] args) {
                    Stack<Integer> q=new Stack<>();
                    Stack<Integer> w=new Stack<>();
                    q.push(1);
                    q.push(3);
                    q.push(6);
                    w.push(5);
                    w.push(2);
                    w.push(3);     
                    xyz(10,q,w);               
                    }
            
        }
        /* 
        class queue {
            private Stack<Integer> first;
            private Stack<Integer> sec;
        
            public queue() {
                first=new Stack<>();
                sec=new Stack<>();
                
            }
        
            public void insert(int item) throws Exception {
        
                first.push(item);
                }
            public int remove() throws Exception{
                while(first.isEmpty()) {
                    sec.push(first.pop());
                } 
            int remove=sec.pop();
            while(sec.isEmpty()) {
                first.push(sec.pop());
            } 
        return remove;  }
        public int peek() throws Exception {
            while(first.isEmpty()) {
                sec.push(first.pop());
            } 
        int peektop=sec.pop();
        while(sec.isEmpty()) {
            first.push(sec.pop());
        } 
        return peektop;
        
        }
        public boolean isEmpty() {
            return first.isEmpty();
        }
        
        }*/
/*class removeefficient {
    private static Stack<Integer> first;
        private Stack<Integer> sec;
    
        public removeefficient() {
            first=new Stack<>();
            sec=new Stack<>();
            
        }
    
        public void insert(int item) throws Exception {
            while(!first.isEmpty()) {
                sec.push(first.pop());
            }
            first.push(item);
            while(!sec.isEmpty()) {
                first.push(sec.pop());
            }
    
            }
        public int remove() throws Exception{
           return first.pop();
          }
    public int peek() throws Exception {
       return first.peek();
    
    }
    public boolean isEmpty() {
        return first.isEmpty();
    }
    public static void main(String[] args) throws Exception {
        removeefficient ans=new removeefficient();
        first.push(2);
        removeefficient.first.push(4);
        removeefficient.first.push(8);

    ans.insert(1);
    System.out.println(ans.remove());

    
}*/
}

