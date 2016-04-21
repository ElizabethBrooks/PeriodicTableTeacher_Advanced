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
		setColumnFour();
		setColumnFive();
		setColumnSix();
		setColumnSeven();
		setColumnEight();
		setColumnNine();
		setColumnTen();
		setColumnEleven();
		setColumnTwelve();
		setColumnThirteen();
		setColumnFourteen();
		setColumnFifteen();
		setColumnSixteen();
		setColumnSeventeen();
		setLanthanideSeries();
		setActinideSeries();
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
		switch(l)
		{
			case 0:
			{
				lShellDesignation = "s";
				break;
			}
			case 1:
			{
				lShellDesignation = "p";
				break;
			}
			case 2:
			{
				lShellDesignation = "d";
				break;
			}
			case 3:
			{
				lShellDesignation = "f";
				break;
			}
		}
	}
	
	//A method to determine the values of n and l if the element is a noble gas (in seventeenth column).
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

	//A method to determine the electron configuration for the first column of elements.
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
	
	//A method to determine the electron configuration for the second column of elements.
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
		
	//A method to determine the electron configuration for the third column of elements.
	public void setColumnThree(){
		if(elementAtomicNum == 21 || elementAtomicNum == 39 || elementAtomicNum == 57 || elementAtomicNum == 89){	
			switch(n)
			{
				case 4:
				{
					l = 2;
					electronAmount = 1;
					nobleGas = "[AR]";
					break;
				}
				case 5:
				{
					l = 2;
					electronAmount = 1;
					nobleGas = "[KR]";
					break;
				}
				case 6:
				{
					l = 2;
					electronAmount = 1;
					nobleGas = "[XE]";
					break;
				}
				case 7:
				{
					l = 2;
					electronAmount = 1;
					nobleGas = "[RN]";
					break;
				}
			}				
		}
	}
	
	//A method to determine the electron configuration for the fourth column of elements.
		public void setColumnFour(){
			if(elementAtomicNum == 22 || elementAtomicNum == 40 || elementAtomicNum == 72 || elementAtomicNum == 104){	
				switch(n)
				{
					case 4:
					{
						l = 2;
						electronAmount = 2;
						nobleGas = "[AR]";
						break;
					}
					case 5:
					{
						l = 2;
						electronAmount = 2;
						nobleGas = "[KR]";
						break;
					}
					case 6:
					{
						l = 2;
						electronAmount = 2;
						nobleGas = "[XE]";
						break;
					}
					case 7:
					{
						l = 2;
						electronAmount = 2;
						nobleGas = "[RN]";
						break;
					}
				}				
			}
		}
		
	//A method to determine the electron configuration for the fifth column of elements.
	public void setColumnFive(){
		if(elementAtomicNum == 23 || elementAtomicNum == 41 || elementAtomicNum == 73 || elementAtomicNum == 105){	
			switch(n)
			{
				case 4:
				{
					l = 2;
					electronAmount = 3;
					nobleGas = "[AR]";
					break;
				}
				case 5:
				{
					l = 2;
					electronAmount = 3;
					nobleGas = "[KR]";
					break;
				}
				case 6:
				{
					l = 2;
					electronAmount = 3;
					nobleGas = "[XE]";
					break;
				}
				case 7:
				{
					l = 2;
					electronAmount = 3;
					nobleGas = "[RN]";
					break;
				}
			}				
		}
	}
	
	//A method to determine the electron configuration for the sixth column of elements.
	public void setColumnSix(){
		if(elementAtomicNum == 24 || elementAtomicNum == 42 || elementAtomicNum == 74 || elementAtomicNum == 106){	
			switch(n)
			{
				case 4:
				{
					l = 2;
					electronAmount = 4;
					nobleGas = "[AR]";
					break;
				}
				case 5:
				{
					l = 2;
					electronAmount = 4;
					nobleGas = "[KR]";
					break;
				}
				case 6:
				{
					l = 2;
					electronAmount = 4;
					nobleGas = "[XE]";
					break;
				}
				case 7:
				{
					l = 2;
					electronAmount = 4;
					nobleGas = "[RN]";
					break;
				}
			}				
		}
	}
	
	//A method to determine the electron configuration for the seventh column of elements.
	public void setColumnSeven(){
		if(elementAtomicNum == 25 || elementAtomicNum == 43 || elementAtomicNum == 75){	
			switch(n)
			{
				case 4:
				{
					l = 2;
					electronAmount = 5;
					nobleGas = "[AR]";
					break;
				}
				case 5:
				{
					l = 2;
					electronAmount = 5;
					nobleGas = "[KR]";
					break;
				}
				case 6:
				{
					l = 2;
					electronAmount = 5;
					nobleGas = "[XE]";
					break;
				}
			}				
		}
	}
	
	//A method to determine the electron configuration for the eighth column of elements.
	public void setColumnEight(){
		if(elementAtomicNum == 26 || elementAtomicNum == 44 || elementAtomicNum == 76){	
			switch(n)
			{
				case 4:
				{
					l = 2;
					electronAmount = 6;
					nobleGas = "[AR]";
					break;
				}
				case 5:
				{
					l = 2;
					electronAmount = 6;
					nobleGas = "[KR]";
					break;
				}
				case 6:
				{
					l = 2;
					electronAmount = 6;
					nobleGas = "[XE]";
					break;
				}
			}				
		}
	}
	
	//A method to determine the electron configuration for the ninth column of elements.
	public void setColumnNine(){
		if(elementAtomicNum == 27 || elementAtomicNum == 45 || elementAtomicNum == 77){	
			switch(n)
			{
				case 4:
				{
					l = 2;
					electronAmount = 7;
					nobleGas = "[AR]";
					break;
				}
				case 5:
				{
					l = 2;
					electronAmount = 7;
					nobleGas = "[KR]";
					break;
				}
				case 6:
				{
					l = 2;
					electronAmount = 7;
					nobleGas = "[XE]";
					break;
				}
			}				
		}
	}
	
	//A method to determine the electron configuration for the tenth column of elements.
	public void setColumnTen(){
		if(elementAtomicNum == 28 || elementAtomicNum == 46 || elementAtomicNum == 78){	
			switch(n)
			{
				case 4:
				{
					l = 2;
					electronAmount = 8;
					nobleGas = "[AR]";
					break;
				}
				case 5:
				{
					l = 2;
					electronAmount = 8;
					nobleGas = "[KR]";
					break;
				}
				case 6:
				{
					l = 2;
					electronAmount = 8;
					nobleGas = "[XE]";
					break;
				}
			}				
		}
	}
	
	//A method to determine the electron configuration for the eleventh column of elements.
	public void setColumnEleven(){
		if(elementAtomicNum == 29 || elementAtomicNum == 47 || elementAtomicNum == 79){	
			switch(n)
			{
				case 4:
				{
					l = 2;
					electronAmount = 9;
					nobleGas = "[AR]";
					break;
				}
				case 5:
				{
					l = 2;
					electronAmount = 9;
					nobleGas = "[KR]";
					break;
				}
				case 6:
				{
					l = 2;
					electronAmount = 9;
					nobleGas = "[XE]";
					break;
				}
			}				
		}
	}
	
	//A method to determine the electron configuration for the twelfth column of elements.
	public void setColumnTwelve(){
		if(elementAtomicNum == 30 || elementAtomicNum == 48 || elementAtomicNum == 80){	
			switch(n)
			{
				case 4:
				{
					l = 2;
					electronAmount = 10;
					nobleGas = "[AR]";
					break;
				}
				case 5:
				{
					l = 2;
					electronAmount = 10;
					nobleGas = "[KR]";
					break;
				}
				case 6:
				{
					l = 2;
					electronAmount = 10;
					nobleGas = "[XE]";
					break;
				}
			}				
		}
	}
	
	//A method to determine the electron configuration for the thirteenth column of elements.
	public void setColumnThirteen(){
		if(elementAtomicNum == 5 || elementAtomicNum == 13 || elementAtomicNum == 31 || 
				elementAtomicNum == 49 || elementAtomicNum == 81){	
			switch(n)
			{
				case 2:
				{
					l = 1;
					electronAmount = 1;
					nobleGas = "[HE]";
					break;
				}
				case 3:
				{
					l = 1;
					electronAmount = 1;
					nobleGas = "[NE]";
					break;
				}
				case 4:
				{
					l = 1;
					electronAmount = 1;
					nobleGas = "[AR]";
					break;
				}
				case 5:
				{
					l = 1;
					electronAmount = 1;
					nobleGas = "[KR]";
					break;
				}
				case 6:
				{
					l = 1;
					electronAmount = 1;
					nobleGas = "[XE]";
					break;
				}
			}				
		}
	}
	
	//A method to determine the electron configuration for the fourteenth column of elements.
	public void setColumnFourteen(){
		if(elementAtomicNum == 6 || elementAtomicNum == 14 || elementAtomicNum == 32 || 
				elementAtomicNum == 50 || elementAtomicNum == 82){	
			switch(n)
			{
				case 2:
				{
					l = 1;
					electronAmount = 2;
					nobleGas = "[HE]";
					break;
				}
				case 3:
				{
					l = 1;
					electronAmount = 2;
					nobleGas = "[NE]";
					break;
				}
				case 4:
				{
					l = 1;
					electronAmount = 2;
					nobleGas = "[AR]";
					break;
				}
				case 5:
				{
					l = 1;
					electronAmount = 2;
					nobleGas = "[KR]";
					break;
				}
				case 6:
				{
					l = 1;
					electronAmount = 2;
					nobleGas = "[XE]";
					break;
				}
			}				
		}
	}
	
	//A method to determine the electron configuration for the fifteenth column of elements.
	public void setColumnFifteen(){
		if(elementAtomicNum == 7 || elementAtomicNum == 15 || elementAtomicNum == 33 || 
				elementAtomicNum == 51 || elementAtomicNum == 83){	
			switch(n)
			{
				case 2:
				{
					l = 1;
					electronAmount = 3;
					nobleGas = "[HE]";
					break;
				}
				case 3:
				{
					l = 1;
					electronAmount = 3;
					nobleGas = "[NE]";
					break;
				}
				case 4:
				{
					l = 1;
					electronAmount = 3;
					nobleGas = "[AR]";
					break;
				}
				case 5:
				{
					l = 1;
					electronAmount = 3;
					nobleGas = "[KR]";
					break;
				}
				case 6:
				{
					l = 1;
					electronAmount = 3;
					nobleGas = "[XE]";
					break;
				}
			}				
		}
	}
	
	//A method to determine the electron configuration for the sixteenth column of elements.
	public void setColumnSixteen(){
		if(elementAtomicNum == 8 || elementAtomicNum == 16 || elementAtomicNum == 34 || 
				elementAtomicNum == 52 || elementAtomicNum == 84){	
			switch(n)
			{
				case 2:
				{
					l = 1;
					electronAmount = 4;
					nobleGas = "[HE]";
					break;
				}
				case 3:
				{
					l = 1;
					electronAmount = 4;
					nobleGas = "[NE]";
					break;
				}
				case 4:
				{
					l = 1;
					electronAmount = 4;
					nobleGas = "[AR]";
					break;
				}
				case 5:
				{
					l = 1;
					electronAmount = 4;
					nobleGas = "[KR]";
					break;
				}
				case 6:
				{
					l = 1;
					electronAmount = 4;
					nobleGas = "[XE]";
					break;
				}
			}				
		}
	}
	
	//A method to determine the electron configuration for the seventeenth column of elements.
	public void setColumnSeventeen(){
		if(elementAtomicNum == 9 || elementAtomicNum == 17 || elementAtomicNum == 35 || 
				elementAtomicNum == 53 || elementAtomicNum == 85){	
			switch(n)
			{
				case 2:
				{
					l = 1;
					electronAmount = 5;
					nobleGas = "[HE]";
					break;
				}
				case 3:
				{
					l = 1;
					electronAmount = 5;
					nobleGas = "[NE]";
					break;
				}
				case 4:
				{
					l = 1;
					electronAmount = 5;
					nobleGas = "[AR]";
					break;
				}
				case 5:
				{
					l = 1;
					electronAmount = 5;
					nobleGas = "[KR]";
					break;
				}
				case 6:
				{
					l = 1;
					electronAmount = 5;
					nobleGas = "[XE]";
					break;
				}
			}				
		}
	}
	
	//A method to determine the electron configuration for the lanthanide series of elements.
	public void setLanthanideSeries(){
		if(elementAtomicNum == 58 || elementAtomicNum == 59 || elementAtomicNum == 60 || elementAtomicNum == 61 
				|| elementAtomicNum == 62 || elementAtomicNum == 63 || elementAtomicNum == 64 || elementAtomicNum == 65 || 
				elementAtomicNum == 66 || elementAtomicNum == 67 || elementAtomicNum == 68 || elementAtomicNum == 69 || 
				elementAtomicNum == 70 || elementAtomicNum == 71){	
			n = 4;
			l = 3;
			nobleGas = "[XE]";
			switch(elementAtomicNum)
			{
				case 58:
				{
					electronAmount = 1;
					break;
				}
				case 59:
				{
					electronAmount = 2;
					break;
				}
				case 60:
				{
					electronAmount = 3;
					break;
				}
				case 61:
				{
					electronAmount = 4;
					break;
				}
				case 62:
				{
					electronAmount = 5;
					break;
				}
				case 63:
				{
					electronAmount = 6;
					break;
				}
				case 64:
				{
					electronAmount = 7;
					break;
				}
				case 65:
				{
					electronAmount = 8;
					break;
				}
				case 66:
				{
					electronAmount = 9;
					break;
				}
				case 67:
				{
					electronAmount = 10;
					break;
				}
				case 68:
				{
					electronAmount = 11;
					break;
				}
				case 69:
				{
					electronAmount = 12;
					break;
				}
				case 70:
				{
					electronAmount = 13;
					break;
				}
				case 71:
				{
					electronAmount = 14;
					break;
				}
			}
		}
	}
	
	//A method to determine the electron configuration for the actinide series of elements.
		public void setActinideSeries(){
			if(elementAtomicNum == 90 || elementAtomicNum == 91 || elementAtomicNum == 92 || elementAtomicNum == 93 
					|| elementAtomicNum == 94 || elementAtomicNum == 95 || elementAtomicNum == 96 || elementAtomicNum == 97 || 
					elementAtomicNum == 98 || elementAtomicNum == 99 || elementAtomicNum == 100 || elementAtomicNum == 101 || 
					elementAtomicNum == 102 || elementAtomicNum == 103){	
				n = 5;
				l = 3;
				nobleGas = "[RN]";
				switch(elementAtomicNum)
				{
					case 90:
					{
						electronAmount = 1;
						break;
					}
					case 91:
					{
						electronAmount = 2;
						break;
					}
					case 92:
					{
						electronAmount = 3;
						break;
					}
					case 93:
					{
						electronAmount = 4;
						break;
					}
					case 94:
					{
						electronAmount = 5;
						break;
					}
					case 95:
					{
						electronAmount = 6;
						break;
					}
					case 96:
					{
						electronAmount = 7;
						break;
					}
					case 97:
					{
						electronAmount = 8;
						break;
					}
					case 98:
					{
						electronAmount = 9;
						break;
					}
					case 99:
					{
						electronAmount = 10;
						break;
					}
					case 100:
					{
						electronAmount = 11;
						break;
					}
					case 101:
					{
						electronAmount = 12;
						break;
					}
					case 102:
					{
						electronAmount = 13;
						break;
					}
					case 103:
					{
						electronAmount = 14;
						break;
					}
				}				
			}
		}
}
