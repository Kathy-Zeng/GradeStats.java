// Kathy Zeng
// 1/19/21
// GradeStats.java
// Description: This program calculates at least one student's grade.

import java.util.Scanner;

public class GradeStats
{
	private int[] score;
	
	public GradeStats()
	{
		score = new int[20]{2, 4, 6, 7, 8};
	}

	public static void main(String[] args)
	{
		GradeStats gs = new GradeStats();
		gs.calculateIt();
	}

	// A new String variable
	public void calculateIt()
	{
		String input = new String("");
		do
		{
			getInput();
		} while(!input.equalsIgnoreCase("Quit") );
		max();
		minNum();
		averageNum();
		orderNum();
		medianNum();
		computeScores();
	}

	//
	public void getInput()
	{
		String input = new String("");
		Scanner src = new Scanner(System.in);
		System.out.println("\n\n\n");
		if(!input.equalsIgnoreCase("Quit") )
		{
			System.out.print("Type in the score. Type " + "Quit" + " to end the program --> ");
			input = Integer.parseInt(src.next() );
		}
	}
	
	// Compare values to each other. 
	public int max()
	{
		int maximum = -1;
		for(int i = 0; i < score.length; i++)
        { 
			if(score[i] > maximum)
			{
				maximum = score[i];
			}
		}
		return maximum;
	}
	
	//
	public int minNum()
	{
		int minimum = -1;  
        for(int j = 0; j < score.length; j++)   
        {  
                if(score[j] < minimum)   
                {  
                    minimum = score[j];
                }    
        }  
        return minimum;  
	}
	
	// If even. If odd.
	public void averageNum()
	{
		double[] arr;
		for(int i = 0; i < arr.length; i++)
		{
        	total = total + arr[i];
        }
        double average = total / arr.length;
	}
	
	// Organizes scores from least to greatest.
	public void orderNum()
	{
		int num1 = 0; 
		int num2 = 0; 
		int tempVan = 0;
		for(int i = 0; i < score.length(); i++)
		{
			if(num1 < num2)
			{	
				tempVan = num1;
				num1 = num2;
				num2 = tempVan; 
			}
		}
	}
	
	//
	public void medianNum()
	{
		double median = 0.0; 
		double avg = 0.0;
		int total = 0; 
		int index = 0;
		if(score % 1 == 0)
		{
			for (int i = 0; i < score.length(); i++)
			{
				sum += score[20];
			}
			total = sum;
			avg = total / index;

			median = score[score.length/2];
		}	
	
		else if(score % 2 == 0)
		{
			int sum = 0;
			for (int j = 0; j < score.length; j++)
			{
				sum += score[j];
			}
		}
	}
	
	// Prints overall results of students.
	public void computeScores()
	{
		int num = 0;
		int minimum = 0;
		int maximum = 0;
		double average = 0.0;
		double median = 0.0;
		System.out.println("\n");
		System.out.print("Here is the data you entered: ");
		for(int i = 0; i < score.length; i++)
		{
			System.out.printf("%nStudent %d's score: ", score[i]);
			int students = 1;
			if(score < 75)
				System.out.println("\n");
				System.out.print("There were " + students + "who scored below 75%: "
					+ students + ".");
		}
		System.out.println("\n");
		System.out.printf("Number of scores: %4d", score);
		System.out.printf("%nMinimum: %14d", minimum);
		System.out.printf("%nMaximum: %14d", maximum);
		System.out.printf("%nAverage: %14.1f", average);
		System.out.printf("%nMedian: %14.1f", median);
		System.out.println("\n\n\n");
	}
}
