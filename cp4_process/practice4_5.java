public class practice4_5{
	private String[] chinese = {"零","一","二","三","四","五","六","七","八","九"};
	private String[] price ={"十","百","千"};
	private String toChinese(String number){
		String ch = "";
		int len = number.length();
		boolean flag = false;
		//考虑零的问题
		for(int i = 0;i<len-1;i++){
			int p =number.charAt(i)-48;
			if(flag&&number.charAt(i)!='0'){
				ch+="零";
				flag = false;
			}
			if(p!=0){
				ch += chinese[p];
				ch += price[len-i-2];
			}
			else{
				flag = true;
			}
		}
		if(number.charAt(len-1)!='0'){
			ch += chinese[(int)(number.charAt(len-1)-48)];
		}
		return ch;
	}

	public static void main(String[] args) {
		String[] unit = {"元","万","亿","兆"};
		practice4_5 test = new practice4_5();
		double num = Double.parseDouble(args[0]);
		long num_int = (long)num;
		int num_point = (int)Math.round((num-num_int)*100);
		String numi = num_int+"";
		int length = numi.length();
		String out = "";
		int j =0;
		for(int i = length; i>0;i-=4){
			String xx;
			if(i>=4){
				xx = numi.substring(i-4,i);
			}
			else{
				xx = numi.substring(0,i);
			}
			out = test.toChinese(xx)+unit[j]+out;
			j++;
		}
		if(num_point/10!=0){
			out+=test.chinese[num_point/10]+"角";
		}
		if(num_point%10!=0){
			out+=test.chinese[num_point%10]+"分";
		}
		System.out.println(out);
	}
}