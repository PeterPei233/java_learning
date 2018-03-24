import java.util.Arrays;
import java.util.regex.*;
// 分离数字和字母
public class 7_3{
	public static void main(String[] args) {
		String a ="A1B2C3D4csadsd22dsadE5F6G7H8";
		// rules
		Pattern d = Pattern.compile("\\d");
		String number = "";
		String word = "";
		for(int i = 0; i<a.length();i++){
			// match with pattern
			Matcher m = d.matcher(a.charAt(i)+"");	
			if (m.matches()) number+=a.charAt(i);
			else word+=a.charAt(i);
		}
		int[] num = new int[number.length()];
		String[] words = new String[a.length()-number.length()];
		int p = 0;
		for (char i : number.toCharArray()) {
			num[p++] = (int)i - 48;
		}
		p = 0;
		for (char i : word.toCharArray()) {
			words[p++] = i+"";
		}
		// Arrays 数组
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(words));
	}
}