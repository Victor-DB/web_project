package com.example.webProject.repo;

import com.example.webProject.model.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {

    @Query("select i from Item i")
    List<Item> getAllItems();

    Item findItemByNumber(int number);

}
