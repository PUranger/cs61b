public class Maximizer{
  public static OurComparable max(OurComparable[] items){
    int maxDex = 0;
    for (int i = 0; i < items.length; i += 1){
      int cmp = items[i].compareTo(items[maxDex]);
      /*In order to compare the size of each dogs, make a compareTo function inside the Dog class.
        Since we have Dog implements OurComparable, we also need to list the compareTo function inside
        the OurComparable interface.*/
      if(cmp >0){
        maxDex = i;
      }
    }
    return items[maxDex];
  }

  public static void main(String[] args){
    Dog[] dogs = {new Dog("Elyse", 3), new Dog("Sture", 9), new Dog("Artemesios", 15)};
    Dog maxDog = (Dog) max(dogs);
    maxDog.bark();
  }
}
