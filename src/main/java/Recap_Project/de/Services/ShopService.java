package Recap_Project.de.Services;

import Recap_Project.de.Order.OrderListRepo;
import Recap_Project.de.Order.OrderRecord;
import Recap_Project.de.Product.Product;
import Recap_Project.de.Product.ProductRepo;

import java.util.List;

public class ShopService {

    private final ProductRepo productRepo;
    private final OrderListRepo orderListRepo;

    public ShopService(ProductRepo productRepo, OrderListRepo orderListRepo) {
        this.productRepo = productRepo;
        this.orderListRepo = orderListRepo;
    }

    //Bestellung Aufgeben
    public void placeOrder(int orderId, String customerName, List<Integer> productsId) {
        double totalPrice = 0;

        //Überprüfen ob product existert
        for (int productId : productsId) {
            Product product = productRepo.get(productId);
            if (product == null) {
                System.out.println(productId + " Product not found");
                return;
            }
            totalPrice += product.price(); //Gesammt summe berechnen
        }

        //Wenn alle Producte existieren, dann Bestellung aufgeben!
        OrderRecord order = new OrderRecord(orderId,customerName,totalPrice);
        orderListRepo.add(order);
        System.out.println("Bestellung war erfolgreich" + order);







    }



}
