package com.example.lab4

class Admin: User() {
    override fun purchase() {
        println("Admin purchased a product")
    }
    override fun return_product() {
        println("Admin returned a product")
    }
}