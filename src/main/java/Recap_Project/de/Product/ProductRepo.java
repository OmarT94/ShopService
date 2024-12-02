package Recap_Project.de.Product;


import Recap_Project.de.Product.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private final List<Product>products;

    public ProductRepo() {
        this.products = new ArrayList<Product>();
    }

    public void add(Product product) {
        products.add(product);
    }

    public boolean remove(int productId) {
        return products.removeIf(product -> product.id()==productId );
    }

    public Product get(int productId) {
        return products.stream().filter(product -> product.id()==productId).findFirst().orElse(null);
    }

    public List<Product> getAll() {
        return new ArrayList<>(products);
    }


    public List<Product> getProducts() {
        return products;
    }
}
