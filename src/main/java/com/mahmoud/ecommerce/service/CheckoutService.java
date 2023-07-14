package com.mahmoud.ecommerce.service;

import com.mahmoud.ecommerce.dto.Purchase;
import com.mahmoud.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}