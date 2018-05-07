package CoreJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/**
 * 
 * @author aditya.malpani
 *
 */
public class FileOperations
{

    public int dTag = 0;
    public int dmetod = 0;


    public static void main(String[] args)
    {
        new FileOperations().walk("D:\\work\\10.3.1\\modules");
    }


    public void walk(String path)
    {
        File f = new File(path);
        File list[] = f.listFiles();
        for (int i = 0; i < list.length; i++)
        {
            if (list[i].isDirectory())
            {
                walk(list[i].getAbsolutePath());
            }
            else
            {
                if (list[i].getAbsoluteFile().getName().endsWith(".jsp") && !(String.valueOf(list[i].getAbsoluteFile()).contains("\\customer\\")))
                {
                    readRead(list[i]);
                }
            }
        }
    }


    public void readRead(File object)
    {
        dTag = 0;
        dmetod = 0;
        try
        {
            @SuppressWarnings("resource")
            BufferedReader bufferedRead = new BufferedReader(new FileReader(object));
            String buff = bufferedRead.readLine();
            while (buff != null)
            {
                if (buff.contains("[d]"))
                {
                    dTag++;
                }
                if (buff.contains("toDateTimeFormat("))
                {
                    dmetod++;
                }
                buff = bufferedRead.readLine();
            }
            if (dmetod != dTag && dmetod != 0 && dTag != 0)
            {
                System.out.println("B:" + object.getAbsolutePath() + File.separator + object.getName());
            }
            if (dmetod == dTag && dmetod != 0 && dTag != 0)
            {
                System.out.println("C:" + object.getAbsolutePath() + File.separator + object.getName());
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
