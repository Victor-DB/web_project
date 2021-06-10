package com.example.webProject.controller;

import com.example.webProject.model.Item;
import com.example.webProject.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class ItemController {

    private static final Logger logger = LoggerFactory.getLogger(FirstPageController.class);

    @Autowired
    ItemService itemService;

    @GetMapping("/item")
    public ModelAndView item() {
        logger.info("Going to item page ");
        List<Item> data = itemService.getAllItems();
        ModelAndView modelAndView = new ModelAndView("item");
        modelAndView.getModel().put("data", data);
        return modelAndView;
    }

    // api
    @GetMapping("/getAllItems")
    public List<Item> getAllItems() {
        logger.info("Adding item to the page ");
        return itemService.getAllItems();
    }

    @PostMapping("/findItemByNumber")
    public ModelMap findItemByNumber(@RequestBody String id) {
        ModelMap map = new ModelMap();
        map.put("item", itemService.findItemByNumber(id));
        return map;
    }
}
