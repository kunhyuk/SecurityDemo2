package com.genspark.SecurityDemo.Service;

import com.genspark.SecurityDemo.Dao.ItemDao;
import com.genspark.SecurityDemo.Entity.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemDao itemDao;

    @Override
    public List<Item> getAllItem() {
        return this.itemDao.findAll();
    }

    @Override
    public Item getItemById(int itemId) {
        Optional<Item> p = this.itemDao.findById(itemId);
        Item item = null;
        if (p.isPresent()) {
            item = p.get();
        } else {
            throw new RuntimeException("Product not found for id: " + itemId);
        }
        return item;
    }

    @Override
    public Item addItem(Item item) {
        return this.itemDao.save(item);
    }

    @Override
    public Item updateItem(Item item) {
        return this.itemDao.save(item);
    }

    @Override
    public String deleteItemById(int itemId) {
        this.itemDao.deleteById(itemId);
        return "DELETED ITEM: " + itemId;
    }
}
