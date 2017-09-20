import java.util.Iterator;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Fibonnacci implements Iterator<Integer> {

  private int n0 = 0;
  private int n1= 1;
  ArrayList<Integer> list = new ArrayList<Integer>();
  private int count = 0;

  public Integer next() {
    if (hasNext()) {
    if (count == 0){
      list.add(n0);
      list.add(n1);
    }
      int x = list.get(count) + list.get(count + 1);
      list.add(x);
      count ++;
      return x;
  }
  throw new NoSuchElementException("Only up to 20 elements.");
}
  public boolean hasNext() {
    return (count < 20);
  }



}
