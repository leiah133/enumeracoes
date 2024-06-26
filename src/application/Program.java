package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYAMENT);
        System.out.println(order);
        //conmversao do string para enum
        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.SHIPPED;
        OrderStatus os3 = OrderStatus.PROCESSING;
        OrderStatus os4= OrderStatus.valueOf("DELIVERED");
        OrderStatus os5= OrderStatus.valueOf("SHIPPED");
        OrderStatus os6= OrderStatus.valueOf("PROCESSING");

        System.out.println(os1);
        System.out.println(os2);
        System.out.println(os3);
        System.out.println(os4);
        System.out.println(os5);
        System.out.println(os6);
    }
}
