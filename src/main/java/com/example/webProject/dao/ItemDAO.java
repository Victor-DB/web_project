package com.example.webProject.dao;

import com.example.webProject.model.Item;
import com.example.webProject.repo.ItemRepository;
import com.example.webProject.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class ItemDAO  {

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    ItemService itemService;

    public List<Item> getAllItems() {
        return itemRepository.getAllItems();
    }

    public Item findItemByNumber(int id) {
        return itemRepository.findItemByNumber(id);
    }
}
