package Javaio;

import java.io.FileReader;
import java.io.IOException;

public class FileReadingDem {
    public void readFile() throws IOException {
        String filePath="/Users/renxing/Izzan/IdeaProjects/JavaBasicBatch2002/Data/Dem.txt";
        FileReader fileReader=new FileReader(filePath);

        int i;
        while((i=fileReader.read()) != -1){
            System.out.print((char) i);
        }
    }
}
