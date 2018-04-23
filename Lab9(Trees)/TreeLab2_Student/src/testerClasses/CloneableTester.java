package TreeLab2_Student.src.testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;

/**
 * 
 * @author JaiTorres13
 * tester class for exercise 8
 */
public class CloneableTester {
	public static void main(String[] args)throws CloneNotSupportedException {
		
LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(),  t1 = new LinkedBinaryTree<>(), 
t2 = new LinkedBinaryTree<>(),  t3= new LinkedBinaryTree<>(); ; 
		
		Position<Integer> root = t.addRoot(4);
		Position<Integer> child1 = t.addLeft(root, 9);
		Position<Integer> child2 = t.addRight(root, 20);
		t.addLeft(child1, 7);
		t.addRight(child1, 10);
		Position<Integer> child3 =	t.addLeft(child2, 15);
		Position<Integer> child4 = t.addRight(child2, 21);
		t.addLeft(child3, 12);
		Position<Integer> child5 = t.addRight(child3, 17);
		t.addLeft(child5, 19);
		Position<Integer> child6 = t.addRight(child4, 40);
		t.addLeft(child6, 30);
		t.addRight(child6, 45);
		
		Utils.displayTree("The tree is: ", t);
		t1 = t.clone(); 
		Utils.displayTree("Clone of t", t1); 
		t3= t2.clone(); 
		Utils.displayTree("Clone of t", t3); 
	}
}
