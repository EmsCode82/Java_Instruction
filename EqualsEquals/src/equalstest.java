
public class equalstest {

	public static void main(String[] args) {
		
		// Equal Reference Objects and Values
		String a = "1";
		String b = "1";
		String c = "1";
		String d = "1";
		String e = "1";
		String f = "1";
		String g = "1";
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a==d);
		System.out.println(a==e);
		System.out.println(a==f);
		System.out.println(a==g);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(a.equals(e));
		System.out.println(a.equals(f));
		System.out.println(a.equals(g));
		
		// All return true 
		
		// Different Reference Objects and Values
		String a1 = "1";
		String b1 = "2";
		String c1 = "3";
		String d1 = "4";
		String e1 = "5";
		String f1 = "6";
		String g1 = "7";
		System.out.println();
		System.out.println(a1==b1);
		System.out.println(a1==c1);
		System.out.println(a1==d1);
		System.out.println(a1==e1);
		System.out.println(a1==f1);
		System.out.println(a1==g1);
		System.out.println(a1.equals(b1));
		System.out.println(a1.equals(c1));
		System.out.println(a1.equals(d1));
		System.out.println(a1.equals(e1));
		System.out.println(a1.equals(f1));
		System.out.println(a1.equals(g1));
		System.out.println();
		
		// All return false
		
		// Different Reference Objects but Equal Values
		String a2 = new String ("1");
		String b2 = new String ("1");
		String c2 = new String ("1");
		String d2 = new String ("1");
		String e2 = new String ("1");
		String f2 = new String ("1");
		String g2 = new String ("1");
		System.out.println(a2==b2);
		System.out.println(a2==c2);
		System.out.println(a2==d2);
		System.out.println(a2==e2);
		System.out.println(a2==f2);
		System.out.println(a2==g2);
		System.out.println(a2.equals(b2));
		System.out.println(a2.equals(c2));
		System.out.println(a2.equals(d2));
		System.out.println(a2.equals(e2));
		System.out.println(a2.equals(f2));
		System.out.println(a2.equals(g2));
        System.out.println();
        
        // Reference Objects return False for equality but True for Values        
        
		// Different Reference Objects and Values
		String a3 = new String ("1");
		String b3 = new String ("2");
		String c3 = new String ("3");
		String d3 = new String ("4");
		String e3 = new String ("5");
		String f3 = new String ("6");
		String g3 = new String ("7");
		System.out.println(a3==b3);
		System.out.println(a3==c3);
		System.out.println(a3==d3);
		System.out.println(a3==e3);
		System.out.println(a3==f3);
		System.out.println(a3==g3);
		System.out.println(a3.equals(b3));
		System.out.println(a3.equals(c3));
		System.out.println(a3.equals(d3));
		System.out.println(a3.equals(e3));
		System.out.println(a3.equals(f3));
		System.out.println(a3.equals(g3));

		// All return False for Object Reference and Values
	}

}
