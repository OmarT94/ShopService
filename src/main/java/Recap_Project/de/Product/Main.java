package Recap_Project.de.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductRepo productRepo = new ProductRepo();
        Product product1= new Product(1,"Laptop1",1200.20,"Dell Xps1");
        Product product2= new Product(2,"Laptop2",1200.20,"Dell Xps2");
        productRepo.add(product1);
        productRepo.add(product2);

        System.out.println("Artikel per Id Aufrufen");
        Product callProductPerID = productRepo.get(2); //call Product per ID
        System.out.println("Artikel" + callProductPerID + "wurde aufgerufen");


        System.out.println("Alle Artikel Aufrufen");
        List<Product> products = productRepo.getAll(); // Call all
        products.forEach(System.out::println);


        boolean isRemoved = productRepo.remove(1);
        System.out.println("Artikel "+ isRemoved + " wurde gelöscht");

        products = productRepo.getAll();
        System.out.println("Alle Artikel Aufrufen nach löschen");
        products.forEach(System.out::println);



    }
}