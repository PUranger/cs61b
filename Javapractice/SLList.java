/** An SLList is a list of integers, which hides the terrible truth
  * of the nakedness within. */
/** SLList is easier to instantiate(no need to specify null). */
public class SLList {
  private IntNode first;
/** Define a nested class - IntNode */
  private static class IntNode {
    public int item;
    public IntNode next;
    public IntNode(int i, IntNode n) {
      item = i;
      next = n;
    }
  }

  public SLList(int x) {
    first = new IntNode(x,null);
  }

//  public static void main(String[] args) {
//    /* Creates a list of one integer, namely 10 */
//    SLList L = new SLList(10);
//  }

  /** Adds x to the front of the list. */
  public void addFirst(int x) {
    first = new IntNode(x, first);
  }

  /** Returns the first item in the list. */
  public int getFirst() {
    return first.item;
  }

  /** Adds an item to the end of the list. */
  public void addLast(int x) {
    IntNode p = first;
    /** Move p until it reaches the end of the list. */
    while (p.next != null) {
      p = p.next;
    }
    p.next = new IntNode(x,null);
  }

/** Return the size of the list using integration method
  public int size2() {
    int i = 1;
    while (first.next != null) {
      i = i+1;
      first = first.next;
    }
    return i;
  }
*/

/** Returns the size of the list taht starts at IntNode p. */
  private static int size(IntNode p) {
    if (p.next == null) {
      return 1;
    }
    return 1 + size(p.next);
  }

  public int size() {
    return size(first);
  }

  public static void main (String[] args) {
    /* Creates a list of one integer, namely 10 */
    SLList L = new SLList(15);
    L.addFirst(10);
    L.addFirst(5);
    L.addLast(20);
    System.out.println(L.getFirst());
    System.out.println(L.size());
    //System.out.println(L.size2());
  }
}
