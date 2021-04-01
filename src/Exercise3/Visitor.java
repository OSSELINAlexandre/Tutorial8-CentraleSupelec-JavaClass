package Exercise3;

public interface Visitor {
	
	int visit(Computer c);
	int visit(GraphCard gc);
	int visit(Memory m);
	int visit(Monitor m);
	int visit(Gpu G);
	int visit(Cpu c);
	int visit(KeyBoard k);


}
