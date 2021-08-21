package collectionexamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;

public class ArrayListExamples {

	public static void main(String[] args) {
		int a = 1;
		int b[] = { 1, 2, 3 };
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		// ArrayList obj= new ArrayList();
		// LinkedList obj=new LinkedList();
		HashSet<String> obj = new HashSet<String>();
		// LinkedHashSet obj=new LinkedHashSet();
		// TreeSet obj=new TreeSet();
		// Stack obj=new Stack();

		obj.add("RajeshR");
		obj.add("RajeshA");
		obj.add("duplicate");
		obj.add("duplicate");
		obj.add("Babu");
		obj.add("RajeshD");
		obj.add("Babu");

		// obj.push("Training");

		System.out.println(obj);
		
		  for(String m : obj)
		  { 
			  System.out.println(m);
		  }
		 

		Iterator iter = obj.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("##################################################");
		System.out.println("################Remove###");

		obj.remove("duplicate");

		// obj.pop();
		System.out.println("##################################################");

		Iterator iter1 = obj.iterator();
		while (iter1.hasNext()) {
			System.out.println(iter1.next());
		}

	}

}
