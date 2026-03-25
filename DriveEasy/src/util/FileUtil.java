package util;
import java.util.*;
import java.io.*;
public class FileUtil {


    public static <T> ArrayList <T> loadFile(String str)
    {
        try
        {
            File file = new File(str);

            if(!file.exists())
                    return new ArrayList<>();
            
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);

            @SuppressWarnings("unchecked")
            ArrayList<T>data = (ArrayList<T>) ois.readObject();

            ois.close();

            return data;
        } catch(Exception E)
        {
            return new ArrayList<>();
        }
    }


    public static void saveData(String str, Object data)
    {
       try
        {
            File file = new File(str);
            
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(data);

            oos.close();

        } catch(Exception E)
        {
            System.out.println(E.getMessage());
        } 
    }
}
