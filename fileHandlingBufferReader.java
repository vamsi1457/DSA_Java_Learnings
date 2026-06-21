import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class fileHandlingBufferReader {
    public static void main(String[] args) {
                                                    // this should be read typed
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("You typed: "+br.readLine());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        // Or 
        try(BufferedReader br = new BufferedReader(new FileReader("notes.txt"))){
            while (br.ready()) {
                System.out.print("File content: "+br.readLine());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
