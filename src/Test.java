import java.io.*;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        //把一个程序生成一个文件
       Properties properties = new Properties();
       properties.setProperty("name","tom");
        properties.setProperty("age","10");
        System.out.println(properties.getProperty("name"));
        OutputStream out = new FileOutputStream("my.properties");
        properties.store(out,"This is a comment");

        //读取一个生成好的文件
        Properties db = new Properties();
        db.load(new FileInputStream("Input.properties"));
        db.forEach((k,v)->System.out.println(k + "="  + v));
         for(Object key :db.keySet()){
             System.out.println(key + "="  + db.getProperty((String)key));
         }

    }
}
