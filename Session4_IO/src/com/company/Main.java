package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {
/*
    private static void Files(ArrayList<File> af, File folder){
        for(File file : folder.listFiles()){
            if(file.isFile()){
                af.add(file);
            }
            if(file.isDirectory()){
                Files(af, file);
            }
        }
    }
*/
    public static void main(String[] args) throws IOException {
       /* ArrayList<File> al = new ArrayList<File>();
        File folder = new File("doc");
        Files(al, folder);
        for(File file : al){
            System.out.println(file.getName());
        }*/
       /*
       FileOutputStream fos = new FileOutputStream("acb.txt");
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));
       String[] strs = new String[]{
               "Chuyên đề java",
               "citynow",
               "uit boss"
       };
       for(String str:strs){
           bw.write(str);
           bw.newLine();
       }
       bw.close();
*/
       FileInputStream fis = new FileInputStream("acb.txt");
       BufferedReader br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
       String str = null;
       do{
           str = br.readLine();
           System.out.println(str);
       }while (str != null);
    }
}

//postGreSQL