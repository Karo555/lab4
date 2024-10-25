package com.example.lab4

class Shoes(
    override val name: String,
    override val price: Double,
    override val description: String,
    override val image: Int,
    override val category: String,
    override val rating: Float,
    override val reviews: Int,
    override val stock: Int,
    override val id: Int,
    override val brand: String,
    override val color: String,
    override val size: String,
    override val weight: Double,
    override val material: String,
    private val type: String,
    private val sport: String
) : Product() {
    override fun toString(): String {
        return "Shoes(name='$name', price=$price, description='$description', image=$image, category='$category', rating=$rating, reviews=$reviews, stock=$stock, id=$id, brand='$brand', color='$color', size='$size', weight=$weight, material='$material', type='$type', sport='$sport')"
    }
}