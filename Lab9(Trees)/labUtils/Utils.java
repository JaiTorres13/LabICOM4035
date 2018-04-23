package labUtils;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
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
		
		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		
		
		return t; 
	}


}
