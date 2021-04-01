package Exercise3;

public class ShoppingCartCalculator implements Visitor{
	
	
// In this strategy, everycomponents should have a price, but no assembly cost.	
	
	private int price;
	
	public ShoppingCartCalculator() {
		super();
		this.price = 0;
	}

	@Override
	public int visit(Computer c) {
		
		int tempPrice = 0;
		
		for(Composite a : c.getComponents()) {
			
			if(a.getClass().getName().equals("Exercise3.Gpu")) {
				tempPrice += visit((Gpu)a);


			}else if (a.getClass().getName().equals("Exercise3.Memory")) {
				tempPrice += visit((Memory)a);

				
			}else if (a.getClass().getName().equals("Exercise3.Monitor")) {
				tempPrice += visit((Monitor)a);


			}else if (a.getClass().getName().equals("Exercise3.Cpu")) {
				tempPrice += visit((Cpu)a);


			}else if (a.getClass().getName().equals("Exercise3.KeyBoard")) {
				tempPrice += visit((KeyBoard)a);


			}else if (a.getClass().getName().equals("Exercise3.GraphCard")) {
				tempPrice += visit((GraphCard)a);

			}else if (a.getClass().getName().equals("Exercise3.Computer")) {
				tempPrice += visit((Computer)a);
				
			}else {
				System.out.println("Not Good Component involved");
			}		
		}
		return tempPrice;
	}

	@Override
	public int visit(GraphCard gc) {
		
		int tempPrice = 0;
		
		for(Composite c : gc.getComponents()) {
			
			if(c.getClass().getName().equals("Exercise3.Gpu")) {
				tempPrice += visit((Gpu)c);
			}else if (c.getClass().getName().equals("Exercise3.Memory")) {
				tempPrice += visit((Memory)c);
			}else {
				System.out.println("Not Good Component involved");
			}
				
		}
	
		return tempPrice;
	}

	@Override
	public int visit(Memory m) {
		
		return m.getPrice();
		
	}

	@Override
	public int visit(Monitor m) {
		return m.getPrice();
	}

	@Override
	public int visit(Gpu G) {
		return G.getPrice();
	}

	@Override
	public int visit(Cpu c) {
		return c.getPrice();
	}

	@Override
	public int visit(KeyBoard k) {
		return k.getPrice();
	}

}
