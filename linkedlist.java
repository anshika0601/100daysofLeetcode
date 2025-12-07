public class linkedlist {
    node head;
    private node tail;
    private int size;
    public linkedlist() {
        this.size=0;
    }
    public void insertfirst(int val) {
        node newnode=new node(val);
        newnode.next=head;
        head=newnode;
        if(tail==null)
        tail=head;
        size+=1;
    }
    public void insertlast(int val)
    {
        if(tail==null) {
            insertfirst(val);
            return;
        }
        node newnode=new node( val);
        tail.next=newnode;
        tail=newnode;
        size++;
        
    } 
    //insert using recursion
    /*  1.have a void return type and make changes in linked list
    2. node return type and return list node to change structure */ 
    public void insertrecur(int val,int index){
        head=insertrec(val,index,head);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    

    }
    private node insertrec(int value,int index,node node1) {
        if(node1==null) {
            node temp=new node(value);
            head=temp;
            return temp;

        }
        if(index==0) {
            node temp=new node(value,node1);
            size++;
            return temp;  
        }
       node1.next = insertrec(value,index--,node1.next);
       return node1;
    }

    public void insert(int val,int index) {
        node temp=head;
        if(index==0) {
            insertfirst(val);
            return;
        }
        if(index==size) {
            insertlast(val);
            return;
        }
        for(int i=1;i<index;i++) {
            temp=temp.next;
        }
        node newnode=new node(val,temp.next);
        temp.next=newnode;
        size++;

    }
    public int deletefirst() {
        int val=head.val;
        head=head.next;
        if(head==null) {
            tail=null;
        }
        size--;
        return 0;
    }
    public int deletelast() {
        if(size<=1)
        return deletefirst();
        node seclast=get(size-2);
        int val=tail.val;
        tail=seclast;
        tail.next=null;
        return 0;
    }
    public int delete(int index) {
        if(index==1) {
            deletefirst();
            return 0;
        }
        if(index==size) {
            deletelast();
            return 0;
        }
        node n=get(index);
        node p=get(index-1);
        int val=n.val;
        p.next=n.next;
        return 0;


    }
    public node get(int index) {
        node temp=head;
        for(int i=0;i<index;i++) {
            temp=temp.next;
        }
        return temp;
    }
    public void display() {
        node temp=head;
        while(temp!=null) {
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("end");
    }
 
private class node
{
    private int val;
    private node next;
   
public node(int value)
{
    this.val=value;
}
public node(int value,node next) {
    this.val=value;
    this.next=next;
}
}
public void inplacerev() {
    
    node pr=null;node cur=head;
    node next=cur.next;
    if(head==null) {
        return ;
    }
    if(cur==head && next==null) {
        return;
    }
    while(cur!=null) {
        cur.next=pr;
        pr=cur;
        cur=next;
        if(next!=null) {
            next=next.next;
        }

    }
    head=pr;

    }
    //rev a part of linked list
   /*  public void part(int s,int l) {
        node p=get(s);
        node m=get(l);
        
        m.next=null;
        node pr=null;
            node cur=p;
            node next=cur.next;
            if(cur==null)  {
                return;
            }

        while(cur!=null) {
            
            
            cur.next=pr;
            pr=cur;
            cur=next;
            if(next!=null) {
                next=next.next;
            }
        }
        node q=get(s-1);
        
        node r=get(l+1);
        if(r==null) {
            p.next=null;
        }
        else {
            p.next=r;
        }
    
        if(q==null) {
        head=m;
        }    
        else {
        q.next=m;
    }
        

    }*/
    // Method to calculate the length of the linked list
public int length() {
    int count = 0;
    node current = head;
    while (current != null) {
        count++;
        current = current.next;
    }
    return count;
}

    /*public void part(int s, int l) {
        // Check if s and l are within valid bounds and s < l
        if (s >= l || s < 0) {
            System.out.println("Invalid indices: s should be less than l, and both should be non-negative.");
            return;
        }
    
        // Retrieve the start and end nodes of the sublist
        node p = get(s);
        node m = get(l);
        
        // Check if p or m is null (out of bounds)
        if (p == null || m == null) {
            System.out.println("Invalid indices: Out of bounds.");
            return;
        }
        
        // Disconnect the sublist at the end
        m.next = null;
        
        // Initialize pointers for reversal
        node pr = null;
        node cur = p;
        node next;
        
        // Reverse the sublist from p to m
        while (cur != m.next) {
            next=cur.next;
            cur.next = pr;
            pr = cur;
            cur = next;
            
        }
    
        // Get nodes before the start and after the end of the sublist
        node q = get(s - 1);
        node r = (l + 1 < length()) ? get(l + 1) : null; // Safely handle out-of-bounds

        
        // Reconnect the reversed sublist with the remaining list
        if (r == null) {
            p.next = null;
        } else {
            p.next = r;
        }
        
        if (q == null) {
            head = m;
        } else {
            q.next = m;
        }
    }*/
    public node part(node head,int l,int r) {
        if(l==r) {
            return head;
        }
        //skip the l-1 nodes
        node cur=head;
        node pr=null;
        for(int i=0;cur!=null && i<l-1;i++) {
            pr=cur;
            cur=cur.next;
        }
        node last=pr;
        node newn=cur;
        //reverse
        node next=cur.next;
        for(int i=0;cur!=null &&i<r-l+1;i++) {
            cur.next=pr;
            pr=cur;
            cur=next;
            if(next!=null) {
                next=next.next;
            }
        }
        if(last!=null) {
            last.next=pr;
        }
        else {
            head=pr;
        }
        newn.next=cur;
        return head;

    }
    public void palindrome()
    {
        node n=head;
        int k=0;
        int mid=length()/2;
        node m=get(mid);
        if(mid%2==0) {
        node pr=null;
        node cur=get(mid);
        node next=cur.next;
        for(int i=mid;i<length()-1;i++) {
            cur.next=pr;
            pr=cur;
            cur=next;
            if(next!=null) {
                next=next.next;
            }

        }
       
        node q=get(mid-1);
        if(q==null) {
            head=pr;
        }
        else {
            q.next=pr;
        }
        while(m!=null) {
            if(n.val==m.val) {
                n=n.next;
                m=m.next;
                k++;
            } 
        }
        if(k==mid) {
            System.out.println("palindrome");
        }


    }
    else {
        node pr=null;
        node cur=get(mid);
        node next=cur.next;
        for(int i=mid;i<length()-1;i++) {
            cur.next=pr;
            pr=cur;
            cur=next;
            if(next!=null) {
                next=next.next;
            }

        }
        node q=get(mid-1);
        if(q==null) {
            head=pr;
        }
        else {
            q.next=pr;
        }
        int f=0;
        while(f!=mid) {
            if(n.val==m.val) {
                n=n.next;
                m=m.next;
                k++;
            } 
        }
        node o=get(mid-1);
        if(o==null) {
            head=pr;
        }
        else {
            o.next=pr;
        }
        while(m!=null) {
            if(n.val==m.val) {
                n=n.next;
                m=m.next;
                k++;
            } 
        }
    if(k==mid) 
    {
        System.out.println("palindrome");
    }

    }
       
    }
                                                                         

    





public void reverse(node n) {
    if(n==tail) {
        head=tail;
        return;
    }
    reverse(n.next);
    tail.next=n;
    tail=n;
    tail.next=null;

}
}
