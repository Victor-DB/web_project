package com.example.webProject.controller;

import com.example.webProject.model.User;
import com.example.webProject.service.FirstPageService;
import com.example.webProject.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

//@RequestMapping("/files/*")
@RestController
public class FirstPageController {

        @Autowired
        FirstPageService firstPageService;

        @Autowired
        ItemService itemService;

        private static final Logger logger = LoggerFactory.getLogger(FirstPageController.class);

        @GetMapping("/top")
        public ModelAndView top() {
                logger.info("Going to top page ");
                return new ModelAndView("top");
        }

        @GetMapping("/main")
        public ModelAndView main() {
                logger.info("Going to main page");
                return new ModelAndView("main");
        }


        @GetMapping("/lkEntrance")
        public ModelAndView lkEntrance() {
                logger.info("Going to lkEntrance page");
                return new ModelAndView("lkEntrance");
        }

        @GetMapping("/first")
        public ModelAndView first() {
                logger.info("Going to first page");
                return new ModelAndView("first");
        }

        @GetMapping("/nature")
        public ModelAndView nature() {
                logger.info("Going to nature page");
                return new ModelAndView("nature");
        }

        @GetMapping("/coupon")
        public ModelAndView coupon() {
                logger.info("Going to nature page");
                return new ModelAndView("coupon");
        }



}


