package pkg;

import ryanguru.ColorDisplay;

public class YourCode
{
	public static void VertLineAtCol(int col, int ht, String color)
	{
		for (int i=0; i<ht; i++)
		{
			ColorDisplay.setPixelColor(i, col, color);
			ColorDisplay.pause(5);
		}
	}
	public static void horline(int length,int horizontial,String color)
	{	 
		for(int x=0 ; x <length ; x++) 
		{
			ColorDisplay.setPixelColor(horizontial, x, color);
			ColorDisplay.pause(5);
		}		
	}
	public static void Blinkline(int row , int ht , String colour)
	{
		for (int i=0; i<ht; i++)
		{
			ColorDisplay.setPixelOFF(i,row);
			ColorDisplay.pause(5);
			ColorDisplay.setPixelColor(i,row,colour);
		}
	}
	public static void Blink()
	{
		ColorDisplay.setPixelColor(5, 10, "RED");
		ColorDisplay.pause(5);
		ColorDisplay.setPixelOFF(5, 10);
	}
	public static void VertLineAtColwithpara1(int ht, int col, String color)
	{
		for (int i=1; i<ht; i++)
		{
			ColorDisplay.setPixelColor(i, col, color);
			ColorDisplay.pause(5);
		}
	}	
	public static void horlinewithpara1(int length,int horizontial,String color)
	{	 
		for(int x=1 ; x <length ; x++) 
		{
			ColorDisplay.setPixelColor(horizontial, x, color);
			ColorDisplay.pause(5);
		}		
	}
	public static void VertLineAtColwithpara2(int ht, int col, String color)
	{
		for (int i=2; i<ht; i++)
		{
			ColorDisplay.setPixelColor(i, col, color);
			ColorDisplay.pause(5);
		}
	}
	public static void horlinewithpara2(int length,int horizontial,String color)
	{	 
		for(int x=2 ; x <length ; x++) 
		{
			ColorDisplay.setPixelColor(horizontial, x, color);
			ColorDisplay.pause(5);
		}		
	}
	public static void VertLineAtColwithpara3(int ht, int col, String color)
	{
		for (int i=3; i<ht; i++)
		{
			ColorDisplay.setPixelColor(i, col, color);
			ColorDisplay.pause(5);
		}
	}
	public static void horlinewithpara3(int length,int horizontial,String color)
	{	 
		for(int x=3 ; x <length ; x++) 
		{
			ColorDisplay.setPixelColor(horizontial, x, color);
			ColorDisplay.pause(5);
		}		
	}
	public static void VertLineAtColwithpara4(int ht, int col, String color)
	{
		for (int i=4; i<ht; i++)
		{
			ColorDisplay.setPixelColor(i, col, color);
			ColorDisplay.pause(5);
		}
	}
	public static void horlinewithpara4(int length,int horizontial,String color)
	{	 
		for(int x=4 ; x <length ; x++) 
		{
			ColorDisplay.setPixelColor(horizontial, x, color);
			ColorDisplay.pause(5);
		}		
	}
	public static void pacmancm(int r, int c)
	{
		ColorDisplay.setPixelColor(r,c,"ORANGE");
		ColorDisplay.setPixelColor(r,c+1,"ORANGE");
		ColorDisplay.setPixelColor(r,c+2,"ORANGE");
		ColorDisplay.setPixelColor(r,c+3,"ORANGE");
		ColorDisplay.setPixelColor(r,c+4,"ORANGE");
		ColorDisplay.setPixelColor(r,c+5,"ORANGE");
		ColorDisplay.setPixelColor(r+1,c+1,"ORANGE");
		ColorDisplay.setPixelColor(r+1,c+2,"ORANGE");
		ColorDisplay.setPixelColor(r+1,c+3,"BLACK");
		ColorDisplay.setPixelColor(r+1,c+4,"ORANGE");
		ColorDisplay.setPixelColor(r+2,c+2,"ORANGE");
		ColorDisplay.setPixelColor(r+2,c+3,"ORANGE");
		ColorDisplay.setPixelColor(r-1,c+1,"ORANGE");
		ColorDisplay.setPixelColor(r-1,c+2,"ORANGE");
		ColorDisplay.setPixelColor(r-1,c+3,"ORANGE");
		ColorDisplay.setPixelColor(r-1,c+4,"ORANGE");
		ColorDisplay.setPixelColor(r-2,c+2,"ORANGE");
		ColorDisplay.setPixelColor(r-2,c+3,"ORANGE");
	}
	public static void pacmanom(int r, int c)
	{
		ColorDisplay.setPixelColor(r,c,"ORANGE");
		ColorDisplay.setPixelColor(r,c+1,"ORANGE");
		ColorDisplay.setPixelColor(r,c+2,"ORANGE");
		ColorDisplay.setPixelColor(r,c+3,"ORANGE");
		ColorDisplay.setPixelColor(r+1,c+1,"ORANGE");
		ColorDisplay.setPixelColor(r+1,c+2,"ORANGE");
		ColorDisplay.setPixelColor(r+1,c+3,"BLACK");
		ColorDisplay.setPixelColor(r+1,c+4,"ORANGE");
		ColorDisplay.setPixelColor(r+2,c+2,"ORANGE");
		ColorDisplay.setPixelColor(r+2,c+3,"ORANGE");
		ColorDisplay.setPixelColor(r-1,c+1,"ORANGE");
		ColorDisplay.setPixelColor(r-1,c+2,"ORANGE");
		ColorDisplay.setPixelColor(r-1,c+3,"ORANGE");
		ColorDisplay.setPixelColor(r-1,c+4,"ORANGE");
		ColorDisplay.setPixelColor(r-2,c+2,"ORANGE");
		ColorDisplay.setPixelColor(r-2,c+3,"ORANGE");
	}
	public static void pacmanomreversed(int r, int c)
	{
		ColorDisplay.setPixelColor(r,c,"ORANGE");
		ColorDisplay.setPixelColor(r,c-1,"ORANGE");
		ColorDisplay.setPixelColor(r,c-2,"ORANGE");
		ColorDisplay.setPixelColor(r,c-3,"ORANGE");
		ColorDisplay.setPixelColor(r+1,c-1,"ORANGE");
		ColorDisplay.setPixelColor(r+1,c-2,"ORANGE");
		ColorDisplay.setPixelColor(r+1,c-3,"BLACK");
		ColorDisplay.setPixelColor(r+1,c-4,"ORANGE");
		ColorDisplay.setPixelColor(r+2,c-2,"ORANGE");
		ColorDisplay.setPixelColor(r+2,c-3,"ORANGE");
		ColorDisplay.setPixelColor(r-1,c-1,"ORANGE");
		ColorDisplay.setPixelColor(r-1,c-2,"ORANGE");
		ColorDisplay.setPixelColor(r-1,c-3,"ORANGE");
		ColorDisplay.setPixelColor(r-1,c-4,"ORANGE");
		ColorDisplay.setPixelColor(r-2,c-2,"ORANGE");
		ColorDisplay.setPixelColor(r-2,c-3,"ORANGE");
	}
	public static void pacmancmreversed(int r, int c)
	{
		ColorDisplay.setPixelColor(r,c,"ORANGE");
		ColorDisplay.setPixelColor(r,c-1,"ORANGE");
		ColorDisplay.setPixelColor(r,c-2,"ORANGE");
		ColorDisplay.setPixelColor(r,c-3,"ORANGE");
		ColorDisplay.setPixelColor(r,c-4,"ORANGE");
		ColorDisplay.setPixelColor(r,c-5,"ORANGE");
		ColorDisplay.setPixelColor(r+1,c-1,"ORANGE");
		ColorDisplay.setPixelColor(r+1,c-2,"ORANGE");
		ColorDisplay.setPixelColor(r+1,c-3,"BLACK");
		ColorDisplay.setPixelColor(r+1,c-4,"ORANGE");
		ColorDisplay.setPixelColor(r+2,c-2,"ORANGE");
		ColorDisplay.setPixelColor(r+2,c-3,"ORANGE");
		ColorDisplay.setPixelColor(r-1,c-1,"ORANGE");
		ColorDisplay.setPixelColor(r-1,c-2,"ORANGE");
		ColorDisplay.setPixelColor(r-1,c-3,"ORANGE");
		ColorDisplay.setPixelColor(r-1,c-4,"ORANGE");
		ColorDisplay.setPixelColor(r-2,c-2,"ORANGE");
		ColorDisplay.setPixelColor(r-2,c-3,"ORANGE");
	}
	public static void sootinglinedown(int x, int y)
	{
		ColorDisplay.setPixelColor(x,y,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-1,y+1,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-2,y+2,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-3,y+3,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-4,y+4,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-5,y+5,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-6,y+6,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-7,y+7,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-8,y+8,"CYAN");
		
	}
	public static void sootinglinedowN7long(int x, int y)
	{
		ColorDisplay.setPixelColor(x,y,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-1,y+1,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-2,y+2,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-3,y+3,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-4,y+4,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-5,y+5,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-6,y+6,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-7,y+7,"BLACK");
	}
	public static void sootinglinedowN6long(int x, int y)
	{
		ColorDisplay.setPixelColor(x,y,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-1,y+1,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-2,y+2,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-3,y+3,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-4,y+4,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-5,y+5,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-6,y+6,"CYAN");
	}
	public static void sootinglinedowN5long(int x, int y)
	{
		ColorDisplay.setPixelColor(x,y,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-1,y+1,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-2,y+2,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-3,y+3,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-4,y+4,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-5,y+5,"BLACK");
	}
	public static void sootinglinedowN4long(int x, int y)
	{
		ColorDisplay.setPixelColor(x,y,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-1,y+1,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-2,y+2,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-3,y+3,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-4,y+4,"CYAN");
	}
	public static void sootinglinedowN3long(int x, int y)
	{
		ColorDisplay.setPixelColor(x,y,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-1,y+1,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-2,y+2,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-3,y+3,"BLACK");
	}
	public static void sootinglinedowN2long(int x, int y)
	{
		ColorDisplay.setPixelColor(x,y,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-1,y+1,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-2,y+2,"CYAN");
	}
	public static void sootinglinedowN1long(int x, int y)
	{
		ColorDisplay.setPixelColor(x,y,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x-1,y+1,"BLACK");
	}
	public static void sootinglineup(int x, int y)
	{
		ColorDisplay.setPixelColor(x,y,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+1,y+1,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+2,y+2,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+3,y+3,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+4,y+4,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+5,y+5,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+6,y+6,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+7,y+7,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+8,y+8,"CYAN");
	}
	public static void sootinglineup7long(int x, int y)
	{
		ColorDisplay.setPixelColor(x,y,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+1,y+1,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+2,y+2,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+3,y+3,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+4,y+4,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+5,y+5,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+6,y+6,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+7,y+7,"BLACK");
		
	}
	public static void sootinglineup6long(int x, int y)
	{
		ColorDisplay.setPixelColor(x,y,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+1,y+1,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+2,y+2,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+3,y+3,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+4,y+4,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+5,y+5,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+6,y+6,"CYAN");
	}
	public static void sootinglineup5long(int x, int y)
	{
		ColorDisplay.setPixelColor(x,y,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+1,y+1,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+2,y+2,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+3,y+3,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+4,y+4,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+5,y+5,"BLACK");	
	}
	public static void sootinglineup4long(int x, int y)
	{
		ColorDisplay.setPixelColor(x,y,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+1,y+1,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+2,y+2,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+3,y+3,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+4,y+4,"CYAN");
	}
	public static void sootinglineup3long(int x, int y)
	{
		ColorDisplay.setPixelColor(x,y,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+1,y+1,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+2,y+2,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+3,y+3,"BLACK");	
	}
	public static void sootinglineup2long(int x, int y)
	{
		ColorDisplay.setPixelColor(x,y,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+1,y+1,"CYAN");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+2,y+2,"CYAN");
	}
	public static void sootinglineup1long(int x, int y)
	{
		ColorDisplay.setPixelColor(x,y,"BLACK");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(x+1,y+1,"BLACK");
	}
	public static void box(int r, int c, String color)
	{
		ColorDisplay.setPixelColor(r,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+1,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+2,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+3,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+4,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+5,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+6,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+7,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+8,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+9,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c+1,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c+2,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c+3,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c+4,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c+5,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c+6,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c+7,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c+8,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c+9,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+2,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+2,c+1,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+2,c+2,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+2,c+3,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+2,c+4,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+2,c+5,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+2,c+6,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+2,c+7,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+2,c+8,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+2,c+9,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+3,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+3,c+1,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+3,c+2,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+3,c+3,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+3,c+4,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+3,c+5,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+3,c+6,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+3,c+7,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+3,c+8,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+3,c+9,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+4,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+4,c+1,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+4,c+2,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+4,c+3,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+4,c+4,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+4,c+5,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+4,c+6,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+4,c+7,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+4,c+8,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+4,c+9,color);
	}
	public static void boxreverse(int r, int c, String color)
	{
		ColorDisplay.setPixelColor(r,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-1,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-2,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-3,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-4,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-5,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-6,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-7,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-8,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-9,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c-1,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c-2,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c-3,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c-4,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c-5,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c-6,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c-7,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c-8,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c-9,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+2,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+2,c-1,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+2,c-2,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+2,c-3,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+2,c-4,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+2,c-5,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+2,c-6,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+2,c-7,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+2,c-8,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+2,c-9,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+3,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+3,c-1,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+3,c-2,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+3,c-3,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+3,c-4,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+3,c-5,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+3,c-6,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+3,c-7,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+3,c-8,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+3,c-9,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+4,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+4,c-1,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+4,c-2,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+4,c-3,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+4,c-4,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+4,c-5,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+4,c-6,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+4,c-7,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+4,c-8,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+4,c-9,color);
	}
	public static void lineright(int r, int c,String color)
	{
		ColorDisplay.setPixelColor(r,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+1,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+2,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+3,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+4,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+5,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+6,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+7,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+8,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+9,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+10,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+11,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+12,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+13,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+14,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+15,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+16,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+17,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+18,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+19,color);
	}
	public static void lineleft(int r, int c,String color)
	{
		ColorDisplay.setPixelColor(r,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-1,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-2,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-3,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-4,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-5,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-6,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-7,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-8,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-9,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-10,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-11,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-12,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-13,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-14,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-15,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-16,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-17,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-18,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c-19,color);
	}
	public static void lineup(int r, int c,String color)
	{
		ColorDisplay.setPixelColor(r,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+2,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+3,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+4,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+5,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+6,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+7,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+8,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+9,c,color);
	}
	public static void linedown(int r, int c,String color)
	{
		ColorDisplay.setPixelColor(r,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-1,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-2,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-3,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-5,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-6,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-7,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-8,c,color);
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-9,c,color);
		ColorDisplay.pause(50);
	}
	public static void smile(int r, int c)
	{
		ColorDisplay.setPixelColor(r,c,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c+1,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+2,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+6,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c+7,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+8,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-2,c-1,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-3,c,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+1,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+2,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+3,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+4,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+5,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+6,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+7,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-3,c+8,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-2,c+9,"RED");
	}
	public static void smilewink(int r, int c)
	{
		ColorDisplay.setPixelColor(r,c,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c+1,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+2,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+6,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+7,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+8,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-2,c-1,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-3,c,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+1,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+2,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+3,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+4,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+5,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+6,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+7,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-3,c+8,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-2,c+9,"RED");
	}
	public static void sad(int r, int c)
	{
		ColorDisplay.setPixelColor(r,c,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c+1,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+2,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+6,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c+7,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+8,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-6,c-1,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-5,c,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+1,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+2,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+3,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+4,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+5,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+6,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+7,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-5,c+8,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-6,c+9,"RED");
	}
	public static void sadwink(int r, int c)
	{
		ColorDisplay.setPixelColor(r,c,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r+1,c+1,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+2,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+6,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+7,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r,c+8,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-6,c-1,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-5,c,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+1,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+2,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+3,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+4,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+5,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+6,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-4,c+7,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-5,c+8,"RED");
		ColorDisplay.pause(50);
		ColorDisplay.setPixelColor(r-6,c+9,"RED");
	}
	public static void onBeat(int c)
	{
		System.out.println("At beat : " + c);
		
		// FROM 0-20 COLORING OF SCREEN BLACK AND CYAN
		
		if (c==0)
		{
			VertLineAtCol(0,10,"BLACK");
		}
		if (c==1)
		{
			horline(20,9,"BLACK");
		}
		if (c==2)
		{
			VertLineAtCol(19,10,"BLACK");
		}
		if (c==3)
		{
			horline(20,0,"BLACK");
		}
		if (c==4)
		{
			VertLineAtColwithpara1(9,1,"CYAN");
		}
		if (c==5)
		{
			horlinewithpara1(19,8,"CYAN");
		}
		if (c==6)
		{
			VertLineAtColwithpara1(9,18,"CYAN");
		}
		if (c==7)
		{
			horlinewithpara1(19,1,"CYAN");
		}
		if (c==8)
		{
			VertLineAtColwithpara2(8,2,"BLACK");
		}
		if (c==9)
		{
			horlinewithpara2(18,7,"BLACK");
		}
		if (c==10)
		{
			VertLineAtColwithpara2(8,17,"BLACK");
		}
		if (c==11)
		{
			horlinewithpara2(18,2,"BLACK");
		}
		if (c==12)
		{
			VertLineAtColwithpara3(7,3,"CYAN");
		}
		if (c==13)
		{
			horlinewithpara3(17,6,"CYAN");
		}
		if (c==14)
		{
			VertLineAtColwithpara3(7,16,"CYAN");
		}
		if (c==15)
		{
			horlinewithpara3(17,3,"CYAN");
		}
		if (c==16)
		{
			VertLineAtColwithpara4(6,4,"BLACK");
		}
		if (c==17)
		{
			horlinewithpara4(16,5,"BLACK");
		}
		if (c==18)
		{
			VertLineAtColwithpara4(6,15,"BLACK");
		}
		if (c==19)
		{
			horlinewithpara4(16,4,"BLACK");
		}
		if (c==20)
		{
			 ColorDisplay.setScreenOFF();
		}
		
		
		// DRAWING AND MOVEMENT OF PACMAN 
		
		if (c==21)
		{
			pacmancm(2,0);
			ColorDisplay.setPixelColor(2, 12, "RED");
		}
		if (c==22)
		{
			ColorDisplay.setScreenOFF();
		}
		if(c==23)
		{
			pacmanom(2,4);
			ColorDisplay.setPixelColor(2, 12, "RED");
		}
		if(c==24)
		{
			ColorDisplay.setScreenOFF();
		}
		if(c==25)
		{
			pacmancm(2,6);
			ColorDisplay.setPixelColor(2, 12, "RED");
		}
		if(c==26)
		{
			ColorDisplay.setScreenOFF();
		}
		if(c==27)
		{
			pacmanom(2,8);
			ColorDisplay.setPixelColor(2, 12, "RED");
		}
		if(c==28)
		{
			ColorDisplay.setScreenOFF();
		}
		if(c==29)
		{
			pacmancm(2,10);
		}
		if(c==30)
		{
			ColorDisplay.setScreenOFF();
		}
		if(c==31)
		{
			pacmanom(2,12);
		}
		if(c==32)
		{
			ColorDisplay.setScreenOFF();
		}
		if(c==33)
		{
			pacmancm(2,14);
		}
		if(c==34)
		{
			ColorDisplay.setScreenOFF();
		}
		if(c==35)
		{
			 pacmancmreversed(7,14);
			 ColorDisplay.setPixelColor(7, 4, "CYAN");
		}
		if(c==36)
		{
			ColorDisplay.setScreenOFF();
		}
		if(c==37)
		{
			pacmanomreversed(7,12);
			ColorDisplay.setPixelColor(7, 4, "CYAN");
		}
		if(c==38)
		{
			ColorDisplay.setScreenOFF();
		}
		if(c==39)
		{
			 pacmancmreversed(7,10);
			 ColorDisplay.setPixelColor(7, 4, "CYAN");
		}
		if(c==40)
		{
			ColorDisplay.setScreenOFF();
		}
		if(c==41)
		{
			pacmanomreversed(7,8);
			ColorDisplay.setPixelColor(7, 4, "CYAN");
		}
		if(c==42)
		{
			ColorDisplay.setScreenOFF();
		}
		if(c==43)
		{
			 pacmancmreversed(7,6);
		}
		if(c==44)
		{
			ColorDisplay.setScreenOFF();
		}
		if(c==45)
		{
			pacmanomreversed(7,4);
		}
		if(c==46)
		{
			ColorDisplay.setScreenOFF();
		}
		
		
		// COLORING OF SCREEN VERTICALLY
		
		if(c==47)
		{
			VertLineAtCol(0,10,"BLACK");
		}
		if(c==48)
		{
			VertLineAtCol(1,9,"BLACK");
		}
		if(c==49)
		{
			VertLineAtCol(2,8,"BLACK");
		}
		if(c==50)
		{
			VertLineAtCol(3,7,"BLACK");
		}
		if(c==51)
		{
			VertLineAtCol(4,6,"BLACK");
		}
		if(c==52)
		{
			VertLineAtCol(5,5,"BLACK");
		}
		if(c==53)
		{
			VertLineAtCol(6,4,"BLACK");
		}
		if(c==54)
		{
			VertLineAtCol(7,3,"BLACK");
		}
		if(c==55)
		{
			VertLineAtCol(8,2,"BLACK");
		}
		if(c==56)
		{
			VertLineAtCol(9,1,"BLACK");
		}
		if(c==57)
		{
			VertLineAtCol(10,1,"BLACK");
		}
		if(c==58)
		{
			VertLineAtCol(11,2,"BLACK");
		}
		if(c==59)
		{
			VertLineAtCol(12,3,"BLACK");
		}
		if(c==60)
		{
			VertLineAtCol(13,4,"BLACK");
		}
		if(c==61)
		{
			VertLineAtCol(14,5,"BLACK");
		}
		if(c==62)
		{
			VertLineAtCol(15,6,"BLACK");
		}
		if(c==63)
		{
			VertLineAtCol(16,7,"BLACK");
		}
		if(c==64)
		{
			VertLineAtCol(17,8,"BLACK");
		}
		if(c==65)
		{
			VertLineAtCol(18,9,"BLACK");
		}
		if(c==66)
		{
			VertLineAtCol(19,10,"BLACK");
		}
		
		// SHOOTING UP LINE AND SHOOTING DOWN LINE
		
		if(c==67)
		{
			sootinglinedown(9,1);
		}
		if(c==68)
		{
			sootinglineup(1,10);
		}
		if(c==69)
		{
			 sootinglinedowN7long(9,2);
		}
		if(c==70)
		{
			 sootinglineup7long(2,10);
		}
		if(c==71)
		{
			sootinglinedowN6long(9,3);
		}
		if(c==72)
		{
			sootinglineup6long(3,10);
		}
		if(c==73)
		{
			sootinglinedowN5long(9,4);
		}
		if(c==74)
		{
			sootinglineup5long(4,10);
		}
		if(c==75)
		{
			sootinglinedowN4long(9,5);
		}
		if(c==76)
		{
			sootinglineup4long(5,10);
		}
		if(c==77)
		{
			sootinglinedowN3long(9,6);
		}
		if(c==78)
		{
			sootinglineup3long(6,10);
		}
		if(c==79)
		{
			sootinglinedowN2long(9,7);
		}
		if(c==80)
		{
			sootinglineup2long(7,10);
		}
		if(c==81)
		{
			sootinglinedowN1long(9,8);
		}
		if(c==82)
		{
			sootinglineup1long(8,10);
		}
		if(c==83)
		{
			ColorDisplay.setPixelColor(9, 9, "CYAN");
			ColorDisplay.setPixelColor(9, 10, "CYAN");
		}
		if(c==85)
		{
			ColorDisplay.setScreenOFF();
		}
		
		//LETTERING OF START
		
		if(c==86)
		{
			ColorDisplay.setPixelColor(6, 2, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(6, 1, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(5, 0, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(4, 0, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(3, 1, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(3, 2, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(2, 3, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(1, 3, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(0, 2, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(0, 1, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(6, 4, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(6, 5, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(6, 6, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(5, 5, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(4, 5, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(3, 5, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(2, 5, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(1, 5, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(0, 5, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(6, 9, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(5, 8, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(4, 7, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(3, 7, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(2, 7, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(1, 7, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(0, 7, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(5, 10, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(4, 11, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(3, 11, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(2, 11, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(1, 11, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(0, 11, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(3, 8, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(3, 9, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(3, 10, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(6, 13, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(5, 13, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(4, 13, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(3, 13, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(2, 13, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(1, 13, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(0, 13, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(6, 14, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(6, 15, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(5, 16, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(4, 16, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(3, 15, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(3, 14, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(2, 15, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(1, 16, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(0, 16, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(6, 17, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(6, 18, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(6, 19, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(5, 18, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(4, 18, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(3, 18, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(2, 18, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(1, 18, "RED");
			ColorDisplay.pause(10);
			ColorDisplay.setPixelColor(0, 18, "RED");
			ColorDisplay.pause(10);
		}
		if(c==90)
		{
			ColorDisplay.setScreenOFF();
		}
		
		// COLORING OF SCREEN IN SECTIONS OF 5 BY 10 BOXES OF DIFF COLOR
		
		if(c==91)
		{
			box(0,0,"BLACK");
		}
		if(c==96)
		{
			box(5,0,"RED");
		}
		if(c==101)
		{
			boxreverse(0,19,"RED");
		}
		if(c==105)
		{
			boxreverse(5,19,"BLACK");
		}
		if(c==111)
		{
			ColorDisplay.setScreenOFF();
		}
		if(c==112)
		{
			box(0,0,"BLUE");
		}
		if(c==117)
		{
			box(5,0,"CYAN");
		}
		if(c==122)
		{
			boxreverse(0,19,"CYAN");
		}
		if(c==127)
		{
			boxreverse(5,19,"BLUE");
		}
		if(c==132)
		{
			ColorDisplay.setScreenOFF();
		}
		if(c==133 )
		{
			box(0,0,"RED");
		}
		if(c==138)
		{
			box(5,0,"ORANGE");
		}
		if(c==142)
		{
			boxreverse(0,19,"ORANGE");
		}
		if(c==147)
		{
			boxreverse(5,19,"RED");
		}
		if(c==152)
		{
			ColorDisplay.setScreenOFF();
		}
		
		// COLORING OF SCREEN LINE BY LINE 
		
		if(c==153)
		{
			 lineright(0,0,"BLACK");
		}
		if(c==155)
		{
			lineleft(1,19,"RED");
		}
		if(c==157)
		{
			lineright(2,0,"BLACK");
		}
		if(c==159)
		{
			lineleft(3,19,"RED");
		}
		if(c==161)
		{
			lineright(4,0,"BLACK");
		}
		if(c==163)
		{
			lineleft(5,19,"RED");
		}
		if(c==165)
		{
			lineright(6,0,"BLACK");
		}
		if(c==167)
		{
			lineleft(7,19,"RED");
		}
		if(c==169)
		{
			lineright(8,0,"BLACK");
		}
		if(c==171)
		{
			lineleft(9,19,"RED");
		}
		if(c==173)
		{
			lineup(0,0,"BLACK");
		}
		if(c==175)
		{
			linedown(9,1,"ORANGE");
		}
		if(c==177)
		{
			lineup(0,2,"BLACK");
		}
		if(c==179)
		{
			linedown(9,3,"ORANGE");
		}
		if(c==181)
		{
			lineup(0,4,"BLACK");
		}
		if(c==183)
		{
			linedown(9,5,"ORANGE");
		}
		if(c==185)
		{
			lineup(0,6,"BLACK");
		}
		if(c==187)
		{
			linedown(9,7,"ORANGE");
		}
		if(c==189)
		{
			lineup(0,8,"BLACK");
		}
		if(c==191)
		{
			linedown(9,9,"ORANGE");
		}
		if(c==193)
		{
			lineup(0,10,"BLACK");
		}
		if(c==195)
		{
			linedown(9,11,"ORANGE");
		}
		if(c==197)
		{
			lineup(0,12,"BLACK");
		}
		if(c==199)
		{
			linedown(9,13,"ORANGE");
		}
		if(c==201)
		{
			lineup(0,14,"BLACK");
		}
		if(c==203)
		{
			linedown(9,15,"ORANGE");
		}
		if(c==205)
		{
			lineup(0,16,"BLACK");
		}
		if(c==207)
		{
			linedown(9,17,"ORANGE");
		}
		if(c==209)
		{
			lineup(0,18,"BLACK");
		}
		if(c==211)
		{
			linedown(9,19,"ORANGE");
		}
		if(c==213)
		{
			ColorDisplay.setScreenOFF();
		}
		
		// DRAWING OF SMILY FACES AND SAD FACES WITH WINKING
		
		if(c==214)
		{
			smile(6,5);
		}
		if(c==216)
		{
			ColorDisplay.setScreenOFF();
		}
		if(c==218)
		{
			smilewink(6,5);
		}
		if(c==220)
		{
			ColorDisplay.setScreenOFF();
		}
		if(c==222)
		{
			sad(6,5);
		}
		if(c==224)
		{
			ColorDisplay.setScreenOFF();
		}
		if(c==226)
		{
			sadwink(6,5);
		}
		if(c==228)
		{
			ColorDisplay.setScreenOFF();
		}
		if(c==231)
		{
			sad(6,5);
		}
		if(c==234)
		{
			ColorDisplay.setScreenOFF();
		}
		
		// DRAWING OF LETTER T
		
		if(c==236)
		{
			ColorDisplay.setPixelColor(7, 1, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(7, 2, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(7, 3, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(7, 4, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(7, 5, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(6, 3, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(5, 3, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(4, 3, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(3, 3, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(2, 3, "RED");
			ColorDisplay.pause(200);
		}
		
		// DRAWING OF LETTER Q
		
		if(c==239)
		{
			ColorDisplay.setPixelColor(7, 7, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(7, 8, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(7, 9, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(6, 10, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(5, 10, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(4, 10, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(3, 10, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(2, 9, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(2, 8, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(2, 7, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(4, 6, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(3, 6, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(5, 6, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(6, 6, "RED");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(2, 11, "RED");
			ColorDisplay.pause(200);
		}
		
		// DRAWING OF DOTS 
		
		if(c==242)
		{
			ColorDisplay.setPixelColor(1, 13, "BLACK");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(1, 15, "BLACK");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(1, 17, "BLACK");
			ColorDisplay.pause(200);
			ColorDisplay.setPixelColor(1, 19, "BLACK");
			ColorDisplay.pause(200);
		}
	}
}


