package binarySearch;

import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch {

	static Employee[] E = { new Employee(12), new Employee(21), new Employee(14), new Employee(32), new Employee(22),
			new Employee(132), new Employee(324), new Employee(1001), new Employee(1231) };

	public Employee bs(int high, int low, int IDs) {

		

		int mid = (int) Math.floor((high + low) / 2);
		
		if (E[mid].equals(IDs)||low==high) {
			System.out.println("Found at " + mid);
			return E[mid];
		}

		else if (E[mid].ID < IDs)
			return bs(high, mid + 1, IDs);

		else {
			return bs(mid - 1, low, IDs);
			// System.out.println("else final ");
		}

	}

	public static void main(String args[]) {
		
		Arrays.sort(E);
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
		BinarySearch b = new BinarySearch();
		Employee e = b.bs(E.length - 1, 0, m);
		System.out.println("");
		System.out.print(e);
		sc.close();
		
		

	}

}
