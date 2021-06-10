package com.example.webProject.helper;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Helper {

    public String generateResult(int min, int max, int length) {

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

        if ( isResultDigit && isResultLetter && isResultLowerCase ) {
            return result;
        } else {
            return generateResult(min, max, length);
        }

    }

}
