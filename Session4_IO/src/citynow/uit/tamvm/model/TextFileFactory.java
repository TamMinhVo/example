package citynow.uit.tamvm.model;

import java.io.*;
import java.util.ArrayList;

public class TextFileFactory {

    public boolean WriteFile(ArrayList<String> writeData, String path){
        boolean success = false;
        try {
            FileOutputStream fos = new FileOutputStream(path);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            for(String data: writeData){
                bw.write(data);
                bw.newLine();
            }
            bw.close();
            osw.close();
            fos.close();
            success = true;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return success;
    }

    public ArrayList<String> ReadFile(String path){
        ArrayList<String> readData = new ArrayList<String>();
        try{
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader br = new BufferedReader(isr);

            String line = br.readLine();
            while (line != null){
                if(line.length()>0){
                    readData.add(line);
                    line = br.readLine();
                }
            }
            br.close();
            isr.close();
            fis.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        return readData;
    }
}
