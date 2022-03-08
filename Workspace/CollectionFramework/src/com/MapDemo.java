package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map m1 = new HashMap();
		//Map m2 = new Map();
		HashMap hm = new HashMap();
		hm.put(2, "Ravi");
		hm.put(1, "Ajay");
		hm.put(4, "Vijay");
		hm.put(3, "Ramesh");
		System.out.println(hm);
		System.out.println(" using key we can get the value "+hm.get(2));
		System.out.println(" using key we can get the value "+hm.get(20));
//		Set ss = hm.entrySet();// convert map to set 
//		System.out.println(ss);
//		Iterator ii	= ss.iterator();
//		while(ii.hasNext()) {
//			//Object obj = ii.next();
//			//System.out.println(obj);
//			Map.Entry mm = (Map.Entry)ii.next();
//			
//			//System.out.println(mm.getKey()+"    "+mm.getValue());
//			System.out.println(mm.getKey()+"     "+hm.get(mm.getKey()));
//		}
		Set ss =hm.keySet();
		Iterator ii = ss.iterator();
		while(ii.hasNext()) {
			Object obj = ii.next();
			System.out.println(obj+"  "+hm.get(obj));
		}
	}

}
