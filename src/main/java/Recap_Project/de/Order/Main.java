package Recap_Project.de.Order;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        OrderListRepo orderListRepo = new OrderListRepo();

        OrderRecord order = new OrderRecord(1,"Tony",119);
        OrderRecord order1 = new OrderRecord(2,"Jony",120);

        orderListRepo.add(order);
        orderListRepo.add(order1);

        OrderRecord callOrder= orderListRepo.getOrder(1); //Call Order by Id
        System.out.println("Abgerufene Bestellung:");
        System.out.println(" Bestelling" +callOrder);

        List<OrderRecord> orderRecords = orderListRepo.getAllOrders(); //call all Orders
        System.out.println("Alle Bestellungen:");
        orderRecords.forEach(orderRecord -> {
            System.out.println(orderRecord);
        });

        boolean isRemoved= orderListRepo.removeOrder(1);
        System.out.println("Bestellung Löschen:");
        System.out.println("Bestellung wurde gelöscht: " + isRemoved);

        orderRecords = orderListRepo.getAllOrders();
        System.out.println("Alle Bestellungen:");
        orderRecords.forEach(orderRecord -> System.out.println(orderRecord));


    }
}
