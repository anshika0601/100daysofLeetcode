import java.util.*;
//hashmap(allow null key,values) is not synchronised while hashtable(does not allow null key,values) is synchronized for threads

import javax.swing.text.html.parser.Entity;

public class usinghash {
    private Entity[] entities;
   public usinghash() {
    entities=new Entity[100];
   }
   public void put(String key,String value) {
    int hash=Math.abs(key.hashCode()%entities.length);
    entities[hash]=new Entity(key, value)//overriding
   }
   public void get(String key) {
    int hash=Math.abs(key.hashCode()%entities.length);
    if(entities[hash]!=null && entities[hash].key.equals(key)) {
        return entities[hash].value;
    }
    return null;
   }
   public void remove(string key) {
    int hash=Math.abs(key.hashCode()%entities.length);
    if(entities[hash]!=null && entities[hash].key.equals(key)) {
        entities[hash]=null;

   }
   private class Entity {
    String key;
    String value;
    public Entity(String key,String value) {
        this.key=key;
        this.value=value;
    }
   }

}
public class hashmap {
    public static void main(String args[]) {
    HashMap<String,Integer> map=new TreeMap<>();
    map.put("kunal",89); 
    map.put("karan",99); 
    map.put("kbc",90);

    System.out.println(map.get("karan")); 
    System.out.println(map.getOrDefault("Aporva",98));
    
    HashSet<Integer> set=new HashSet<Integer>();
    set.add(56);
    set.add(26);
    set.add(46);
    set.add(6);
    
    set.add(56);
    System.out.println(set);
}
}

