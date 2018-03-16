public class process{
	public static void main(String[] args) {
		// the easy use of switch
		char x = 's';
		switch(x){
			case 'a':
				System.out.println("OK");
				break;
			case 's':
				System.out.println("ojbk");
				break;
			default:
				System.out.println("cool");
		}
		int count = 1;
		do{
			System.out.println(count);
			count++;
		}while(count<10);
		//数组初始化
		Object[] xx;
		xx = new Object[]{"11","22","hah",22};
		for(int i = 0;i<4;i++){
			System.out.println(xx[i]); 
		}
		int[] prize = new int[5];
		Object[] hh = new String[4];
		System.out.println(prize);
		int[] height = {11,2,2,331,3,412};
		for(int hei:height)	{
			System.out.println(hei);
		}	

		int[][] a = new int[4][];
		for(int[] x :a){
			System.out.println(x);
		}
		//a[0] = new int[]{1,2,3};
		a[0] = new int[2];
		a[0][1] = 6;
		for (int y:a[0]){
			System.out.println(y);
		}
		String[][] str1 = {new String[3],new String[]{"sd","ada"}};
		for(String[] str :str1){
			for(String str0 :str){
				System.out.println(str0);
			}
		}
	}
}