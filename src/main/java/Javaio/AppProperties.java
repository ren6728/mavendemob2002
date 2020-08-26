package Javaio;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class AppProperties {
    String userName;
    String password;

    public String getUserName(String userName) throws IOException {
        //userName=this.userName;
        userName = loadProperties().getProperty(userName);
        return userName;
    }

    public String getPassword(String password) throws IOException {
        //password=this.password;
        password = loadProperties().getProperty(password);
        return password;
    }

    //public void getProperties()throws IOException{
    public Properties loadProperties() throws IOException {
        File file = new File("/Users/renxing/Izzan/IdeaProjects/mavendemob2002/src/main/resources/app.properties");
        FileReader fileReader = new FileReader(file);
        Properties properties = new Properties();
        properties.load(fileReader);
        //System.out.println("Username: " + properties.getProperty("userName"));
       //System.out.println("password: " + properties.getProperty("password"));
        return properties;
    }
}

