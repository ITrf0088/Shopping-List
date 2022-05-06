package org.rasulov.shoppinglist.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(id: Int): ShopItem

    fun getShopList(): LiveData<MutableList<ShopItem>>

    fun removeShopItem(shopItem: ShopItem)

}
