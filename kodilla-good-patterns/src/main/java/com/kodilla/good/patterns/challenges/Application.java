package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retvieve();

        OrderProcess orderProcess = new OrderProcess(new MailService(),
                new ProductOrderService(),
                new ProductOrderRepository());
        orderProcess.process(orderRequest);


    }

}
