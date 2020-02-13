package com.ulik.shoppingactivity.data.repositories

import com.ulik.shoppingactivity.data.db.ShoppingDatabase
import com.ulik.shoppingactivity.data.db.entities.ShoppingItem

class ShoppingRepository(
    private val db: ShoppingDatabase
) {
    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingitems() = db.getShoppingDao().getAllShoppingItems()
}