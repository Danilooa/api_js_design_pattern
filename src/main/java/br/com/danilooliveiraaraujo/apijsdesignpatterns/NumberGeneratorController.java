package br.com.danilooliveiraaraujo.apijsdesignpatterns;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class NumberGeneratorController {

    @GetMapping("/numbergenerator")
    public Integer[] generateNumbers() {
        Random random = new Random();
        Integer arraySize = random.nextInt(50) + 1;
        Integer[] numbers = new Integer[arraySize];
        for (Integer i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000) + 1;
        }
        return numbers;
    }
}
