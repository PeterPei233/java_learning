import java.util.Scanner;
public class practice4_6{
	private static int point = 20;
	private char[][] grid;

	public boolean equals(char a,char b,char c,char d,char e){
		if(a =='+') return false;
		if(a!=b) return false;
		if(b!=c) return false;
		if(c!=d) return false;
		if(d!=e) return false;
		return true;
	}
	public void iniGo(){
		grid = new char[point][point*2];
		for(int i=0;i<point;i++){
			for(int j=0;j<point;j++){
				grid[i][j*2] = '+';
				grid[i][j*2+1] = ' ';
			}
		}
	}
	public void addGo(int x,int y,int player){
		if(player ==1){
			grid[x][y*2] = '*';
		}
		else{
			grid[x][y*2] = 'o';
		}
		for(char[] p1:grid){
			for(char p2:p1){
				System.out.print(p2);
			}
			System.out.print("\n");
		}	
	}
	//judge whether someone wins
	public boolean judge(){
		for(int i=0;i<point-4;i++){
			for(int j =0;j<2*point-8;j+=2){
				if(equals(grid[i][j],grid[i][j+2],grid[i][j+4],grid[i][j+6],grid[i][j+8])){
					return true;
				}
				if(equals(grid[i][j],grid[i+1][j],grid[i+2][j],grid[i+3][j],grid[i+4][j])){
					return true;
				}
				if(equals(grid[i][j],grid[i+1][j+2],grid[i+2][j+4],grid[i+3][j+6],grid[i+4][j+8])){
					return true;
				}
			}
		}
		for(int i = point-1;i>=4;i--){
			for(int j = 0;j<2*point-8;j+=2){
				if(equals(grid[i][j],grid[i-1][j+2],grid[i-2][j+4],grid[i-3][j+6],grid[i-4][j+8])){
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		practice4_6 playgo = new practice4_6();
		playgo.iniGo();
		Scanner sc = new Scanner(System.in);
		int player = 0;
		while(!playgo.judge()){
			int x,y;
			while(true){
				System.out.println("请第"+(player+1)+"为玩家下棋,输入下棋坐标(x<20)，如：1,2");
				String position = sc.nextLine();
				x = (int)(position.charAt(0)-48);
				y = (int)(position.charAt(2)-48);
				if(playgo.grid[x][y*2]!='+'){
					System.out.println("该位置上已经有棋子了，请重新输入");
				}
				else{
					break;
				}
			}
			playgo.addGo(x,y,player);
			player = (player+1)%2;
		}
		System.out.println((player+1)%2+1 +"号玩家获胜");
	}
}