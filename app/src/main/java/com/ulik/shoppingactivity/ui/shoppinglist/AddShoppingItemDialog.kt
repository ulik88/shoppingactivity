package com.ulik.shoppingactivity.ui.shoppinglist

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDialog
import com.ulik.shoppingactivity.R
import com.ulik.shoppingactivity.data.db.entities.ShoppingItem
import kotlinx.android.synthetic.main.dilaog_add_shopping_item.*

class AddShoppingItemDialog(context: Context, var addDialogListener: AddDialogListener) : AppCompatDialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dilaog_add_shopping_item)

        tvAdd.setOnClickListener{
            val name = etName.text.toString()
            val amount = etAmount.text.toString()
            if (name.isEmpty() || amount.isEmpty()){
                Toast.makeText(context, "Please enter all the information", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            }
            val item = ShoppingItem(name, amount.toInt())
            addDialogListener.onAddButtonClicked(item)
            dismiss()
        }
        tvCancel.setOnClickListener{
            cancel()
        }
    }
}