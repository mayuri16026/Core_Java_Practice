package com.MapJava;
import java.util.*;

public class MyMap {

	public static void main(String[] args) {
		MyMap.myHashMap1();
		MyMap.myHashMap3();
		MyMap.myHashMap2();
		MyMap.myHashMap4();
		// TODO Auto-generated method stub
	}
       
		public static void myHashMap1()
		{
			//Map<Integer,String> map=new HashMap<Integer,String>();
			//Map<Integer,String> map=new LinkedHashMap<Integer,String>();
			
		
			TreeMap<Integer, String> map=new TreeMap<Integer,String>();
			map.put(100, "Mayuri");
			map.put(102,"Rutuja");
			map.put(103, "Aakansha");
			for(HashMap.Entry m:map.entrySet())
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
			
		}
		
		public static void myHashMap3()
		{
			
			//Map<Integer,String> map=new HashMap<Integer,String>();
			//Map<Integer,String> map=new LinkedHashMap<Integer,String>();
			TreeMap<Integer,String> map=new TreeMap<Integer,String>();
			map.put(100, "Pune");
			map.put(102,"Chennai");
			map.put(103, "Mumbai");
			
			Set<Integer> set=map.keySet();
			for(Integer key:set)
			{
				String value=map.get(key);
				System.out.println(key+" "+value);
			}
			
		}
		public static void myHashMap2()
		{
			HashMap<Integer,String> map=new HashMap<Integer,String>();
			map.put(100, "hello");
			map.put(102,"hii");
			map.put(103, "heyy");
			//transversing the map..in reverse order
			Set set=map.entrySet();
			Iterator itr=set.iterator();
			while(itr.hasNext()) {
				HashMap.Entry entry=(HashMap.Entry)itr.next();
				//converting to map.entry so that we can get key and value separately
				System.out.println(entry.getKey()+" "+entry.getValue());
		}

		}
		public static void myHashMap4()
		{
			
			HashMap<Integer,String> map=new HashMap<Integer,String>();
			map.put(100, "Harsha");
			map.put(102,"ram");
			map.put(103, "sandesh");

			for(HashMap.Entry m:map.entrySet())
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}
		
		
		
	}
	



