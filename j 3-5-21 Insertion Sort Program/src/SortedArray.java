import java.util.*;

public class SortedArray {
	static Scanner sc;
	public int[] array;
	public int size = 0;

	SortedArray(int s){
		array = new int[s];
	}

	void add() throws InputMismatchException {
		int input;
		if(size > 24) {
			System.out.println("Array full");
		} else {
			while(true) {
				sc = new Scanner(System.in);
				try {
					System.out.println("Input integer");
					input = sc.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Make sure input is an integer");
				}
			}
			size++;
			for(int i = 0; i < size; i++) {
				if(i == size - 1) {
					array[i] = input;
					break;
				} else if(input < array[i]) {
					for(int j = i; j < size; j++) {
						int temp = array[j];
						array[j] = input;
						input = temp;
					}
					break;
				}
			}
			System.out.println("Integer added");
		}
	}

	void mean() {
		if(size == 0) {
			System.out.println("Array Empty");
			return;
		}
		double sum = 0;
		for(int i = 0; i < size; i++) {
			sum += array[i];
		}
		System.out.println(sum / size);
	}

	void median() {
		if(size == 0) {
			System.out.println("Array Empty");
			return;
		}
		int half = size / 2;
		if(size % 2 == 1) {
			System.out.println(array[half]);
		} else {
			System.out.println((double)(array[half - 1] + array [half]) / 2);
		}
	}

	void mode() {
		if(size == 0) {
			System.out.println("Array Empty");
			return;
		}
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		ArrayList<Integer> mode = new ArrayList<>();
		int max = 1;
		for(int i = 0; i < size; i++) {
			int elem = array[i];
			if (m.get(elem) != null) {
				int count = m.get(elem);
				count++;
				m.put(elem, count);
				if(count == max) {
					mode.add(elem);
				}
				if(count > max) {
					max  = count;
					mode.clear();
					mode.add(elem);
				}
			}
			else 
				m.put(elem,1);
		}
		if(m.size() == size / max) {
			System.out.println("No integer(s) is/are the most frequently occuring");
		} else {
			for(int i = 0; i < mode.size(); i++) {
				if(i == mode.size() - 1) {
					System.out.println(mode.get(i));
				} else {
					System.out.print(mode.get(i) + ", ");
				}
			}
		}
	}

	void SD() {
		if(size == 0) {
			System.out.println("Array Empty");
			return;
		}
		double sum = 0;
		for(int i = 0; i < size; i++) {
			sum += array[i];
		}
		double average = sum / size;
		double sumDeviations = 0;
		for(int i = 0; i < size; i++) {
			sumDeviations += Math.pow(array[i] - average, 2);
		}
		System.out.println(Math.sqrt(sumDeviations / size));
	}

	void clear() {
		size = 0;
		System.out.println("Array cleared");
	}

	void print() {
		if(size == 0) {
			System.out.println("Array Empty");
			return;
		}
		for(int i = 0; i < size; i++) {
			if(i == size - 1) {
				System.out.println(array[i]);
			} else {
				System.out.print(array[i] + ", ");
			}
		}
	}
}
