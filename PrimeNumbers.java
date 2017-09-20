import java.util.Iterator;
import java.util.ArrayList;

public class PrimeNumbers implements Iterator<Integer> {

  private int n = 2;
  private ArrayList<Integer> list = new ArrayList<Integer>();


  public Integer next() {



    while (!isPrime() && hasNext()) {

      list.add(n);
      n++;
    }
    list.add(n);
    int x = n;
    n++;
    return x;
  }

  public boolean hasNext() {
    return true;

  }

  public boolean isPrime() {

      for (int i = 0; i < list.size(); i++) {
        if (n % list.get(i) == 0) {
          return false;
        }
      }
    return true;
  }
}
