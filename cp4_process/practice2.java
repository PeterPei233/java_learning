import java.util.Scanner;
public class practice2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("输入等腰三角形的高：");
		int num = sc.nextInt();
		String[][] tr = new String[num][2*num-1];
		for(int i = 0;i<num;i++){
			for(int j = 0; j<2*num-1;j++){
				if (j<num+i-1&&j>num-i-1) {
					tr[i][j] = "*";
				}
				else{
					tr[i][j] = " ";
				}
			}
		}
		for (String[] line:tr){
			for(String point : line){
				System.out.print(point);
			}
			System.out.print("\n");
		}
		sc.close();
	}
}