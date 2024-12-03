package Recap_Project.de.Services;

import Recap_Project.de.Order.OrderListRepo;
import Recap_Project.de.Product.Product;
import Recap_Project.de.Product.ProductRepo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialisieren der Repositories
        ProductRepo productRepo = new ProductRepo();
        OrderListRepo orderRepo = new OrderListRepo();

        // Hinzufügen von Produkten zum Produkt-Repo
        productRepo.add(new Product(1,"Laptp", 5,"Dell 17"));
        productRepo.add(new Product(2,"Laptp", 10,"Dell 17"));
        productRepo.add(new Product(3,"Laptp", 15,"Dell 17"));

        // Initialisieren des ShopService
        ShopService shopService =new ShopService(productRepo,orderRepo);
        // Bestellung mit existierenden Produkten
        shopService.placeOrder(1, "Alice", List.of(1));// 1 = Product index 1


        // Bestellung mit einem nicht existierenden Produ
        shopService.placeOrder(2, "Bob", List.of(2));

        // Bestellung mit allen existierenden Produkten
        shopService.placeOrder(3, "Charlie", List.of(3));


        // Alle Bestellungen ausgeben
        System.out.println("Alle aufgegebenen Bestellungen:");
        orderRepo.getAllOrders().forEach(order -> System.out.println(order));

















    }
}
