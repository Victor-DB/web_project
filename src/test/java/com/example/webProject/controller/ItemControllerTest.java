package com.example.webProject.controller;

import com.example.webProject.model.Item;
import com.example.webProject.repo.ItemRepository;
import com.example.webProject.service.ItemService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import java.util.Arrays;
import java.util.Date;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;  // приходиться руками прописывать!
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import  org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

//@RunWith(SpringRunner.class)
@ExtendWith(SpringExtension.class)
@WebMvcTest(ItemController.class)
@AutoConfigureMockMvc
public class ItemControllerTest {

    @Autowired
    public MockMvc mockMvc;

    @MockBean
    public ItemRepository repo;

    @MockBean
    public ItemService service;

    @Test
    @Disabled  //пропустить тесты
    void getAllItems() throws Exception {
        // иммитация выгрузки из бд:
        when(service.getAllItems()).thenReturn(Arrays.asList(
                new Item(1, "cake1", 2500, "1 kg", "../icons/tort_berries", new Date(), new Date()),
                new Item(2, "cake2", 3500, "1,5 kg", "../icons/tort_berries", new Date(), new Date())
        ));
        // когда вызовется этот метод, данные из блока выше сюда подставятся
        mockMvc.perform(get("/getAllItems")
                    .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())                                                      // проверяем статус запроса
                .andExpect(jsonPath("$", hasSize(2)))                                  // проверяем количество объектов в json
                .andExpect(jsonPath("$[*].num", containsInAnyOrder(1,2)))      // проверяем наличие значений 1 и 2 в объектах json
                //.andExpect(jsonPath("$[*].num", Matchers.is(1)))  // сравнение по одному
                .andExpect(jsonPath("$[*].amount", containsInAnyOrder("1 kg", "1,5 kg")));     // .andReturn().getResponse().getContentAsString();
    }

    @Test
    @Disabled
    void findItemByNumber() throws Exception {

//        when(service.findItemByNumber("1")).thenReturn(
//                new Item(1,1, "cake1", 2500, "1 kg", "../icons/tort_berries", new Date(), new Date())
//        );
//
//        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
//        //params.add("id", id);
//
//        MockHttpServletRequestBuilder request = post("/findItemByNumber")
//                .contentType(MediaType.APPLICATION_JSON)
//                //.accept(MediaType.APPLICATION_JSON)
//                //.characterEncoding("UTF-8")
//                //.params(params)
//        ;
//
//        mockMvc.perform(request)
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$[*].num", equalTo(1)))
//                .andExpect(jsonPath("$[*].amount", equalTo("1 kg")))
//                .andDo(print());
    }
}