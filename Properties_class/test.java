package Properties_class;
import java.io.*;
import java.util.*;
public class test{
    public static void main(String argv[]) throws Exception{
        Properties p= new Properties();
        OutputStream os=new FileOutputStream("propertiesConfNew.properties");
        p.setProperty("url", "localhost:3306/myDBS");
        p.setProperty("uname", "sapnaSapna");
        p.setProperty("passwd", "123456789");
        p.setProperty("instaID", "itssharmajee");
        p.store(os, "Done");
    }
}