package utils;
/**
 * 
 * Forest Fire Simulation with 2D Graphics.
 * 
 * TreeYComparator is used to sort two Trees based on the y coordinate.
 */
import java.util.Comparator;

import model.Tree;

public class TreeYComparator implements Comparator<Tree> {

	@Override
	public int compare(Tree tree1, Tree tree2) {
		return tree1.getY() - tree2.getY();
	}
}
