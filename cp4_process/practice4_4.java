import java.util.Scanner;
import java.lang.String;
public class practice4_4 {
	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("输入一串字符：");
		String str = sc.nextLine();
		System.out.print("输入要截取的位置：");
		int cut = sc.nextInt();
		//the charsets supporting Chinese include GBK utf-8 utf-16.
		//utf-8 uses 3 bytes to store Chinese character.
		byte[] xx = str.getBytes("GBK");
		int len = xx.length;
		//中文字符为负，且成对出现
		int count = 0;
		for(int i = 0; i<cut;i++){
			if(xx[i]<0) count++;
		}
		String str1;
		String str2;
		/*String(byte[] bytes, int offset, int length, Charset charset)
		Constructs a new String by decoding the specified subarray of 
		bytes using the specified charset.*/
		if (count%2==0) {
			str1 = new String(xx,0,cut,"gbk");
			str2 = new String(xx,cut,len-cut,"gbk");
		}
		else{
			str1 = new String(xx,0,cut-1,"gbk");
			str2 = new String(xx,cut-1,len-cut+1,"gbk");
		}
		System.out.println(len);
		System.out.println("the first part: "+str1+"\n"+"the second part: "+str2);
	}
}