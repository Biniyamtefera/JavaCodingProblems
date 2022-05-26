package StreamJava8IQ;

import java.util.ArrayList;
import java.util.List;

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name,double price) {
        this.id= id;
        this.name = name;
        this.price = price;
    }
}

public class FilterObject {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList();
        productsList.add(new Product(1, "HP Laptop",2500));
        productsList.add(new Product(2, "apple Laptop",1500));
        productsList.add(new Product(3, "Accer Laptop",200));
        productsList.add(new Product(4, "Lenovo Laptop",500));
        productsList.add(new Product(5, "Asuz Laptop",1000));
        /**
         * We want to add product which has price more than 100 and add another collection or print the price
         */

        productsList.stream().filter(e ->e.price > 1000 ).forEach(p -> System.out.println(p.price));


    }
}
