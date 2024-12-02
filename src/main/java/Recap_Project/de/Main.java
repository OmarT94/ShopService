package Recap_Project.de;

import Recap_Project.de.Order.OrderListRepo;
import Recap_Project.de.Order.OrderRecord;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        OrderListRepo orderListRepo = new OrderListRepo();

        OrderRecord order1 = new OrderRecord(1,"Baul",133);
        OrderRecord order2 = new OrderRecord(2,"Tom",115);

        orderListRepo.add(order1);
        orderListRepo.add(order2);


        //Aufrufen per Id
        OrderRecord callOrderPerId = orderListRepo.getOrder(1);
        System.out.println("Abgerufene " + callOrderPerId);

        //Aufrufen Alle Bestellungen
        List<OrderRecord> allOrders = orderListRepo.getAllOrders();
        System.out.println("Alle Bestellungen ");
        allOrders.forEach(order -> System.out.println(order));

       

        boolean isRemoved = orderListRepo.removeOrder(1);
        System.out.println("Bestellung wurde gelöscht: " + isRemoved);




        //Abrufen alle Bestellungen nach Entfernen
        allOrders = orderListRepo.getAllOrders();
        System.out.println("Alle Bestellungen ");
        allOrders.forEach(order -> System.out.println(order));


    }
}
