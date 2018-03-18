/** 
  *	 
  *1、Unicode是一种编码规范，是为解决全球字符通用编码而设计的，而rUTF-8,UTF-16等是这种规范的一种实现。 
  *
  *2、java内部采用Unicode编码规范，也就是支持多语言的，具体采用的UTF-16编码方式。 
  *
  *3、不管程序过程中用到了gbk,iso8859-1等格式，在存储与传递的过程中实际传递的都是Unicode编码的数据，要想接收到的值不出现乱码，就要保证传过去的时候用的是A编码，接收的时候也用A编码来转换接收。 
  *
  *4、如果双方的file.encoding确保都相同，那就省事了，都默认转了，但往往在不同项目交互时很多时候是不一致的，这个时候是必须要进行编码转换的。 
  *  
  *5、无论如论转换，java程序的数据都是要先和Unicode做转换，这样也就是能处理多语言字符集的原因了。底层保持了一致，只要在传值和接值的时候也一致就肯定不会出现乱码了。 
  */  
  
public class test {  
  
    public static void main(String args[]) throws Exception {  
  
        String str = "中文字符";  
  
        System.out.println("original string---" + str);// 会正常输出原始串  
  
        /** 
         *  
         * str.getBytes();  如果括号中不写charset，则采用的是Sytem.getProperty("file.encoding"),即当前文件的编码方式， 
         *  
         * 很多人写的是系统的默认编码，通过代码测试并非如此，实际得到的是文件的编码方式* 
         *  
         * str.getBytes("charset");//指定charset，即将底层存储的Unicode码解析为charset编码格式的字节数组方式 
         *  
         * String new_str=new String(str.getBytes("utf-8"),"gbk")); 
         *  
         * //将已经解析出来的字节数据转化为gbk编码格式的字符串，在内存中即为gbk格式的字节数组转为Unicode去交互传递 
         */  
  
        String new_str = new String(str.getBytes("utf-8"), "gbk");  
  
        /** 
         *  
         * 此时的输出是乱码，在UTF-8的file.encoding下输出gbk格式的数据肯定是乱码,但是new_str的确是gbk编码式的 
         *  
         * 此时的乱码源于encoding不符，但gbk格式的new_str本身数据并没有问题,通过下面的转换也可以看得出来 
         */  
  
        System.out.println("new string----" + new_str);  
  
        String final_str = new String(new_str.getBytes("gbk"), "utf-8");// 此处的含意与最上边的注释是一致的参数含意  
  
        /** 
         *  
         *输出是正常的，此时将gbk编码格式的new_str字符串，用gbk这个charset去解析它，然后用utf-8再转码一次， 
         *  
         * 因为new_str确实是gbk格式的，才能经过utf-8编码得到正常的数据显示。 
         */  
  
        System.out.println("final string---" + final_str);  
  
    }  
}
  