package com.example.lab4

import java.util.Date

data class Information(val orderID: Int, val dateOfPurchase: Date, val status: Status, val product: String, val quantity: Int, val price: Double) {
    fun display() {
        println("Order ID: $orderID")
        println("Date of Purchase: $dateOfPurchase")
        println("Status: $status")
        println("Product: $product")
        println("Quantity: $quantity")
        println("Price: $price")
    }
}
