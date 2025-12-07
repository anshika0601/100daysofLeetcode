
public class LL {
        private Node head;
        private Node tail;
        private int size;
        public LL() {
            this.size=0;
        }
    
        private class Node {
            private int val;
            private Node next;
            public Node(int value) {
                this.val=value;
            }
             
            public Node (int value,Node next) {
                this.val=value;
                this.next=next;
            }
    
        }
        void insertFirst(int val) {
            Node node=new Node(val);
            node.next=head;
            head=node;
    
            if(tail==null) {
                tail=head;
            }
                size++; 
        }
        void display() {
            Node temp;
            temp=head;
            while(temp!=null) {
                System.out.print(temp.val+"->");
                temp=temp.next;
            }
            System.out.println("END");
        }
        void insertLast(int val) {
            Node node=new Node(val);
            if(tail==null) {
                insertFirst(val);
                return;
            }
            tail.next=node;
            tail=node;
            size++;
            
        }
        void insert(int val,int pos)
        {
           
            if(pos==0) {
                insertFirst(val);
                return;
            }
            if(pos==size)
            {
                insertLast(val);
                return;
                
            }
            Node temp;
            temp=head;
            int i=0;
            while(i<pos-1) {
                                              
                temp=temp.next;
                i++;
            }
            Node node=new Node(val,temp.next);
            
            temp.next=node;
            size++;
        }
       public int deleteFirst() {
        int item=head.val;
        head=head.next;
    
            if(head==null) {
               tail=null;
            }
           size--;
           return item;
        }
        public Node find(int value) {
            Node node=head;
            while(node!=null) {
                if(node.val==value) {
                    return node;
                }
              node=node.next;
        }
        return null;
    }
        public Node get(int index) {
            Node node=head;
            for(int j=0;j<index;j++) {
                node=node.next;
            }
            return node;
        }
        public int deleteLast() {
            if(head==tail) {
               return deleteFirst();
            }
            Node seclast=get(size-2);
            int val=tail.val;
            tail=seclast;
            tail.next=null;
            return val;
               
           
        }
        public int delete(int node) {
            if(node==0) {
                 return deleteFirst();
    
            }
            if(node==size-1) {
                return deleteLast();
            }
            Node prev=get(node-1);
            Node cur=get(node);
            int item=cur.val;
            prev.next=cur.next;
    
            return item;
    
        }
    /* 
        #doubly linked list
    
        private class Node { 
            int val;
            Node next;
            Node prev;
    
            public Node(int value) {
                this.val=value;
                
            }
            public Node(int value,Node next,Node prev) {
                this.val=value;
                this.next=next;
                this.prev=prev;
            }
        }
        public void insertFirst( int value) {
            Node node=new Node(value);
            node.next=head;
            node.prev=null;
            if(head!=null) {
                head.prev=node;
            }
            head=node;
            size++;
            if(tail==null) {
                tail=head;
    
            }
        }
        public Node get(int index) {
            Node temp=head;
            for( int i=0;i<index;i++) {
                temp=temp.next;
    
            }
            return temp;
        }
        public void display() {
            Node temp=head;
            Node last=null;
            while(temp!=null) {
                System.out.print(temp.val +"-><-");
                last=temp;
                temp=temp.next;
    
            }
    
            System.out.println("end");
    
            while(last!=null) {
                System.out.println(last.val+"-><-");
                last=last.prev;
            }
            System.out.println();
        }
          /* 
        public void insertLast(int value) {
            Node node =new Node(value);
            if(head==null) {
                insertFirst(value);
                return;
            }
            Node p=get(size-1);
            p.next=node;
            node.prev=p;
            
            tail=node;
            size++;
    
        }
        public int deletefirst() {
            int value=head.val;
            head=head.next;
            head.prev=null;
            size--;
    
            return value;
        }
        public int deletelast() {
            if(head==tail) {
                deletefirst();
            }
            Node p=get(size-2);
            Node q=get(size-1);
            int value=q.val;
            q.prev=null;
            p.next=null;
            tail=p;
            size--;
            return value;
    
        }
        public void insert(int value,int pos) {
           
            
            if(pos==0) {
                insertFirst(value);
            }
            if(pos==size-1) {
                insertLast(value);
            }
           Node node=new Node(value,get(pos+1),get(pos-1));
           Node p=get(pos-1);
           Node q=get(pos+1);
           p.next=node;
           while(q!=null) {
           q.prev=node;
           }
            size++;
        }
        //circular linked list
        private class Node {
            int val;
            Node next;
        
            public Node(int value) {
                this.val=value;
            }
        }
    
        public void insert(int val) {
            Node node=new Node(val);
            if(head==null) {
                head=node;tail=node;
            return;
        }
        tail.next=node;
        node.next=head;tail=node;
    
        }
        public void display() {
            Node node=head;
            if(head!=null) {
                do {
                    System.out.println(node.val+"/");
                    node=node.next;
                } while(node!=head);
            }System.out.println();
        }
    */
        //questions
        public void duplicates() {
            Node node=head;
            while(node.next!=null) {
                if(node.val==node.next.val) {
                    node.next=node.next.next;
                    size--;
                }
                else {
                    node=node.next;
                }
            }
            tail=node;
            tail.next=null;
        }
        public void duplicate2() {
            Node node=head;
            int i=0;
            while(node.next!=null) {
                
                if(node.val==node.next.val) {
                    get(i).next=node.next.next;
                    }
                    
                else {
                    node=node.next;
                    i++;
                }
                
                }
                    
                
                tail=node;
                tail.next=null;
            }
        public static LL merge(LL f, LL s) {
            Node a=f.head;
            Node b=s.head;
            LL ans=new LL();
            while(a!=null && b!=null) {
            if(a.val==b.val ||a.val<b.val) {
                ans.insertLast(a.val);
                a=a.next;
            }
            else {
    
                ans.insertLast(b.val);
                b=b.next;
            } 
        }
            while(a!=null) {
                ans.insertLast(a.val);
                a=a.next;
    
            }
            while(b!=null) {
                ans.insertLast(b.val);
                b=b.next;
    
            }
        
        return ans;
    }
    public boolean check ( ) {
        Node f=head;
        Node s=head;
        while(f!=null &&f.next!=null) {
           
            f=f.next.next;
            s=s.next;
            if(f==s) {
                return true;
        }
        
    }
    return false;
    

}

public void lengthcycle() {
    Node f=head;
    Node s=head;
    while(f!=null &&f.next!=null) {
       
        f=f.next.next;
        s=s.next;
        int k=0;
        if(f==s) {
           Node temp=s;
        do {
            temp=temp.next;
            k++;
        }while(temp==s);
    } }
    
}
public int happy(int s) {
    int k=0;
    while(s!=0) {
    int a=s%10;
    k=k+a^2;
    s=s/10;
    
 }
 return k;


}
public boolean happyno(int x) {
    int f=x;
    int s=x;
    do {
        s=happy(s);
        f=happy(happy(f));
    }while(f!=s);
    if(s==1) {
        return true;
        
    }
    else { return false;}


}
//find mid of ll
public void mid() {
    Node s=head;
    Node f=head;
    while(f!=null&& f.next!=null) {
        f=f.next.next;
        s=s.next;
    }
    System.out.println(s.val);
}




    public static void main(String[] args) {
        LL list1=new LL();
        LL list2=new LL();
        list1.insertLast(1);
        list2.insertLast(1);
        list1.insertLast(2);
        list2.insertLast(4);
        list1.insertLast(4);
        list2.insertLast(5);
        list1.insertLast(10);
        list1.insertLast(7);
        list1.mid();
        list1.display();
        list1.duplicate2();
        System.out.println(list1.check());
        list2.display();
        LL ANS=merge(list1,list2);
        ANS.display();
        ANS.duplicates();;
        ANS.display();
        ANS.mid();
    }

}





 
