
public class Main {
//make the main class
	public static void main(String[] args) {
//name object-->
		Class1 e = new Class1();//Create objects e and d from Class1 blueprint Class1();
		Class2 d = new Class2();//<--Parenthesis makes Constructor(Makes the Object)
		Class1 f = new Class1();//Can be multiple objects such as e,d,f in one Class
		System.out.println(e.x);//Object .dot (e is the object)
		System.out.println(d.y);//x=2 from Class1
		System.out.println(f.z);
		e.printHi();
	}//make the object. Objects are made from the Classes. Can Have multiple Classes and
	//multiple objects.

	
}
