
public class Main2 {
	
	public static void main(String[] args) {
		Object o = new Object();
		
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(1, 2);
		
		if(f1.equals(f2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		
		Object o1 = new Fraction(1, 2);
		Object o2 = new Fraction(1, 2);
		
		
		if(o1.equals(o2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	
	}

}
