package com.nissan.bean;

public class DemoArray
{

	public static void main(String[] args)
	{
		
		//two dimensional array-declaration
		int[] [] arrGrids = new int[4] [5];   //[row] [col]
		int numRows= arrGrids.length;
		int numCol=arrGrids[0].length;
		
		//fill in Grids
		for(int row=0; row<numRows; ++row) //outer-row
		{
			for(int col=0; col<numCol; ++col) //inner-col
			{
				System.out.printf("%3d",arrGrids[row] [col]=row*numCol + col+1);
			}
			System.out.println();
		}
		
	}

}
