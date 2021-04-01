package Exercise1;

public class FactorialMethodClass {
	
	private int theArgument;
	private int compteur;
	
//	I set two constructors in order to test two possible algorithm
//	One where a 'counting' is used and another one without it.
//	
//	
//	
//	
	public FactorialMethodClass() {
		super();

	}
	
	public FactorialMethodClass(int theArg) {
		super();
		this.theArgument = theArg;
		this.compteur = theArgument + 1 ;

	}
	
	
	public int Fact(int argument) {
		
		if(argument == 1)
			return 1;
		else
			return argument * Fact(argument -1);
	
	}
	
	
	public int Fact() {
		this.compteur -=  1;
		System.out.println(this.compteur);
		if(this.compteur == 1)
			return 1;
		else
			return this.compteur * Fact();
	
	}
	
	public static void main(String[] args) {
		
		
	}

}
