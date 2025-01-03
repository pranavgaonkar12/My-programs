package Java_Basic_Concepts;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

		public static void main(String[] args) {
			String[] friendsArray=new String[4];
			String[] friendsArray2= {"John","Chris","Eric","Luke"};
			
			ArrayList<String> friendsArrayList=new ArrayList<>();
			//array list do not have a fixed size
			//dynamically contrasts the size
			ArrayList<String> friendsArrayList2=new ArrayList<>(Arrays.asList("John","Chris","Luke"));
			//it is mutable
			//arrays cannot hold primitive or objects
			//arraylist cannot hold any objects
			ArrayList<Integer> friendsArrayList3=new ArrayList<>();
			
			System.out.println(friendsArray2[2]);//for arrays
			System.out.println(friendsArrayList.get(1));//for array list
			System.out.println(friendsArray2.length);
			System.out.println(friendsArrayList.size());
			//arrays can't add an element at the end of an array due to its fixed size
			//arraylist can easily add elements to the end
			friendsArrayList.add("Mitch");
			//set an element
			friendsArray[0]= "carl";
			friendsArrayList.set(0,"carl");
			//remove an element
			//arrays can't remove element
			friendsArrayList2.remove("John");
			
		}
}
