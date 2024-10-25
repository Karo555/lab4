package com.example.lab4

abstract class User: UserInterface {
    override fun purchase() {
        println("User purchased a product")
    }
    override fun return_product() {
        println("User returned a product")
    }
}