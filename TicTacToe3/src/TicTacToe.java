import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int board[][]= {{0,0,0},{0,0,0},{0,0,0}};
		Scanner keyboard=new Scanner(System.in);
		int row=0,column=0;
		board[row][column]=1;
		
		for(;;) {
		int code= PlayerChoice(board);
		
		}
		//for(int i=0;i<9;i++) {
			
			
			
			
			
			if(i==0||i==2||i==4||i==6||i==8)
			
			{
			
			do {
				//your turn	
				System.out.println("row column");	
				row = keyboard.nextInt();	
				column = keyboard.nextInt();
				if (board[row][column]!=0) {
					System.out.println("not available");
				}
			}while(board[row][column]!=0);

			}else {
				do {
					//computers turn 
						
						
					
//					row =randomnumbers.nextInt(3);
//					column=randomnumbers.nextInt(3);
					
				}while(board[row][column]!=0);
	
			
			
			
			}
			
			
			if(i==0||i==2||i==4||i==6||i==8) {
				board [row] [column]=1;
			}
			else {
				board[row][column]=2;
			}





			draw(board);
			System.out.println("..........................");


			if(i==1||i==3||i==5||i==7) {
				if(checkmate(board,2) )
				{
					System.out.println("O wins");
					return;
				}

			}
			else {
				if(checkmate(board,1) )
				{
					System.out.println("x wins");
					return;
				}
			}

		}
		System.out.println("draw");
	//}







	public static void draw(int[][] board) {

		//first line output
		if(board[0][0]==1) {
			System.out.print("x");
		}
		else if(board[0][0]==2) {
			System.out.print("o");
		}
		else {
			System.out.print(" ");
		}

		System.out.print("|");

		if(board[0][1]==1) {
			System.out.print("x");
		}
		else if(board[0][1]==2) {
			System.out.print("o");
		}
		else {
			System.out.print(" ");
		}

		System.out.print("|");

		if(board[0][2]==1) {
			System.out.println("x");
		}
		else if(board[0][2]==2) {
			System.out.println("o");
		}
		else {
			System.out.println(" ");
		}

		//second line output
		System.out.println("-|-|-");

		//third line output
		if(board[1][0]==1) {
			System.out.print("x");
		}
		else if(board[1][0]==2) {
			System.out.print("o");
		}
		else {
			System.out.print(" ");
		}

		System.out.print("|");

		if(board[1][1]==1) {
			System.out.print("x");
		}
		else if(board[1][1]==2) {
			System.out.print("o");
		}
		else {
			System.out.print(" ");
		}

		System.out.print("|");

		if(board[1][2]==1) {
			System.out.println("x");
		}
		else if(board[1][2]==2) {
			System.out.println("o");
		}
		else {
			System.out.println(" ");
		}

		//fourth line output
		System.out.println("-|-|-");

		//fifth line output
		if(board[2][0]==1) {
			System.out.print("x");
		}
		else if(board[2][0]==2) {
			System.out.print("o");
		}
		else {
			System.out.print(" ");
		}

		System.out.print("|");

		if(board[2][1]==1) {
			System.out.print("x");
		}
		else if(board[2][1]==2) {
			System.out.print("o");
		}
		else {
			System.out.print(" ");
		}

		System.out.print("|");

		if(board[2][2]==1) {
			System.out.println("x");
		}
		else if(board[2][2]==2) {
			System.out.println("o");
		}
		else {
			System.out.println(" ");
		}

	}






	//check win if any 
	public static boolean checkmate(int[][] board,int M) {
		//check rows
		for(int i=0;i<3;i++) {
			if (board[i] [0]==M&&
					board[i] [1]==M&&
					board[i] [2]==M) {
				return true;
			}
		}

		//check columns 
		for(int i=0;i<3;i++) {
			if (board[0] [i]==M&&
					board[1] [i]==M&&
					board[2] [i]==M) {
				return true;
			}
		}
		if(board[0][0]==M&&
				board[1][1]==M&&
				board[2][2]==M) {
			return true;	
		}	
		if(board[0][2]==M&&
				board[1][1]==M&&
				board[2][0]==M) {
			return true;

		}	


		return false;
	}
	
	
	
	
	public static int PlayerChoice(int[][]board){

		int code=0;
		do {
			//your turn	
			System.out.println("row column");	
			row = keyboard.nextInt();	
			column = keyboard.nextInt();
			if (board[row][column]!=0) {
				System.out.println("not available");
			}
		}while(board[row][column]!=0);
		

		return code;
	}


	public static int ComputerChoice(int[][]board){

		int code=0;


		return code;
	}


	public static void SayComputerWins()
	{
		System.out.println("Computer wins.");
	}
	
	

	public static void SayPlayerWins()
	{
		System.out.println("Player wins.");
	}
	
	

	public static void SayDraw()
	{
		System.out.println("Draw.");
	}
}

