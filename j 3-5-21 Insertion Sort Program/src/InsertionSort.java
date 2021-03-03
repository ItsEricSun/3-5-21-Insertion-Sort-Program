import java.util.*;

public class InsertionSort {
	static Scanner sc;

	public static void main(String[] args) throws InputMismatchException {
		SortedArray a = new SortedArray(25);
		while(true) {
			sc = new Scanner(System.in);
			try {
				System.out.println("\nEnter in number for the corresponding option");
				System.out.println("1. Add integer (Max Size: 25)");
				System.out.println("2. Output mean");
				System.out.println("3. Output median");
				System.out.println("4. Output mode(s)");
				System.out.println("5. Output standard deviation");
				System.out.println("6. Clear array");
				System.out.println("7. Print all");
				System.out.println("8. End program");
				int option = sc.nextInt();
				if(option < 1 || option > 8) {
					System.out.println("Make sure input is between 1 and 8");
					continue;
				}
				if(option == 1) a.add();
				else if(option == 2) a.mean();
				else if(option == 3) a.median();
				else if(option == 4) a.mode();
				else if(option == 5) a.SD();
				else if(option == 6) a.clear();
				else if(option == 7) a.print();
				else {
					sc.close();
					System.out.println("Program ended");
					return;
				}
			} catch (InputMismatchException e) {
				System.out.println("Make sure input is an integer");
			}
		}
	}
}
