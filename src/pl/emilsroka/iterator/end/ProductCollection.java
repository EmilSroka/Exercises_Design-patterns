package pl.emilsroka.iterator.end;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public ProductIterator createIterator(){
    return new ProductIterator();
  }

  public class ProductIterator {
    private int position = 0;

    public boolean hasNext(){
      return position < products.size();
    }

    public Product getNext(){
      return products.get(position++);
    }
  }

}
