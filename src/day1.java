import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class day1 {
    private ArrayList<Integer> list0 = new ArrayList<>();
    private ArrayList<Integer> list1 = new ArrayList<>();

    public day1(){
        try( Scanner sc = new Scanner(new BufferedReader(new FileReader("src/text")));) {

            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] block = line.split("   ");
                list0.add(Integer.parseInt(block[0]));
                list1.add(Integer.parseInt(block[1]));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        proces();
    }
    private void proces(){
        //ArrayList<Integer> answList = new ArrayList<>();
        int anwear = 0;
        /*for(int i = 0;i < list0.size(); i++){
            anwear += Math.abs((list0.get(i)-list1.get(i)));
        }*/

        for(int i = 0; i < list0.size(); i++){
            int multyplyer = 0;
            for(int j = 0; j < list1.size(); j++){
                if (list0.get(i).equals(list1.get(j))) multyplyer++;
            }
            //System.out.println(list0.get(i) + " "+ "*" + " "+multyplyer+ " "+ "=" + list0.get(i)*multyplyer);
            anwear += list0.get(i) * multyplyer;
        }
        System.out.println(anwear);
    }

}
