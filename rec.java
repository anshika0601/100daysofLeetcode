import java.lang.reflect.Array;
import java.util.ArrayList;

public class rec {
    public static void main(String[] args)
    {
       // per("","abc");
        System.out.println(combinationcount("","12"));

    }
    static void func(String p,String up)
    {
        if(p.isEmpty()) {
            System.out.println(up);
            return;
        }
        if(p.startsWith("apple"))
        {
            func(p.substring(1),up+p.charAt(0));
        }
        else {
            if(p.startsWith("app")) {
                func(p.substring(3),up);
            }
            else {
                func(p.substring(1),up+p.charAt(0));
            }
        }
        
        

    }
    static void subsequence(String p,String up) {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subsequence(p+ch,up.substring(1));
        subsequence(p,up.substring(1));
    }
    static void seq(String p,String up) {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        seq(p+ch,up.substring(1));
        seq(p,up.substring(1));
        seq(p+((int)(ch+0)),up.substring(1));
    }
    static ArrayList<String> per(String p,String up) {
        if(up.isEmpty())
        {
            ArrayList<String> l=new ArrayList<String>();
            l.add(p);
            return l;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<String>();

        for(int i=0;i<=p.length();i++)
        {
           String f=p.substring(0,i);
            String e=p.substring(i,p.length());
            
            
        
          ans.addAll(per(f+ch+e,up.substring(1)));

    }
    return ans;

        }
        static ArrayList<String> combination(String p,String up)
        {
            if(up.isEmpty()) { 
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
            int ch = up.charAt(0)-'0';
            ArrayList<String> list=new ArrayList<>();
            for(int r=(ch-1)*3;r<ch*3;r++)
            {
                char m=(char)('a'+r);
               list.addAll(combination(p+m,up.substring(1)));
            }
            return list;

        }  
        
        static int combinationcount(String p,String up)
        {
            if(up.isEmpty()) { 
                
                return 1;
            }
            int count=0;
            int ch = up.charAt(0)-'0';
            ArrayList<String> list=new ArrayList<>();
            for(int r=(ch-1)*3;r<ch*3;r++)
            {
                char m=(char)('a'+r);
               count=count + combinationcount(p+m,up.substring(1));
            }
            return count;
        }







    }
    
    

