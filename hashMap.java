package com.zoho;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hashMap {
    public static void main(String[] args) {

        HashMap hm = new HashMap();
        hm.put(1,"Arun");
        hm.put(2,"Sunil");
        hm.put(3,"rishi");
//        System.out.println(hm);
        hm.put(2,"roshan");
//        System.out.println(hm);

        HashMap hm1 = new HashMap();
        hm1.putAll(hm);
//        System.out.println(hm1);
//        System.out.println(hm.get(2));

//        System.out.println(hm1.containsKey(4));
//        System.out.println(hm1.containsValue("sunil"));
//        System.out.println(hm1.containsValue("roshan"));

//        System.out.println(hm1.remove(2)); // returns the value that is removed.
//        System.out.println(hm1);
//        System.out.println(hm1.remove(1,"Arun")); // returns boolean.
//        System.out.println(hm1);

        System.out.println(hm1.size());
        System.out.println(hm1.isEmpty());
        hm1.clear();
        System.out.println(hm1.isEmpty());

        // key+value = Entry.
        // Entry = unique.
        // map = pairs of object key and value.
        // set = entries.

        Set s = hm.entrySet();
        System.out.println(s);
        Collection c =hm.values();
        System.out.println(c);
        System.out.println(hm.keySet());

        Iterator i = s.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
