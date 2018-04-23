package TreeLab2_Student.src.testerClasses;

import labUtils.Utils;
import treeClasses.LinkedTree;
import treeInterfaces.Position;

/**
 * 
 * @author JaiTorres13
 *  tester class for exercise 7
 */
public class CloneTester {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		LinkedTree<Integer> t = new LinkedTree<>() , t1 = new LinkedTree<>(), 
				t2 = new LinkedTree<>(),  t3= new LinkedTree<>(); 
		Position<Integer> root = t.addRoot(4);
		Position<Integer> child1 = t.addChild(root, 9);
		Position<Integer> child2 = t.addChild(root, 20);
		t.addChild(child1, 7);
		t.addChild(child1, 10);
		Position<Integer> child3 =	t.addChild(child2, 15);
		Position<Integer> child4 = t.addChild(child2, 21);
		t.addChild(child3, 12);
		Position<Integer> child5 = t.addChild(child3, 17);
		t.addChild(child5, 19);
		Position<Integer> child6 = t.addChild(child4, 40);
		t.addChild(child6, 30);
		t.addChild(child6, 45);
		
		Utils.displayTree("The tree is: ", t);
		t1 = t.clone(); 
		Utils.displayTree("Clone of t", t1); 
		t3= t2.clone(); 
		Utils.displayTree("Clone of t", t3); 
	}
}
