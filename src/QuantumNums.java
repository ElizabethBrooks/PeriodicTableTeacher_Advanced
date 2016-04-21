//A class to determine the n,l,mth's of l, and s values of the quantum number of elements
//in terms of the specified elements atomic number.
public class QuantumNums {
	
	//Fields to store quantum number values.
	private int n;
	private int l;
	private String lShellDesignation;
	private String nobleGas;
	private int electronAmount;
	private int elementAtomicNum;
	
	//The QuantumNums class constructor.
	public QuantumNums(int atomicNum){
		elementAtomicNum = atomicNum;
		setNValue();
		setNobleGas();
		setColumnOne();
		setColumnTwo();
		setColumnThree();
		setLShellDesignation();
		
	}
	
	//Get the string stored in nobelGas.
	public String getNobleGas(){
		return nobleGas;
	}
	
	//Get the n value for the shell designation.
	public int getNValue(){
		return n;
	}
   
   //Get the values for l.
   public int getLValue(){
	   return l;
   }
	
	//get the lShellDesignation value for the letter designation of the sub shell indicated by l.
	public String getLShellDesignation(){
		return lShellDesignation;
	}
	
	//Get the leftover electron amount.
	public int getElectronAmount(){
		return electronAmount;
	}
	
	//Set the values for n.
	public void setNValue(){
		//The number of electrons in any shell is equal to 2(n^2), where n is the shell energy level.
		//Therefore, n = sqrt.(number of electrons/2), almost. The value of n is a whole number though.
		double nValue = Math.sqrt(elementAtomicNum/2);
		
		//Cast the nValue as type int to round it off.
		n = (int) (nValue);
		
		//Hydrogen's n value comes out to 0, change to 1.
		if(n == 0){
			n = 1;
			l = 0;
			electronAmount = 1;
			nobleGas = "";
		}
	}
	
	//Set the values for l.
	public void setLShellDesignation(){
		//An if statement to fill the value of lShellDesignation with the appropriate sub shell designation.
		if(l == 0){
			lShellDesignation = "s";
		}else if(l == 1){
			lShellDesignation = "p";
		}else if(l == 2){
			lShellDesignation = "d";
		}else if(l == 3){
			lShellDesignation = "f";
		}
	}
	
	//A method to determine the values of n and l if the element is a noble gas or hydrogen.
	public void setNobleGas(){
		if(elementAtomicNum == 2 || elementAtomicNum == 10 || elementAtomicNum == 18 
				|| elementAtomicNum == 36 || elementAtomicNum == 54 || elementAtomicNum == 86){	
			switch(n)
			{
				case 1:
				{
					l = 0;
					electronAmount = 2;
					nobleGas = "";
					break;
				}
				case 2:
				{
					l = 1;
					electronAmount = 6;
					nobleGas = "[HE]";
					break;
				}
				case 3:
				{
					l = 1;
					electronAmount = 6;
					nobleGas = "[NE]";
					break;
				}
				case 4:
				{
					l = 1;
					electronAmount = 6;
					nobleGas = "[AR]";
					break;
				}
				case 5:
				{
					l = 1;
					electronAmount = 6;
					nobleGas = "[KR]";
					break;
				}
				case 6:
				{
					l = 1;
					electronAmount = 6;
					nobleGas = "[XE]";
					break;
				}
			}
		}
	}

	//A method to determine the electron configuration for the first column of elements
	public void setColumnOne(){
		if(elementAtomicNum == 3 || elementAtomicNum == 11 || elementAtomicNum == 19 
				|| elementAtomicNum == 37 || elementAtomicNum == 55 || elementAtomicNum == 87){	
			n += 1;
			switch(n)
			{
				case 2:
				{
					l = 0;
					electronAmount = 1;
					nobleGas = "[HE]";
					break;
				}
				case 3:
				{
					l = 0;
					electronAmount = 1;
					nobleGas = "[NE]";
					break;
				}
				case 4:
				{
					l = 0;
					electronAmount = 1;
					nobleGas = "[AR]";
					break;
				}
				case 5:
				{
					l = 0;
					electronAmount = 1;
					nobleGas = "[KR]";
					break;
				}
				case 6:
				{
					l = 0;
					electronAmount = 1;
					nobleGas = "[XE]";
					break;
				}
				case 7:
				{
					l = 0;
					electronAmount = 1;
					nobleGas = "[RN]";
					break;
				}
			}				
		}
	}
	
	//A method to determine the electron configuration for the second column of elements
		public void setColumnTwo(){
			if(elementAtomicNum == 4 || elementAtomicNum == 12 || elementAtomicNum == 20 
					|| elementAtomicNum == 38 || elementAtomicNum == 56 || elementAtomicNum == 88){	
				n += 1;
				switch(n)
				{
					case 2:
					{
						l = 0;
						electronAmount = 2;
						nobleGas = "[HE]";
						break;
					}
					case 3:
					{
						l = 0;
						electronAmount = 2;
						nobleGas = "[NE]";
						break;
					}
					case 4:
					{
						l = 0;
						electronAmount = 2;
						nobleGas = "[AR]";
						break;
					}
					case 5:
					{
						l = 0;
						electronAmount = 2;
						nobleGas = "[KR]";
						break;
					}
					case 6:
					{
						l = 0;
						electronAmount = 2;
						nobleGas = "[XE]";
						break;
					}
					case 7:
					{
						l = 0;
						electronAmount = 2;
						nobleGas = "[RN]";
						break;
					}
				}				
			}
		}
		
	//A method to determine the electron configuration for the third row of elements
	public void setColumnThree(){
		if(elementAtomicNum == 21 || elementAtomicNum == 39 || elementAtomicNum == 57 || elementAtomicNum == 89){	
			switch(n)
			{
				case 4:
				{
					l = 0;
					electronAmount = 2;
					nobleGas = "[AR]";
					break;
				}
				case 5:
				{
					l = 0;
					electronAmount = 2;
					nobleGas = "[KR]";
					break;
				}
				case 6:
				{
					l = 0;
					electronAmount = 2;
					nobleGas = "[XE]";
					break;
				}
				case 7:
				{
					l = 0;
					electronAmount = 2;
					nobleGas = "[RN]";
					break;
				}
			}				
		}
	}
}
