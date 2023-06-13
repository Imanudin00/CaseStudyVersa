import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;

public class PrimeNum {

    public static void main(String [] args){

        JSONArray primeArray = new JSONArray();

        for(int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                primeArray.add("BIGBANG");
            } else if (i % 3 == 0) {
                primeArray.add("BIG");
            } else if (i % 5 == 0) {
                primeArray.add("BANG");
            } else {
                primeArray.add(Integer.toString(i));
            }
        }
        try (FileWriter file = new FileWriter("output.json")) {
            file.write(primeArray.toJSONString());
            System.out.println("Prime number BigBang array generated successfully inside 'output.json' :)");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
