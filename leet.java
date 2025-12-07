import java.util.ArrayList;

public class leet
{
    public static void main(String[] args) {

        System.out.println(phone("","67"));
        
    }
    static ArrayList<String> phone(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        
        int o=up.charAt(0)-'0';
         ArrayList<String> ans =new ArrayList<>();

        if(o==1) {
           
            return ans;
        }
        if(o==7||o==9) {

        
        for(int i=(o-2)*3;i<=(o-2)*3+3;i++)
        {
            char c=(char)('a'+ i);
           ans.addAll(phone(p+c,up.substring(1)));
        }
    }
        else {
            for(int i=(o-2)*3;i<=(o-2)*3+2;i++)
            {
                char c=(char)('a'+ i);
                ans.addAll(phone(p+c,up.substring(1))); } 
                

        }
        return ans;
    }
}