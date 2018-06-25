import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		/*Fraction fr = new Fraction(1, 2);
		
		System.out.println(fr.getNum() +"/"+fr.getDen());*/
		
		/*int ns = 5;
		Fraction[] mas = new Fraction[ns];
		/*mas[0] = new Fraction(1,2);
		mas[1] = new Fraction(3,2);
		mas[2] = new Fraction(4,2);
		mas[3] = new Fraction(5,2);
		mas[4] = new Fraction(6,2);
		
		Random rand = new Random();
		for(int i=0; i<mas.length; i++) {
			int n, d;
			n = rand.nextInt(100);
			d = rand.nextInt(100);
			mas[i] = new Fraction(n, d);
		}
		
		
		FractionAction action = new FractionAction();
		for(int i=0; i<mas.length; i++) {
			FractionFormatter.format(mas[i]);
			action.sokr(mas[i]);
			FractionFormatter.format(mas[i]);
		}
		
		Fraction f3;
		f3 = action.add(mas[0], mas[1]);
		
		FractionFormatter.format(f3);
		action.sokr(f3);
		FractionFormatter.format(f3);*/
		
		
		
		//ввод значений
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int k = 0;
		
		do {
			System.out.print("Введите размерность массива: ");
			if(sc.hasNextInt()) {
				k = sc.nextInt();
				if(k >= 0) {
					flag = true;
				} else {
					System.out.println("\nВы ввели не натуральное число.\n");
				}
			} else {
				System.out.println("\nВы ввели не натуральное число.\n");
				sc.next();
			}
		} while(!flag);
		
		Fraction array[] = new Fraction[k];
		
		for(int i = 0; i<array.length; i++) {
			boolean flagNum = false, flagDen = false;
			int n = 0, d = 0;
			
			do {
				System.out.print("Введите числитель: ");
				if(sc.hasNextInt()) {
					n = sc.nextInt();
					if(n >= 0) {
						flagNum = true;
					} else {
						System.out.println("\nВы ввели не натуральное число.\n");
					}
				} else {
					System.out.println("\nВы ввели не натуральное число.\n");
					sc.next();
				}
			} while(!flagNum);
			
			do {
				System.out.print("Введите знаменатель: ");
				if(sc.hasNextInt()) {
					d = sc.nextInt();
					if(d >= 0) {
						flagDen = true;
					} else {
						System.out.println("\nВы ввели не натуральное число.\n");
					}
				} else {
					System.out.println("\nВы ввели не натуральное число.\n");
					sc.next();
				}
			} while(!flagDen);
			
			array[i] = new Fraction(n, d);
		}
		
		//сокращение дробей массива и вывод на экран
		FractionAction action1 = new FractionAction();
		for(int i=0; i<array.length; i++) {
			action1.sokr(array[i]);
			FractionFormatter.format(array[i]);
		}

	}


}
