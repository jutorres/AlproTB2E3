package tb2e3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Writer {
    
    public static void writeCSV(ArrayList<Integer> list){
        try {
            String aux;
            File statText = new File("results.csv");
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);    
            BufferedWriter w = new BufferedWriter(osw);
            for (int i = 0; i < list.size(); i+=2) {
                aux = list.get(i) + "," + list.get(i+1) + ",\n" ;
                w.write(aux);
            }
            w.close();
        } catch (IOException e) {
            System.err.println("Problem writing to the file");
        }
    }
}
