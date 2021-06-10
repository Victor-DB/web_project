package com.example.webProject.helper;


import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import java.util.*;

// TestNG imports:
// import org.testng.annotations.*;
// import org.testng.Assert;

// Hamcrest imports:
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.MatcherAssert.assertThat;

import static java.util.stream.Collectors.*;

// import static org.assertj.core.api.Assertions.*;
// import static org.junit.jupiter.api.Assertions.*;
// import static org.mockito.Mockito.*;

// import org.junit.jupiter.api.*;
// import org.testng.annotations.Test;

class HelperTest {

    @Before
    String beforeTest() {
      return null;
    }


    //@org.testng.annotations.Test(invocationCount = 5)
    //@org.junit.jupiter.api.Test
    @Test
    @DisplayName("TEST: проверка символов в логине")
    void generateResult() {
//        char[] result = beforeTest().toCharArray();
//        LinkedList mockedList = mock(LinkedList.class);
        //for (char c : result) { mockedList.add(c); }
//
//        verify(mockedList).get(anyInt());
//        verify(mockedList).get(anyChar());
       // assertThat(result, everyItem(is(anyChar())));

        int min = 65;
        int max = 90;
        int length = 6;

        Random random = new Random();
        String result = "";
        boolean isResultDigit = false;
        boolean isResultLetter = false;
        boolean isResultLowerCase = false;

        for (int i = 0; i < length; i++) {
            int num = random.nextInt(9) + 1;
            int diff = max - min;
            int temp = 0;
            char c;
            String s = "";

            switch (random.nextInt(3) + 1) {
                case 1:
                    result  += String.valueOf(num);
                    isResultDigit = true;
                    break;

                case 2:
                    temp = random.nextInt(diff + 1);
                    temp += min;
                    c = (char) temp;
                    s = String.valueOf(c);
                    result  += s;
                    isResultLetter = true;
                    break;

                case 3:
                    temp = random.nextInt(diff + 1);
                    temp += min;
                    c = (char) temp;
                    c = Character.toLowerCase(c);
                    s = String.valueOf(c);
                    result  += s;
                    isResultLowerCase = true;
                    break;
            }
        }
//        boolean finalIsResultDigit = isResultDigit;
//        boolean finalIsResultLetter = isResultLetter;
//        boolean finalIsResultLowerCase = isResultLowerCase;
//        org.junit.jupiter.api.Assertions.assertAll("Должен проходить все проверки одновременно",
//                () ->   org.junit.jupiter.api.Assertions.assertTrue(finalIsResultDigit, "Содержит ли число"),
//                () ->   org.junit.jupiter.api.Assertions.assertTrue(finalIsResultLetter, "Содержит ли строку верхнего регистра"),
//                () ->   org.junit.jupiter.api.Assertions.assertTrue(finalIsResultLowerCase, "Содержит ли строку нижнего регистра")
//        );
                            //if false repeat generateResult();
        assertThat("Проверка строк", result, Matchers.anyOf(instanceOf(String.class)));
        //assertThat("Проверка чисел", result, Matchers.anyOf(instanceOf(Integer.class)));

       String[] finalResult = result.split("");
        System.out.println("finalResult " + finalResult);

//        Assertions.assertAll(
//                () -> assertThat("Содержит число", finalResult.chars().boxed().collect(toList()), everyItem(anyOf(instanceOf(Integer.class)))),
//                () -> assertThat("Содержит символ", finalResult.chars().boxed().collect(toList()), everyItem(anyOf(instanceOf(Character.class)))),
//                () -> assertThat("Содержит строку", finalResult.chars().boxed().collect(toList()), everyItem(anyOf(instanceOf(String.class))))
//        );

        //assertThat("Diiiiigggggiiiiiitttt", Arrays.asList(finalResult), everyItem(anyOf(is(instanceOf(Integer.class)))) );

    }

    @After
    void shouldGenerateResultContainsInt(){
        //charList.forEach((c) -> {mockedList.add(c); System.out.println(c);});

        //String result = generateResult();
        //Assertions.assertThat(result, list);
       //assertLinesMatch(result, containsInAnyOrder(instanceOf(Character.isLowerCase())););
        //list(result, a)
        //assertThat(result, CharacterAssert(CHARACTER)
        //assertThat(result, everyItem(anyOf(is((Object) Integer.class), is((Object) Character.class))));
    }



}