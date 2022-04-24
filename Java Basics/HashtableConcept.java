package JavaBasics;

import java.util.Hashtable;

public class HashtableConcept {

	public static void main(String[] args) {
	Hashtable h = new Hashtable();
	h.put("A", "test");
	h.put("B","Hello");
	h.put("C","WORLD");
	System.out.println(h.size());
	h.put(1, 100);
	h.put(2,200);
	System.out.println(h.size());
h.remove(1);
System.out.println(h.size());
System.out.println(h.get("A"));
System.out.println(h.get(2));
	}

}
