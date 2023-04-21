package com.genspark.SecurityDemo.controller;

import com.genspark.SecurityDemo.Entity.Item;
import com.genspark.SecurityDemo.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class MyController {
    @Autowired
    private ItemService itemService;
    @GetMapping("/public")
    public String publicUser() {
        return "<HTML><H1>I am a public user I can't do anything.</H1></HTML>";
    }
    @GetMapping("/admin")
    public String adminUser() {
        return "<HTML><H1>I am a admin user. I can see all information and delete or update items</H1></HTML>";
    }
    @GetMapping("/normal")
    public String normalUser() {
        return "<HTML><H1>I am a normal user. I can see item names and price.</H1></HTML>";
    }

    @GetMapping({"/admin/items", "/normal/items"})
    public List<Item> getItems() {
        return this.itemService.getAllItem();
    }
    @GetMapping({"/admin/items/{itemId}", "/normal/items/{itemId}"})
    public Item getItem(@PathVariable String itemId) {
        return this.itemService.getItemById(Integer.parseInt(itemId));
    }
    @PostMapping("/admin/items")
    public Item addItem(@RequestBody Item item) {
        return this.itemService.addItem(item);
    }
    @DeleteMapping("/admin/items/{itemId}")
    public String deleteItem(@PathVariable String itemId) {
        return this.itemService.deleteItemById(Integer.parseInt(itemId));
    }
    @PutMapping("/admin/items")
    public Item updateItem(@RequestBody Item item) {
        return this.itemService.updateItem(item);
    }


}
