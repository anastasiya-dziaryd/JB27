package by.jb.mod12.main.Reader;

import by.jb.mod12.main.Library.Library;
import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class JsonReader implements IJsonReader {

    @Override
    public Library Read(String path, String fileName) {
        File file = this.CheckAndGetFileIfExists(path, fileName);
        if(file == null){
            System.out.println("File not found");
            return null;
        }

        try(FileReader fileReader = new FileReader(file))
        {
            Scanner scanner = new Scanner(fileReader);

            String rawJsonBuffer = "";
            while(scanner.hasNextLine()){
                rawJsonBuffer += scanner.nextLine();
            }

            return this.Deserrialize(rawJsonBuffer);
        } catch (Exception e){
            System.out.println("Error");
            return null;
        }
    }

    @Override
    public File CheckAndGetFileIfExists(String path, String fileName) {
        var file = new File(path, fileName);
        if(file.exists()){
            return file;
        }
        return null;
    }

    @Override
    public Library Deserrialize(String jsonContent) {
        Gson gson = new Gson();
        return gson.fromJson(jsonContent, Library.class);
    }
}
