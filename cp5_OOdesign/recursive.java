public class recursive{
	public static int f(int i){
		if(i ==1) return 1;
		else if (i==2) return 1;
		else return f(i-1)+f(i-2);
	}
	public static void main(String[] args) {
		System.out.println(f(10));
	}
}