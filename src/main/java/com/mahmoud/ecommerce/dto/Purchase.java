package com.mahmoud.ecommerce.dto;

import com.mahmoud.ecommerce.entity.Address;
import com.mahmoud.ecommerce.entity.Customer;
import com.mahmoud.ecommerce.entity.Order;
import com.mahmoud.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
