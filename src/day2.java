import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class day2 {
    private ArrayList<ArrayList<Integer>> omegaList = new ArrayList<>();
    private int answear = 0;
    public day2(){
        try(Scanner sc = new Scanner(new BufferedReader(new FileReader("src/text")))){
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] blok = line.split(" ");
                ArrayList<Integer> betaList = new ArrayList<>();
                for(String digit: blok){
                    betaList.add(Integer.parseInt(digit));
                }
                omegaList.add(betaList);


            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        proc();
        System.out.println(answear);
    }
    public void proc(){
        for(ArrayList<Integer> beta: omegaList){
            for(int i = 0;i<beta.size(); i++){
                //is descending
                int last = 0; //FINNISH, REWRITE
                if(beta.get(i)>beta.get(i+1) || beta.get(i)<beta.size()) {
                    if(Math.abs(beta.get(i)-beta.get(i+1)) >=1){
                        if (Math.abs(beta.get(i)-beta.get(i+1))<=3){
                            answear++;
                        }
                    }
                }
            }
        }
    }
}
