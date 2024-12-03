import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class day3 {
    private ArrayList<String> list = new ArrayList<>();
    public day3(){
        scan();
    }

    public void scan(){
        try(Scanner sc = new Scanner(new BufferedReader(new FileReader("src/text")))) {
            while(sc.hasNext()){
                String line = sc.nextLine();
                proc(line);
            }
        } catch (
                FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void proc(String line){
        String substring = "mul(";
         int currentIndex = 0;
         int patternMatchIndex = 0;
        if (currentIndex < line.length()) {
            //AlgorithmStep.INSPECTING.execute(this);

            if (line.charAt(currentIndex) == substring.charAt(patternMatchIndex)) {
                patternMatchIndex++;

                if (patternMatchIndex == substring.length()) {
                    list.add(line.substring(currentIndex, ));
                }
            } else {
                AlgorithmStep.NOT_MATCHING.execute(this);
            }
            currentIndex++;
        } else {
            showMessage("End of text reached.");
        }

    }
}
