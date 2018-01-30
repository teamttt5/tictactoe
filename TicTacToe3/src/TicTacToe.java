import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int board[][]= {{0,0,0},{0,0,0},{0,0,0}}; 
		int m = 0; 
		Scanner keyboard = new Scanner(System.in);
		Random randomNumbers = new Random(); 
		int row = 0,column = 0;
		board[row][column]=1;
		draw(board);
	System.out.println();
		for(;;) 
		{
			int code= PlayerChoice(board);
			draw(board);
			System.out.println();
			if(code==1)
			{
				SayComputerWins();
				return;
			}
			else if(code==2)
			{
				SayPlayerWins();
				return;
			}
			else if(code==3)
			{
				SayDraw();
				return;
			}
			code=ComputerChoice(board);
			draw(board);
			System.out.println();
			if(code==1)
			{
				SayComputerWins();
				return;
			}
			else if(code==2)
			{
				SayPlayerWins();
				return;
			}
			else if(code==3)
			{
				SayDraw();
				return;
			}
		}
	}
		/*
        int i = 0;
		if(i%2==0)
        {
		
	      do{
	    	  System.out.println("enter position");
	    	  row = keyboard.nextInt();
	    	  column = keyboard.nextInt();
	    	  
	    	  if (board[row][column] != 0)
	    	  {
	    		  System.out.println("Choose different position");
	    	  }
	      } while(board[row][column] !=0);
	      if(i%2==0)
	      {
	    	  m=1;
	      }
	      else {m=2;}
	      
	      
	      
	      do {
	    	  row = randomNumbers.nextInt(3);
	    	  column = randomNumbers.nextInt(3);
	    	  }while(board[row][column] !=0);
	         m=2;
        }
        
        board[row][column]=m;
        
        drawboard(board);
        
        boolean didwin=
        		win(board,m);
        
        if(didwin)
        {
        	System.out.println("you won!");
        	return;
        }
        
         System.out.println("draw");
		}
		*/
		
		
		/*
        
        	
        
        
		
        
        
        
        
        //for(int i=0;i<9;i++) {
			
			
			
			
	/*		
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
		*/
	//}







	private static boolean win(int[][] board, int m) {
		// TODO Auto-generated method stub
		return false;
	}







	private static void drawboard(int[][] board) {
		// TODO Auto-generated method stub
		
	}







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
		Scanner keyboard=new Scanner(System.in);

		int row =0;
		int column =0;
		do {
			//your turn	
			System.out.println("row column");	
			row = keyboard.nextInt();	
			column = keyboard.nextInt();
			if (board[row][column]!=0) {
				System.out.println("not available");
			}
		}while(board[row][column]!=0);
		board[row][column]=2;
		if(checkmate(board,1))
		{
			return 1;
		}
		if(checkmate(board,2))
		{
			return 2;
		}
		if(CheckForDraw(board))
		{
			return 3;
		}
		return code;
	}


	public static int ComputerChoice(int[][]board){

		int code=0;
		
		
		if (FindOneToWin(board))
		{
			code=1;
			return code;
		}
		
		
		if (FindOneToBlock(board))
		{
			return checkresult(board);
		}
		
		if (FindVacantSite(board, 0))
		{
			return checkresult(board);
		}
		else if (FindVacantSite(board, 2))
		{
			return checkresult(board);
		}
		else if (FindVacantSite(board, 8))
		{
			return checkresult(board);
		}
		else if (FindVacantSite(board, 6))
		{
			return checkresult(board);
		}
		else if (FindVacantSite(board, 1))
		{
			return checkresult(board);
		}
		else if (FindVacantSite(board, 5))
		{
			return checkresult(board);
		}
		else if (FindVacantSite(board, 7))
		{
			return checkresult(board);
		}
		else if (FindVacantSite(board, 3))
		{
			return checkresult(board);
		}
		else if (FindVacantSite(board, 4))
		{
			return checkresult(board);
		}

		return code;
	}
	
	
	public static int checkresult(int[][]board)
	{
		int code = 0 ;
		
		if (checkmate(board,1))
		{
			code=1;
			return code;
		}
		else if (checkmate(board,2))
		{
			code=2;
			return code;
		}
		else if (CheckForDraw(board))
		{
			code=3;
			return code;
		}
		code=0;
		return code;
	}
	
	
	
	public static boolean FindOneToWin(int[][]board) {
		 
		for(int r=0; r<3;r++)
		{// check rows
			if (board[r][0]==1
					&& board[r][1]==1
					&& board[r][2]==0)
			{
				//	Pattern A
				board [r][2]=1;
				return true;
			}
			else if (board[r][0]==1 
					&& board[r][1]==0
					&& board[r][2]==1)
			{// Pattern B
				board [r][1]=1;
				return true;
			}
			else if (board[r][0]==0 
					&& board[r][1]==1
					&& board[r][2]==1)
			{  // Pattern C
				board [r][0]=1;
				return true;
			}
		}
		for(int c=0; c<3;c++)
		{// check columns
			if (board [0][c]==1 
					&& board[1][c]==1
					&& board[2][c]==0)
			{
				//	Pattern D
				board [2][c]=1;
				return true;
			}	
			else if (board [0][c]==1 
					&& board[1][c]==0
					&& board[2][c]==1)
			{
				//	Pattern E
				board [1][c]=1;
				return true;
			}	
			else if (board [0][c]==0
					&& board[1][c]==1
					&& board[2][c]==1)
			{
				//	Pattern F
				return true;
			}	
		}
		// check NW-SE diagonals 
		if (board [0][0]==1 
				&& board[1][1]==1
				&& board[2][2]==0)
		{
			//	Pattern G
			return true;
		}	
		else if (board [0][0]==1 
				&& board[1][1]==0
				&& board[2][2]==1)
		{
			//	Pattern H
			return true;
		}	
		else if (board [0][0]==0
				&& board[1][1]==1
				&& board[2][2]==1)
		{
			//	Pattern I
			return true;
		}	
		// check SW-NE diagonals 
		if (board [2][0]==1 
				&& board[1][1]==1
				&& board[0][2]==0)
		{
			//	Pattern J
			return true;
		}	
		else if (board [2][0]==1 
				&& board[1][1]==0
				&& board[0][2]==1)
		{
			//	Pattern K
			return true;
		}	
		else if (board [2][0]==0
				&& board[1][1]==1
				&& board[0][2]==1)
		{
			//	Pattern L
			return true;
		}	
		return false;


	}
	public static boolean FindOneToBlock(int[][]board) {
		
		for(int r=0; r<3;r++)
		{// check rows
			if (board[r][0]==2
					&& board[r][1]==2
					&& board[r][2]==0)
			{
				//	Pattern A
				board[r][2]=1;
				return true;
			}
			else if (board[r][0]==2 
					&& board[r][1]==0
					&& board[r][2]==2)
			{// Pattern B
				board[r][1]=1;
				return true;
			}
			else if (board[r][0]==0 
					&& board[r][1]==2
					&& board[r][2]==2)
			{  // Pattern C
				board[r][0]=1;
				return true;
			}
		}
		for(int c=0; c<3;c++)
		{// check columns
			if (board [0][c]==2 
					&& board[1][c]==2
					&& board[2][c]==0)
			{
				//	Pattern D
				board[2][c]=1;
				return true;
			}	
			else if (board [0][c]==2 
					&& board[1][c]==0
					&& board[2][c]==2)
			{
				//	Pattern E
				board[1][c]=1;
				return true;
			}	
			else if (board [0][c]==0
					&& board[1][c]==2
					&& board[2][c]==2)
			{
				//	Pattern F
				board [0][c]=1;
				return true;
			}	
		}
		// check NW-SE diagonals 
		if (board [0][0]==2 
				&& board[1][1]==2
				&& board[2][2]==0)
		{
			//	Pattern G
			board[2][2]=1;
			return true;
		}	
		else if (board [0][0]==2 
				&& board[1][1]==0
				&& board[2][2]==2)
		{
			//	Pattern H
			board[1][1]=1;
			return true;
		}	
		else if (board [0][0]==0
				&& board[1][1]==2
				&& board[2][2]==2)
		{
			//	Pattern I
			board [0][0]=1;
			return true;
		}	
		// check SW-NE diagonals 
		if (board [2][0]==2 
				&& board[1][1]==2
				&& board[0][2]==0)
		{
			//	Pattern J
			board[0][2]=1;
			return true;
		}	
		else if (board [2][0]==2 
				&& board[1][1]==0
				&& board[0][2]==2)
		{
			//	Pattern K
			board[1][1]=1;
			return true;
		}	
		else if (board [2][0]==0
				&& board[1][1]==2
				&& board[0][2]==2)
		{
			//	Pattern L
			board [2][0]=1;
			return true;
		}	
		return false;

		
		
		
	}
	public static boolean CheckForDraw(int[][]board) {
		boolean isdraw = true;
		for(int r=0; r<3;r++)
		{
			for (int c=0; c<3; c++)
			{
				if (board [r][c]==0)
				{
					isdraw=false;
				}
			}
		}
		
		return isdraw;
		
	}
	
	public static boolean FindVacantSite(int[][]b,int m) {
		boolean didit = false;
		
		if (m==0&& b[0][0]==0)
		{
			b[0][0]=1;
			didit = true;
		}
		else if (m==2&& b[0][2]==0)
		{
			b[0][2]=1;
			didit = true;
		}
		else if (m==8&& b[2][2]==0)
		{
			b[2][2]=1;
			didit = true;
		}
		else if (m==6&& b[2][0]==0)
		{
			b[2][0]=1;
			didit = true;
		}
		else if (m== 1&& b[0][1]==0)
		{
			b[0][1]=1;
			didit = true;
		}
		else if (m==5&& b[1][2]==0)
		{
			b[1][2]=1;
			didit = true;
		}
		else if (m==7&& b[1][1]==0)
		{
			b[2][1]=1;
			didit = true;
		}
		else if (m==3&& b[1][0]==0)
		{
			b[1][0]=1;
			didit = true;
		}
		else if (m==4&& b[1][1]==0)
		{
			b[1][1]=1;
			didit = true;
		}
		return didit;
		
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

