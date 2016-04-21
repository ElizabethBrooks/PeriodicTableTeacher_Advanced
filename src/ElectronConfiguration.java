import javax.swing.JOptionPane;

public class ElectronConfiguration {

	public static void main(String[]args) {
		
		boolean invalidEntry = true;
		String userInput = "";
		Elements inputedElement = null;
		
		//Determine if the users inputed entry is valid 
		while (invalidEntry)
		{
			//Set the invalidEntry boolean to false so that when the user's input is valid, the while loop exits
			invalidEntry = false;
			
			//Ask the user to input an element using the JOptionPane
			userInput = JOptionPane.showInputDialog("Please enter an element.");
		
			//Send the inputed element to the Element class to retrieve the specified elements atomic number from the hash map
			inputedElement = new Elements(userInput.toUpperCase());
			
			//If the user's input is valid, print to the screen the selected elements information
			try 
			{
				//Output to the screen the element and atomic number selected by the user
				JOptionPane.showMessageDialog(null,  "The element you selected is: " + userInput.toUpperCase() + "\n" + 
						"The atomic number of the element you selected is: " + inputedElement.getAtomicNums(), 
						"Element Selection", JOptionPane.INFORMATION_MESSAGE);
				
				//Send the selected elements atomic number to the QuantumNums class
				QuantumNums electronConfiguration = new QuantumNums(inputedElement.getAtomicNums());
				JOptionPane.showMessageDialog(null, "The ground state electronic configuration for the selected element is:\n" + 
						electronConfiguration.getNobleGas() + electronConfiguration.getNValue() + electronConfiguration.getLShellDesignation() + 
						electronConfiguration.getElectronAmount(), "Electron Configuration", JOptionPane.INFORMATION_MESSAGE);
			}
			//If the user's input is invalid, output to the screen that the user needs to select a valid element
			catch (Exception e)
			{
				//Display a message informing the user that the entered an invalid response for an element
				JOptionPane.showMessageDialog(null,  "Please select a valid element.", "Element Selection", JOptionPane.WARNING_MESSAGE);
				
				//Set the invalidEntry boolean to true so that the program will re-ask the user to enter an element
				invalidEntry = true;
			}
		}
		
	/*	//Create a reference variable and call the constructor of the ElementQuiz class to quiz the user on a random element
		ElementQuiz quiz = new ElementQuiz();
		quiz.setUserAnswer();
		
		//Output to the screen the element selected by the user
		JOptionPane.showMessageDialog(null,  "The element you selected is: " + quiz.getUserAnswer() + "\n",
				"Quiz Answer", JOptionPane.INFORMATION_MESSAGE);
		
		//Determine if the users input is the correct element
		
	*/
		
	}
}
