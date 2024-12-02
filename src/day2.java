import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class day2 {
    ArrayList<ArrayList<Integer>> omegaList = new ArrayList<>();
    public day2(){
        try(Scanner sc = new Scanner(new BufferedReader(new FileReader("src/txt")))){
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] blok = line.split(" ");
                ArrayList<Integer> betaList = new ArrayList<>();
                for(String digit: blok){
                    betaList.add(Integer.parseInt(digit));
                }
                omegaList.add(new ArrayList<Integer>(Arrays.asList(
                //MUST FINNISH
                )));
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
