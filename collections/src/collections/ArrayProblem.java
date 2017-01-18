package collections;

import java.util.Arrays;

public class ArrayProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product door =new Product("door",25);
		Product chair=new Product("chair",15);
		System.out.println(door);
		System.out.println(chair);
		Product dining=new Product("diningtable",50);
		Product[] products={door,chair,dining};
		System.out.println(Arrays.toString(products));
		Product window=new Product("window",15);
		products=add(window,products);
		System.out.println(Arrays.toString(products));
	}

	private static Product[] add(Product window, Product[] products) {
		// TODO Auto-generated method stub
		int length=products.length;
		Product[] newArray=Arrays.copyOf(products, length+1);
		newArray[length]=window;
		return newArray;
	}

}
