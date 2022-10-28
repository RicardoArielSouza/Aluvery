package br.com.racstech.aluvery.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.racstech.aluvery.model.Product
import br.com.racstech.aluvery.sampleData.sampleProducts
import br.com.racstech.aluvery.ui.components.ProductItem

@Composable
fun AllProductsScreen(products: List<Product>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        for (product in products) {
            items(products) { p ->
                ProductItem(product = p)
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun AllProductsScreenPreview() {
    AllProductsScreen(products = sampleProducts)
}