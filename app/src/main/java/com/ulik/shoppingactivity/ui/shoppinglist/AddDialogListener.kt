package com.ulik.shoppingactivity.ui.shoppinglist

import com.ulik.shoppingactivity.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)

}