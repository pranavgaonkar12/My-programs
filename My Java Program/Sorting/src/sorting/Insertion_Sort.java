package sorting;
import java.util.*; 

public class Insertion_Sort {

	public static void main(String[] args) {
		int[] array= {3,5,6,1};
		insertionSort(array);
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public static void insertionSort(int[] inputarray) {
		for(int i=1;i<inputarray.length;i++) {
			int currentvalue=inputarray[i];
			int j=i-1;
			while(j>=0 && inputarray[j]>currentvalue) {
				
				inputarray[j+1]=inputarray[j];
				j--;
				inputarray[j+1]=currentvalue;
				//time complexity n^2
			}
		}
	}
}
