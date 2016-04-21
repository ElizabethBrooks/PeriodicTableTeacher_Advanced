import java.io.*;
import java.util.Scanner;
import java.util.*;
import javax.swing.JOptionPane;

//A class that will quiz the user on elements and print their results to the screen
public class ElementQuiz {
	
	//Declare the var for and set the name of the file the quiz results will print to
	private String fileName = "elementQUizResults.txt";
	private String quizAnswer;
	private int atomicNumQuestion;
	private String userAnswer = null;
	
	//The class constructor
	public ElementQuiz(){
	}
	
	//Method to get the value of the random atomic number
	public int getRandomQuizQuestion(){
		return atomicNumQuestion;
	}
	
	//Method to retrieve the users answer
	public String getUserAnswer(){
		return userAnswer.toUpperCase();
	}
	
	//Method that will set the random atomic number of an element
	public void setRandomQuizQuestion(){
		Random randomAtomicNum = new Random();
		
		//Generate random atomic numbers between 1 and 118
		atomicNumQuestion = randomAtomicNum.nextInt(120) + 1;		
	}
	
	//Quiz the user on elements based on their atomic number
	public void setUserAnswer(){
		//Declare and initialize variables for use in quizzing the user on elements by atomic number
		String quizYesOrNo = null;
		boolean invalidEntry = true;
		
		//Determine if the users inputed entry is valid 
		while (invalidEntry)
		{
			//Set the invalidEntry boolean to false so that when the user's input is valid, the while loop exits.
			invalidEntry = false;
		
			//Ask the user if they would like to be quizzed on the elements by atomic number
			quizYesOrNo = JOptionPane.showInputDialog("Would you like to be quized on the elements by their atomic number? (YES or NO)");
			quizYesOrNo.toUpperCase();
			
			//If the users input is valid, proceed with the quiz.
			try
			{			
				//Quiz the user if they select yes, and exit the program if the user selects no
				if(quizYesOrNo.equals("YES")){
					userAnswer = JOptionPane.showInputDialog("What element has an atomic number of " + getRandomQuizQuestion());
				}else if(quizYesOrNo.equals("NO")){
					JOptionPane.showMessageDialog(null, "Thank you for using my program!", "Good Bye", JOptionPane.PLAIN_MESSAGE);
					System.exit(0);	
				}
			}
			//If the users input is invalid, ask them to re-enter a valid response.
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,  "Please select YES or NO", "Invalid Selection", JOptionPane.WARNING_MESSAGE);
				
				//Set the invalidEntry boolean to true so that the program will re-ask the user to input a valid response.
				invalidEntry = true;
			}
		}
	}
	
	//Method that will write to file.
	public void setWriteToFile() throws IOException{
		//Create a reference variable for the PrintWriter
		PrintWriter fileToPrintTo = new PrintWriter(fileName);
		
		//Print (add) to the file the results of the quiz
		fileToPrintTo.println(quizAnswer);
		
		//Close the file
		fileToPrintTo.close();
	}
	
	//Method that will read from file.
	public void setReadFromFile() throws IOException{
		//Create reference variables for the File and Scanner
		File myFile = new File(fileName);
		Scanner inputFile = new Scanner(myFile);
		
		//Check if the file exists
		if(!myFile.exists()){
			System.out.println("The file does not exist.");
			System.exit(0);
		}
		
		//Print to the screen the results of the quiz
		System.out.println("The results of your quiz is: ");
		//Print all the lines in the file
		while(inputFile.hasNext()){
			System.out.println(inputFile.nextLine());
		}
		
		//Close the file
		inputFile.close();
	}
}
