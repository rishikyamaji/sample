import java.util.Scanner;

public class OperatorUse {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        double tipPercent = scan.nextInt(); // tip percentage
        double taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        double tip=(mealCost*(tipPercent/100));
        double tax=(mealCost*(taxPercent/100));
        System.out.println(tip+"tax"+tax);
        
       
      double d=mealCost+tax+tip;
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(d);
      System.out.println(totalCost);
        // Print your result
    }
}
