package sorting;

public class Selection_sort {
	
	public static void main(String[] args) {
		int[] arr= {1,7,2,4,0};
		
		for(int i=0;i<arr.length;i++) {
			int smallest=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;
				}
			}
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
	}
  }
}
	

