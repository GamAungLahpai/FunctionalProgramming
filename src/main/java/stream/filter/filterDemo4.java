package stream.filter;

import java.util.ArrayList;
import java.util.List;

class Product {
    int id;
    String name;
    double price;

    public Product(int id,String name,double price){
        this.id =id;
        this.name=name;
        this.price=price;
    }


}

public class filterDemo4 {
    static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"HP laptop",25000));
        productList.add(new Product(2,"Dell Laptop",30000));
        productList.add(new Product(2,"LenovoLaptop",28000));
        productList.add(new Product(2,"Sony Laptop",23000));
        productList.add(new Product(2,"Macbook ",900000));

        productList.stream()
                .filter(p-> p.price > 25000)
                .forEach(pr -> System.out.println(pr.price));

    }
}
