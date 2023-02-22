package com.mahmoud.ecommerce.controller;

import com.mahmoud.ecommerce.dto.Purchase;
import com.mahmoud.ecommerce.dto.PurchaseResponse;
import com.mahmoud.ecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

 CheckoutService checkoutService;

 public CheckoutController(CheckoutService checkoutService){
     this.checkoutService=checkoutService;
 }

 @PostMapping("/purchase")
 public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

     PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

     return purchaseResponse;
   }
}
