import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class Hashset {
	 public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    String [] pair_left = new String[t];
    String [] pair_right = new String[t];
    
    for (int i = 0; i < t; i++) {
        pair_left[i] = s.next();
        pair_right[i] = s.next();
    }
    HashSet<Pair> pairs=new HashSet<>();
      for(int k=0;k<t;k++)
      {
    	  pairs.add(new Pair(pair_left[k],  pair_right[k]));
          System.out.println(pairs.size());
      }
      public static class Pair {
          String first, second;
          Pair(String first, String second) {
              this.first = first;
              this.second = second;
          }
          @Override public int hashCode() {
              return first.hashCode();
          }

          @Override public boolean equals(Object other) {
              if (other == this) {
                  return true;
              }
              if (!(other instanceof Pair)) {
                  return false;
              }
              Pair otherPair = (Pair) other;
              return (first.equals(otherPair.first) && second.equals(otherPair.second))
                  || (first.equals(otherPair.second) && second.equals(otherPair.first));
          }
}
}