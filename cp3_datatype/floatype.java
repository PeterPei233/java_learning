public class floatype{
	
	public static void main(String[] args) {
		float a = 5.434345323f;
		System.out.println(a);
		double b = 0.0;
		double c = Double.NEGATIVE_INFINITY;
		float d = Float.NEGATIVE_INFINITY;
		System.out.println(c==d);
		System.out.println(b/b == Float.NaN);
		System.out.println(6.0/0 == 5.4/0);
		System.out.println(-8/b);
		String str = true + "";
		System.out.println(str);
		System.out.println('\u9999');
		char cc =97;
		System.out.println(cc);
		String xx = "";
		for(int i = 0; i<6;i++){
			int now = (int)(Math.random()*26+97);
			xx = xx + (char)(now);
		}
		System.out.println(xx);
		float ab = 5.6f;
		System.out.println(ab);
		String ss = "56";
		int intss = Integer.parseInt(ss);
		System.out.println(intss+1);	
	}
}
