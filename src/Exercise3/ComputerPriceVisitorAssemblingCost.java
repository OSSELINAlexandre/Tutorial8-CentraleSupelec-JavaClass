package Exercise3;

public class ComputerPriceVisitorAssemblingCost implements Visitor {
	
//	In this strategy, we should add a composition price, which should be 20% of components inside a given Computer
	//We need to truncate the assembly price, because we need to return an int.
	private int price;
	
	public ComputerPriceVisitorAssemblingCost() {
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
		return tempPrice + ((int)(0.2 * tempPrice));
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
