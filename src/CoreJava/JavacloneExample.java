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
public class JavacloneExample implements Serializable, Cloneable
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    b b1;


    public JavacloneExample()
    {
        super();
        System.out.println("ji");
    }


    public void readObject(JavacloneExample o)
    {
        o.b1 = b1;
    }


    public static void main(String[] args) throws IOException, CloneNotSupportedException, ClassNotFoundException
    {
        b b11 = new b();
        b11.i = 11;
        JavacloneExample j = new JavacloneExample();
        j.b1 = b11;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream obstream = new ObjectOutputStream(bos);
        obstream.writeObject(j);
        JavacloneExample jclone = (JavacloneExample) j.clone();
        byte[] byteData = bos.toByteArray();
        ByteArrayInputStream bais = new ByteArrayInputStream(byteData);
        JavacloneExample deepCopy = (JavacloneExample) new ObjectInputStream(bais).readObject();
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
