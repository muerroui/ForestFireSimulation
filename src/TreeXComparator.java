/**
 * Copyright 2015 Peter "Felix" Nguyen & Emmanuel Medina Lopez
 * 
 * Forest Fire Simulation with 2D Graphics
 */
import java.util.Comparator;

public class TreeXComparator implements Comparator<Tree> {

	@Override
	public int compare(Tree tree1, Tree tree2) {
		return tree1.getX() - tree2.getX();
	}
}
