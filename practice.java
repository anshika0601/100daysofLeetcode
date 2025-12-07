import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import queslinkedlist.node;

public class practice {
    public  boolean isSubset(int[] a,int[] b) {
        HashSet<Integer> h=new Hashset<>();
        for(int num:a) {
            h.add(num);
        }
        for(int num:b) {
           if(! h.contains(num)) {
            return false;
           }
        }
        return true;
    }
    public Node intersection(Node a,Node b) {
        HashSet<Integer> h=new HashSet<>();
        Node r=null;
        Node h1=a;
        for(h1!=null) {
            h.add(h1.value);
            h1=h1.next;
        }
        node h2=b;
        for(h2!=null) {
            if(h.contains(h2.value)) {
                Node newNode = new Node(h2.value);
                newNode.next = result;
                result = newNode;

            }
        }
        return result;

    }
    public LinkedList<Integer> union(Node a,Node b) {
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();
        Node result=null;
        Node a1=a;
        Node a2=b;
        for(a1!=null) {
            h1.add(a1.value);
            a1=a1.next;
        }  for(a2!=null) {
            h1.add(a2.value);
            a2=a2.next;
        }
        for (int i : h1) {
            Node newNode = new Node(i);
            if (result == null) {
                result = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = tail.next;
            }
        }

        return result;

    }

static List<List<String>> findItinerary(List<List<String>> arr) {
    HashMap<String,String> h=new HashMap<>();
    HashMap<String,String> rh=new HashMap<>();

    for(List<String> i:arr) {
        h.put(i.get(0), i.get(1));
    }
    for(List<String> i:arr) {
        rh.put(i.get(1), i.get(0));
    }
    start=" "
    for(int i=0;i<arr.length;i++) {
    if(!rh.containsKey(arr.get(i).get(0))) {
        start=arr.get(i).get(0);

    }

    }
    String current = start;
        while (h.containsKey(current)) {
            List<String> temp = new ArrayList<>();
            temp.add(current);
            temp.add(h.get(current));
            ans.add(temp);
            current = h.get(current);
}
}