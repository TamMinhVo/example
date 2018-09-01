package citynow.uit.tamvm.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public  class SerializeFile {
    public static boolean WriteObjectFile(Object writeData, String path){
        System.out.println("Class must implement interface Serializable");
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(writeData);
            oos.close();
            fos.close();
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    public static Object ReadObjectFile(String path){
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object readObject = ois.readObject();
            /**
             * Ép kiểu readObject về kiểu của đối tượng đó
             * ex: KhachHang kh = (KhachHang) readObject;
             */
            ois.close();
            fis.close();
            return readObject;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
