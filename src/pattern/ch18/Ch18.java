package pattern.ch18;

public class Ch18 {
	
	public static void main(String[] args) {
//		int a = 1, b = 2, c = 0;
//		c = ++a + b++;
//		c+=b;
//		System.out.println(c);
		
		int a = 2, b = 1, c = 0;
		
		for (;a < 5;a++) {
			if (c++ > b) {
				b = a + c;
			}
		}
		
		System.out.println(b);
		
	}
}
