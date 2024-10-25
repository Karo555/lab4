package com.example.lab4

class Customer: User() {
    override fun purchase() {
        println("Customer purchased a product")
    }
    override fun return_product() {
        println("Customer returned a product")
    }
}