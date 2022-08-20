package com.blaze.os.api.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private int paymentId;
    private String paymentStatus;
    private String transactionId;

    private int orderId; //this will be passed by order service to payment service
    private double amount; //this will be passed by order service to payment service

}
