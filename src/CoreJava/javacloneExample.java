package CoreJava;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


/**
 * 
 * @author aditya.malpani
 *
 */
public class javacloneExample implements Serializable, Cloneable
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    b b1;


    public javacloneExample()
    {
        super();
        System.out.println("ji");
    }


    public void readObject(javacloneExample o)
    {
        o.b1 = b1;
    }


    public static void main(String[] args) throws IOException, CloneNotSupportedException, ClassNotFoundException
    {
        b b11 = new b();
        b11.i = 11;
        javacloneExample j = new javacloneExample();
        j.b1 = b11;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream obstream = new ObjectOutputStream(bos);
        obstream.writeObject(j);
        javacloneExample jclone = (javacloneExample) j.clone();
        byte[] byteData = bos.toByteArray();
        ByteArrayInputStream bais = new ByteArrayInputStream(byteData);
        javacloneExample deepCopy = (javacloneExample) new ObjectInputStream(bais).readObject();
        j.b1.i = 20;
        System.out.println("shallow copy" + jclone.b1.i);
        System.out.println("deep copy" + deepCopy.b1.i);
    }
}


class b implements Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;


    public b()
    {
        super();
        System.out.println("jijjj");
    }

    int i = 10;
}
