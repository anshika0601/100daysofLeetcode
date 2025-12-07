import java.util.*;
public class program2 { 
    String even(String s,int l) {
        

        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(0,l/2));
        sb.reverse();
        sb.append(s.substring(l/2,l));
        sb.reverse();
        return sb.toString();

    }
    String odd(String s,int l) {
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(l-1));
        for(int i=0;i<l-1;i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        program2 p=new program2();
        Scanner in=new Scanner(System.in);
        String sc=in.nextLine();
        int l=sc.length();
        for(int i=0;i<l;i++) {
            if(i==' ') {
                if((i+1)%2==0) {
                    System.out.println(p.even(sc.substring(0,i),i));
                    
                }
                else {
                    System.out.println(p.odd(sc.substring(0,i),i));
                }
            }
        }
    }
}
       

