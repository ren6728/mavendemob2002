package Javaio;

import java.io.IOException;

public class PropertiesConsumer {
    static AppProperties appProperties=new AppProperties();

    public static void main(String[] args) throws IOException {
     login();
     //appProperties.getProperties();
    }

    public static void login() throws IOException {
        //System.out.println("Pass userName : " +appProperties.userName);
        //System.out.println("Pass password : " +appProperties.password);
        System.out.println("Pass userName : " + appProperties.loadProperties().getProperty("userName"));
        System.out.println("Pass password : " + appProperties.loadProperties().getProperty("password"));
    }
}
