package org.rasulov.shoppinglist.presentation.rv

import android.util.Log
import androidx.recyclerview.widget.DiffUtil
import org.rasulov.shoppinglist.domain.ShopItem

class ShopItemDiffCallback : DiffUtil.ItemCallback<ShopItem>() {

    override fun areItemsTheSame(oldItem: ShopItem, newItem: ShopItem): Boolean =
        oldItem.id == newItem.id


    override fun areContentsTheSame(oldItem: ShopItem, newItem: ShopItem): Boolean =
        oldItem == newItem

}