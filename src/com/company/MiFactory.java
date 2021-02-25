package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class MiFactory {

    public static Object getInstance() {

        try {
            FileReader reader = new FileReader("MiFactory.properties");

            Properties p = new Properties();
            p.load(reader);

            String name = p.getProperty("sorter");

            Class c = Class.forName("com.company." + name);

            return c.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
