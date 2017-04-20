package org.xiao.patterns.ch10template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 咖啡类的钩子
 *
 * @author BaoQiang
 * @version 2.0
 * @create at 2017/2/20 20:48
 */
public class CoffeeWithHook extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("coffee with hook brew");
    }

    @Override
    void addCondiments() {
        System.out.println("coffee with hook add condiments");
    }

    @Override
    boolean customWantsCondiments() {
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }


    public String getUserInput() {
        String answer = null;

        System.out.println("Would you like milk and sugar with coffee(y/n)?");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (answer == null) {
            answer = "no";
        }
        return answer;
    }
}
