package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar =new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		ar.add("TOM");
		ar.add(15.33);
		ar.add('M');
		System.out.println(ar.size());
		ar.remove(5);
		System.out.println(ar.size());
		System.out.println(ar.get(4));
	
for (int i=0;i<ar.size();i++) {
	System.out.println(ar.get(i));
}
		
	}}


