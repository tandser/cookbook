package ru.tandser.cookbook;

import org.apache.camel.spring.Main;

public class CookBookSample {

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.setApplicationContextUri("META-INF/spring/config.xml");
        main.run(args);
    }
}