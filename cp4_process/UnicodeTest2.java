import java.io.UnsupportedEncodingException;  
public class UnicodeTest2 {  
  
    public static void main(String[] args) {  
        String a = "哈哈";  
        try {  
            byte[] gb2312 = a.getBytes("GB2312");  
            byte[] utf = a.getBytes("UTF-8");  
            for (int i = 0; i < gb2312.length; i++) {  
                System.out.print(gb2312[i]);  
            }  
            System.out.println();  
  
            for (int i = 0; i < utf.length; i++) {  
                System.out.print(utf[i]);  
            }  
            System.out.println();  
  
            System.out.println(new String(gb2312));  
            System.out.println(new String(utf));  
            System.out.println(System.getProperty("file.encoding"));//当前文件的编码方式  
            System.out.println(new String(utf, "UTF-8"));  
            System.out.println(new String(gb2312, "UTF-8"));  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        }  
  
    }  
}  