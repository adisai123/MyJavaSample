package CoreJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TestRegx
{

    public static void main(String[] args)
    {
        String regx = "module\\..*.revision";
        Pattern p = Pattern.compile(regx);
        Matcher m = p.matcher("module.utils.revision");
        if (m.matches())
        {
            System.out.println("huree||||");
        }
        String s = "module.billing.revision=419";
        System.out.println(((s.split("=")[0])));
        regx = "^[\\s|a-z|A-Z]+.*";
        p = Pattern.compile(regx);
        m = p.matcher("  module*");
        if (m.matches())
        {
            System.out.println("huree||||");
        }
    }
}
