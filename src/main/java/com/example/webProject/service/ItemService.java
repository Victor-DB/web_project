package com.example.webProject.service;

import com.example.webProject.controller.FirstPageController;
import com.example.webProject.dao.ItemDAO;
import com.example.webProject.model.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Service
public class ItemService {

    @Autowired
    ItemDAO itemDAO;

    private static final Logger logger = LoggerFactory.getLogger(FirstPageController.class);


    public List<Item> getAllItems() {
        return itemDAO.getAllItems();
    }

    public Item findItemByNumber(String id) {
        Item item = itemDAO.findItemByNumber(Integer.parseInt(id));
        Date date1 = item.getEditionDate();
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        Date date2 = null;
        String str = dateFormat.format(date1);
        logger.info("string {}", str);
        try {
            date2 = dateFormat.parse(str);
            logger.info("date2 {}", date2);
        } catch (ParseException e) { e.printStackTrace(); }

        item.setEditionDate(date2);
        return item;
    }
}
