package sorting;

public class bubblesort {
	
	public static void main(String[] args) {
		int[] arr= {1,7,2,4,0};
		//bubble sort
		//time complexity=)(n^2)
		for(int i=0;i<arr.length-1;i++) {//n-1
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
