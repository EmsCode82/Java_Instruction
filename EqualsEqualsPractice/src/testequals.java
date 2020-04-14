
public class testequals {

	public static void main(String[] args) {
		String a="abc";
		String b="abc";
		String d=new String("abc");
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(d==b);
		System.out.println(d==a);
	
		System.out.println(10==20);
		System.out.println('a'=='b');
		System.out.println('a'==97.0);
		System.out.println(true==true);

		String c = "abc";
		c = "def";
		System.out.println(c == "def");
		c = "abc";
		System.out.println(c == "abc");
		System.out.println(c.equals("def"));
		c = "def";
		System.out.println(c.equals("def"));
		
				
	}

}
