package Exercise3;

import java.util.ArrayList;

public class Computer implements Composite, Visitable{

	private ArrayList<Composite> components; 
	private String name;
	
	public Computer(String name) {
		this.name = name;
		components = new ArrayList<>();
	}
	

	public ArrayList<Composite> getComponents() {
		return components;
	}

// I didn't add a verification of the incoming object, I consider it possible to add the same object twice in the components 
// It should be possible to add twice the same Memory for instance. 	
	public void addanItem(Composite compo) {
		components.add(compo); 
	}
	
	public void removeanItem(Composite compo) {
		if(components.contains(compo))
			components.remove(compo);
	}

	@Override
	public String operation() {

		String result = "I'm a " + this.getClass().getName() + ", my name is : " + this.name + ", I'm composed of several stuff !\n";
		for(Composite c : components) {
			result += "\t-->" + c.operation();
		}
		
		return result;
	}

	@Override
	public int accept(Visitor v) {
		return v.visit(this);
		// TODO Auto-generated method stub
		
	}


	

}
