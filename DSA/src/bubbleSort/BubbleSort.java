package bubbleSort;

import java.util.Arrays;

public class BubbleSort {
//    					 0   1   2    3   4   5    6   7
	static int arr[] = { 10, 3, 412, 32, 35, 999, 67, 02 };

	public int[] bubblesort(int[] a) {
		boolean flag = false;
		boolean isSorted = true;
		while(isSorted) {
			for(int i=0;i<a.length-1;i++) {
				System.out.println(i);
				if(a[i+1]<a[i]) { //Swap
					int tmp = a[i];
					a[i] = a[i+1];
					a[i+1] = tmp;
					
					System.out.println(Arrays.toString(arr));
					i -=1;
					isSorted = true;
				    
				}
				isSorted = false;
				
				
			}
			
		}
		return a;
	}

	public static void main(String args[]) {
		BubbleSort bs = new BubbleSort();
		bs.bubblesort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
}
