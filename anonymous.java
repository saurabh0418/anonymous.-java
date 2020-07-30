// ********* anonymous object program ******* //
class Calculation{
	int no;
	String name; //instance variable

	  void fact(int n){
		int fact = 1; //local variable
		for(int i=1;i<=n;i++)
		{ fact = fact*i;
		}
		System.out.println("factorial is " + fact);
	}
}
	 
 class Main {
	public static void main(String[] args) {
		new Calculation().fact(5); //anonymous object and used here only without reference
	
		/* below two lines cant be used as it give errors */
			
	 //	new calculations().no=3;
    //	new Calculations().name="Saurabh";
	
	
/*	below two lines used to call instance variable by anonymous object */
 System.out.println(new Calculation().no=3);
 System.out.println(new Calculation().name="Saurabh");

	}
	}
	
		/*anonymous is object means which jhas no reference variable & it is used at the time of object creation only*/
