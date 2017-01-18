package Packages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,6,5};
		
		System.out.println(Arrays.toString(a));//to print the array with out using forloop
        Arrays.sort(a);//to sort the array
        System.out.println(Arrays.toString(a));
       
        String[] stringArray = { "a", "b", "c", "d", "a" };//converting Array into list
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
        System.out.println(arrayList);
        Set<String > arraySet =new HashSet<>(Arrays.asList(stringArray));
        System.out.println(arraySet);
        
        String[] s={"o","c","b","a","f"};
        boolean b= Arrays.asList(s).contains("k");//to know the element is there are not inn array
        System.out.println(b);
//        int[] intArray = { 1, 2, 3, 4, 5 };
//        int[] intArray2 = { 6, 7, 8, 9, 10 };
//        // Apache Commons Lang library
//        int[] combinedIntArray = ArraysUtils.addAll(intArray, intArray2);
//     // containing the provided list of elements
//     // Apache common lang
//     String j = StringUtils.join(new String[] { "a", "b", "c" }, ", ");
//     System.out.println(j);
//     // a, b, c
      int[] array ={1,2,3,4,5,6,7,8};
    System.out.println(array.length);
         
	}

}
