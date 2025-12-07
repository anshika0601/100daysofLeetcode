public class linear {


    
    public static void main(String args[])
    {
        
        int[] a={23,7,43,9,8};
        int p=4;
       
        System.out.println("check");
        l(a, p);

        

    }


    static void l(int[] ar,int t)
    {
        if(ar.length == 0)
        System.out.println("not");




        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==t)
            {
            System.out.println("present");
            }
            }


    }


}
