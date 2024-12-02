package Recap_Project.de.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo {
    private final List<OrderRecord> orders;

    public OrderListRepo() {
        this.orders = new ArrayList<>();
    }

    public  void add(OrderRecord order) {
        orders.add(order);
    }

    public boolean  removeOrder(int orderId) {
        return orders.removeIf(orderRecord -> orderRecord.id() == orderId);
    }

    public OrderRecord getOrder(int orderId) {
        return orders.stream().filter(orderRecord -> orderRecord.id() == orderId).findFirst().orElse(null);
    }

    public  List<OrderRecord> getAllOrders() {
        return new ArrayList<>(orders);
    }
}
