package com.genspark.SecurityDemo.Dao;

import com.genspark.SecurityDemo.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemDao extends JpaRepository<Item, Integer> {

}
