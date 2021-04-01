package Exercise3;

public class Memory extends Item implements Composite, Visitable{

	public Memory(int price, String name) {
		super(price, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String operation() {
		// TODO Auto-generated method stub
		return "\tI'm a " + this.getClass().getName() + ", my name is : " + super.getName() + ", My price is " + super.getPrice()  + "\n";
	}

	@Override
	public int accept(Visitor v) {
		return v.visit(this);
		
	}

}
