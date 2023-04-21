package com.genspark.SecurityDemo.Service;

import com.genspark.SecurityDemo.Entity.Item;


import java.util.List;

public interface ItemService {
    List<Item> getAllItem();
    Item getItemById(int itemId);
    Item addItem(Item item);
    Item updateItem(Item item);
    String deleteItemById(int itemId);
}
