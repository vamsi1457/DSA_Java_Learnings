
import java.io.FileReader;
import java.io.IOException;
public class ExceptionHandling1 {

    public static void main(String[] args) {
        try(FileReader fr = new FileReader("notes.txt")){
            int letters = fr.read();
            while(fr.ready()){
                System.out.print((char)letters);
                letters = fr.read();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}