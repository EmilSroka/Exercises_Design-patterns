package pl.emilsroka.iterator.end;

public class Demo {
  public static void main(String[] args){
    show();
  }

  public static void show() {
    var collection = new ProductCollection();
    collection.add(new Product(1, "a"));
    collection.add(new Product(2, "b"));
    collection.add(new Product(3, "c"));

    var iterator = collection.createIterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.getNext());
    }
  }
}
