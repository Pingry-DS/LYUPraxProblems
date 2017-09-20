import java.util.Iterator;
import java.lang.*;
import java.util.NoSuchElementException;

public class EvenIterator implements Iterator<Integer> {

    private int current = 0;
    private int count = -1;

    public boolean hasNext() {
       return (Math.abs(current) < 10);
    }
    public Integer next() {

      if (hasNext()) {
      count ++;
      if (count % 2 == 0) {
        return Math.abs(current);  }
      else {
        current -=2;
        return current;
      }
    }
      throw new NoSuchElementException("Only up to 10.");
    }



}
