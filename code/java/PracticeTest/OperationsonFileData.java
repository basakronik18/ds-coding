package PracticeTest;

import java.io.*;
import java.util.HashMap;

/**
 * Created by ronik.basak on 07/12/16.
 */
public class OperationsonFileData {

    public static double calcop(HashMap inMap, char op, String s1, String s2){
        double result = 0.0;
        double val1 = Double.parseDouble((String)inMap.get(s1));
        double val2 = Double.parseDouble((String)inMap.get(s2));
        switch(op){
            case '+':
                result = result + (val1 + val2);
                break;
            case '*':
                result = result + (val1*val2);
                break;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        HashMap<String, String> inMap = new HashMap<>();
        String filePath = "/Users/ronik.basak/dev/ds_coding/code/java/PracticeTest/input.txt";
        String line;

        // Print Current Directory
        // String myCurrentDir = System.getProperty("user.dir") + File.separator + System.getProperty("sun.java.command").substring(0, System.getProperty("sun.java.command").lastIndexOf(".")).replace(".", File.separator);

        Reader obj = new FileReader(filePath);
        BufferedReader reader = new BufferedReader(obj);
        while((line = reader.readLine()) != null){
            String parts[] = line.split(" ");
                String key = parts[0];
                String value = parts[1];
                inMap.put(key, value);
        }
        for (String key : inMap.keySet())
        {
            System.out.println(key + ":" + inMap.get(key));
        }
        reader.close();
        System.out.println("The required output is: " + calcop(inMap,'+',"ABC","ERF"));
    }

}
