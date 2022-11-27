package main;

public interface Visitor {
	
	void visitGlass(Glass glass);
	void visitFurniture(Furniture furniture);
	void visitElectronic(Electronic electronic);

}

