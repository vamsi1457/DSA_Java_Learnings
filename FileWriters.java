import java.io.FileWriter;
import java.io.IOException;

public class FileWriters {
    public static void main(String[] args) {
        try(FileWriter fr = new FileWriter("file.txt", true)){ // true is for append without overwriting
            fr.write(10);
            fr.write("hellow world!!!!!");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
