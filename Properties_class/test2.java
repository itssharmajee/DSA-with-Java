package Properties_class;
import java.io.*;
import java.util.*;
public class test2{
    public static void main(String argv[]) throws Exception{
        Properties p= new Properties();
        InputStream is=new FileInputStream("propertiesConf.properties");

        p.load(is);
        System.out.println(p.getProperty("passwd"));
    }
}