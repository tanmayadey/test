package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new test().sortMethd();
		//ghjgj
		System.out.println( "");

	}
	
	public void method() {
		
		String s = "1,2,3,4,2,3,6,5,7,4,5,9,1,11,2,4";
		
		String[]  sArray= s.split(",");
		HashMap<Integer,String> map= new HashMap();
		ArrayList alist = new ArrayList();
		int key = 0;
		for (String str: sArray) {
			alist.add(str);
		}

    }
	
	
	
	public void sortMethd() {
		String [] arr = {"TGC1678976543214567","TGC101678976543214567","TGC71678976543214567","TGC56751678976543214567","TGC1678976543214567","TGC123341678976543214567",
				"TGC901678976543214567","TGC101678976543214567","TGC901678976543214567","TGC1678976543214567","TGC51678976543214567","TGC101678976543214567","TGC11678976543214567","TGC16789765432145677","TGC56716789765432145675","TGC116789765432145672334","TGC167897654321456790","TGC167897654321456710","TGC167897654321456790","TGC16789765432145675"};
		List<String> unsrtList = Arrays.asList(arr);
		
		List<String> srtList = unsrtList.stream().map(s->s.substring(4, 14)).collect(Collectors.toList());
		HashSet<String> dupSet = new HashSet<String>();
		HashSet<String> uniqueSet = new HashSet<String>();
		
		for(String str : srtList) {			
			if(!uniqueSet.add(str)){
					dupSet.add(str);
			}
		}
		
		HashMap mp = new HashMap(2);
		mp.put(1, "hkj");
		mp.put(2, "hkj");
		mp.put(3, "hkj");
		
		System.out.println("Unique Value --- > "+uniqueSet);
		System.out.println("Duplicate Value ---- > "+dupSet);
		
	}
	
}
