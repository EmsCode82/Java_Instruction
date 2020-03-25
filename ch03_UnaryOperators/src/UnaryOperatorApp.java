
public class UnaryOperatorApp {

	public static void main(String[] args) {
		int i = 0;
		// increment by 1
		i++;
		// increment by 1
		i = i+1;
		i += 1;
		// i should be 3??
		System.out.println(i);
		i = 1 + 3;
		i += 3;
		// i should be 9??
		System.out.println(i);
		
		// reduce 1 by 1
		i--;
		// should be 8

	}

}
