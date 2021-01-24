// Kathy Zeng
// 1/19/21
// GradeStats.java
// Description: This program calculates at least one student's grade.

import java.util.Scanner;

public class GradeStats
{
	private int[] score; // Identify students' scores properties
	private String input; // Get a user input in getInput() method and in
	// calculateIt() method in a do-while condition, a user can stop a loop
	// by typing "Quit". 
	
	public GradeStats()
	{
		score = new int[20];
		input = new String("");
	}

	public static void main(String[] args)
	{
		GradeStats gs = new GradeStats();
		gs.calculateIt();
	}

	// Call all printing and calculating methods.
	public void calculateIt()
	{
		getInput();
		int numScoreBelow75 = gScore();
		int max = max(); 
		int minNum = minNum();
		double averageNum = averageNum();
		orderNum();
		int[] orderScore = new int[20];
		double medianNum = medianNum(orderScore);
		computeScores(numScoreBelow75, max, minNum, averageNum, medianNum);
	}
	
	// Print 3 blank lines and get a user input in a do-while loop.
	public void getInput() 
	{
		Scanner src = new Scanner(System.in);
		System.out.println("\n\n\n");
		int index = 0;
		do
		{
			System.out.print("Type in the score. Type " + "Quit" + 
				" to end the program --> "); 
			input = src.next();
			if(!input.equalsIgnoreCase("Quit") )
			{	
				score[index] = Integer.parseInt(input);
				index++; 
			}	
		} while(!input.equalsIgnoreCase("Quit") );
	} 
	
	// Determine whether any students' score below 75% by using an if statement. 
	public int gScore()
	{
		int numStudent = 0; 
		for(int i = 0; i < score[i]; i++)
		{	
			if(score[i] < 75)
				numStudent += 1;
		}
		return numStudent;
	}
	// Compare values to each other until it finds a biggest score number. 
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
	
	// Compare values to each other until it finds a smallest score number. 
	public int minNum()
	{
		int minimum = 0;  
        	for(int j = 0; j > score.length; j++)   
        	{  
               		if(score[j] < minimum)   
             		{  
                 		minimum = score[j];
             		}    
        	}  
        	return minimum;  
	}
	
	// Calculates an average score.
	public double averageNum()
	{
		int total = 0;
		for(int i = 0; i < score.length; i++)
		{
			total += score[i]; 
		}
        	double average = total / score.length;
		return average;
	}
	
	// Organizes scores from least to greatest.
	public void orderNum()
	{
		int num1 = 0; 
		int num2 = 0; 
		int tempVan = 0;
		for(int i = 0; i < score.length; i++)
		{
			if(num1 < num2)
			{	
				tempVan = num1;
				num1 = num2;
				num2 = tempVan; 
			}
		}
	}
	
	// Calculates median scores of students. If even, it calculates average of the 
	// two middle numbers. If odd, just a middle number.
	public double medianNum(int[] orderScore) 
	{
		double median = 0.0; 
		if(orderScore.length % 2 != 0)
			median = (orderScore[score.length/2] + orderScore[score.length/2])/2;	
		else
			median = (orderScore[orderScore.length/2] + orderScore[score.length/2 - 1])/2;
		return median;
	}

	// Prints overall results of students.
	public void computeScores(int numStudentBelow75, int maxNum, int min, double
	avg, double med)
	{
		System.out.println();
		System.out.print("Here is the data you entered: ");
		int i;
		for(i = 0; i < score[i]; i++)
		{
			if(numStudentBelow75 < 10)
				System.out.printf("\n%19s %2d", "Student %d's score:", score[i],
				 numStudentBelow75);
			else if(numStudentBelow75 >= 10)
				System.out.printf("\n%20s %2d", "Student %d's score:", score[i], 
				 numStudentBelow75);
		}
		if(numStudentBelow75 != 0)
			System.out.printf("\n\nThere were %d students who scored below 75%%: ", 
				numStudentBelow75);
		for(int j = 0; j < score[j]; j++)
		{
			if(score[j] < 75 && numStudentBelow75 != 1)
				System.out.printf("student %d, ", j+1);
		}
	        if(numStudentBelow75 == 0)
			System.out.println("\n\nThere is no student who scores below 75%.");
	        if(score[score.length - 1] < 75 && numStudentBelow75 >= 1) 
			System.out.printf("Student %d.", j); 
		System.out.println();
		System.out.printf("\n%-17s %2d", "Number of scores:", score[i]);
		System.out.printf("\n%-17s %2d", "Minimum:", min);
		System.out.printf("\n%-17s %3d", "Maximum:", maxNum);
		System.out.printf("\n%-17s %4.1f", "Average:", avg);
		System.out.printf("\n%-17s %4.1f", "Median:", med);
		System.out.println("\n\n\n");
	}
}
