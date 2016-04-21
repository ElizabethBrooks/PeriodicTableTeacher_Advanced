import java.io.*;
import java.util.Scanner;
import java.util.*;
import javax.swing.JOptionPane;

//A class that will quiz the user on elements and print their results to the screen
public class ElementQuiz {
	
	//Declare the var for and set the name of the file the quiz results will print to
	private String fileName = "elementQuizResults.txt";
	private int atomicNumQuestion;
	private String userAnswer;
	private Random randomAtomicNum = new Random();
	
	//The class constructor
	public ElementQuiz(){
	}
	
	//Method to retrieve the users answer
	public String getUserAnswer(){
		return userAnswer;
	}
	
	//Method to return the random atomic number the user will be quizzed on
	public int getRandomAtomicNum(){
		return atomicNumQuestion;
	}
	
	//Quiz the user on elements based on their atomic number
	public void setUserAnswer(){
		//Generate random atomic numbers between 1 and 118
		atomicNumQuestion = randomAtomicNum.nextInt(120) + 1;
	
		//Ask the user if they would like to be quizzed on the elements by atomic number
		String quizYesNo = JOptionPane.showInputDialog("Would you like to be quized on the elements by their atomic number? (YES or NO)");
		quizYesNo = quizYesNo.toUpperCase();
		
		//Quiz the user if they select yes, and exit the program if the user selects no
		if(quizYesNo.equals("NO")){
			JOptionPane.showMessageDialog(null, "Thank you for using my program!", "Good Bye", JOptionPane.PLAIN_MESSAGE);
			System.exit(0);	
		}else if(quizYesNo.equals("YES")){
			userAnswer = JOptionPane.showInputDialog("What element has an atomic number of " + atomicNumQuestion);
			userAnswer = userAnswer.toUpperCase();
		}else{
			JOptionPane.showMessageDialog(null, "You selected nither 'YES' nor 'NO'.", "Good Bye", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
	}
	
	//Method that will write to file.
	public void setWriteToFile() throws IOException{
		//Create a reference variable for the PrintWriter
		PrintWriter fileToPrintTo = new PrintWriter(fileName);
		
		//Print (add) to the file the results of the quiz
		fileToPrintTo.println("The atomic number you were quizzed on was " + atomicNumQuestion + 
				", your answer was " + userAnswer + ".");
		
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
