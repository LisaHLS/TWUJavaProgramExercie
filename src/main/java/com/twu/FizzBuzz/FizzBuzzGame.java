package com.twu.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzGame {
    private InputReader reader = new InputReader();

    private List<String> results = new ArrayList<>();
    public List<String> getResults() {
        return results;
    }

    public void start(int count) {
        for (int i = 1; i <= count; i++) {
            results.add(replaceFizzBuzz(i));
        }
    }

    public void init() throws Exception {
        System.out.println("please input number：");
        start(Integer.parseInt(reader.read()));
        getResults().stream().forEach(item -> System.out.println(item));

    }

    public String replaceFizzBuzz(int i) {
        String result = "";
        if (i % 3 == 0) {
            result += "Fizz";
        }

        if (i % 5 == 0) {
            result += "Buzz";
        }

        if (result == "") {
            result = Integer.toString(i);
        }
        return result;

    }

}
