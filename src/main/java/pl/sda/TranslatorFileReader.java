package pl.sda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TranslatorFileReader {

    public String read(String filePath){
        String contents = "";
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine()) != null && !line.isEmpty()){
                contents = contents + line.replace("\n", " ");
            }
        } catch (IOException e) {
            contents = "";
        }

        return contents;
    }
}
