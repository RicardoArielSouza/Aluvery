package br.com.racstech.aluvery.sampleData

import br.com.racstech.aluvery.R
import br.com.racstech.aluvery.model.Product
import java.math.BigDecimal


val sampleProducts = listOf(
    Product(
        name = "Hamburguer",
        price = BigDecimal("12.99"),
        image = R.drawable.burger
    ),
    Product(
        name = "Pizza",
        price = BigDecimal("19.99"),
        image = R.drawable.pizza
    ),
    Product(
        name = "Batata-Frita",
        price = BigDecimal("7.99"),
        image = R.drawable.fries
    )
)