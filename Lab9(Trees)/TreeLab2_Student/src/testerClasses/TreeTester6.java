package TreeLab2_Student.src.testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree2;

public class TreeTester6 {
	public static void main(String[] args) { 
		LinkedBinaryTree2<Integer> t = new LinkedBinaryTree2<>(); 
		
		t.insert(15); 
		t.insert(12);
		t.insert(10); 
		t.insert(20); 
		t.insert(17); 
		t.insert(4); 
		t.insert(9); 
		t.insert(7); 
		t.insert(19); 
		t.insert(21); 
		t.insert(40); 
		t.insert(45); 
		t.insert(30); 

		// display content as a tree
		Utils.displayTree("The structure of the tree is: ", t);
		
		// display elements as a list
		Utils.displayTreeElements("The elements of the tree are: ", t);
		
	}

}
