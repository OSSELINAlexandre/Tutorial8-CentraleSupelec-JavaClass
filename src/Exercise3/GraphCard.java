package Exercise3;

import java.util.ArrayList;

public class GraphCard implements Composite, Visitable{

	private ArrayList<Composite> components;
	private String name;
	
	public GraphCard(String name) {
		 
		this.name = name;
		components = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public ArrayList<Composite> getComponents() {
		return components;
	}



	public void addanItem(Composite compo) {
		components.add(compo); // Il faudra peut-être faire un check-up de la disponibilité du composant dans la liste
		//Avant que d'en ajouter ou supprimer un j'imagine.
	}
	
	public void removeanItem(Composite compo) {
		if(components.contains(compo))
			components.remove(compo);
	}
	

	@Override
	public String operation() {
		
		String result = "\tI'm a " + this.getClass().getName() + ", my name is : " + this.name + ", I'm composed of several stuff !\n";
		for(Composite c : components) {
			result += "\t\t -" + c.operation();
		}
		
		return result;
	}

	@Override
	public int accept(Visitor v) {
		return v.visit(this);
		
	}


	
	

}
