package ct229.assignment12;
//07013418 Luke Potter 25/March/2009

import javax.swing.JOptionPane;

public class AssignmentTwelveTest
{
	//put values to be added into an array
	static String contentsArray[] = {"cat", "lion", "tiger", "giraffe", "racoon", "bear", "meerkat", "dog", "student", "horse", "giraffe"};
	
	public static void main(String[] args)
	{
		//create tree
		BinarySearchTreeR<String> tree = new BinarySearchTreeR<String>();
		JOptionPane.showMessageDialog(null, "New tree created");
		System.out.println("*** New Tree Created.");
		
		//populate tree
		JOptionPane.showMessageDialog(null, "Press OK to start adding elements to the tree");
		System.out.println("\n*** Adding Elements to Tree");
		populateTree(tree);
		
		//perform in-order traversal
		JOptionPane.showMessageDialog(null, "Press OK to begin an in order traversal of the tree");
		System.out.println("\n*** The Elements of the Tree are...");
		tree.inorderTraverse();
		
		//delete two nodes
		JOptionPane.showMessageDialog(null, "Press OK to begin deleting elements from the tree");
		System.out.println("\n*** Deleting Elements From Tree");
		deleteNode(tree);
		deleteNode(tree);
		
		//perform in-order traversal
		JOptionPane.showMessageDialog(null, "Press OK to begin an in order traversal of the tree");
		System.out.println("\n*** The Current Elements of the Tree are...");
		tree.inorderTraverse();
		
		//search for animal that is there
		JOptionPane.showMessageDialog(null, "Press OK to start searching the tree");
		System.out.println("\n*** Searching The tree");
		searchTree(tree);
		
		//search for animal that is not there
		System.out.println("\n*** Searching The tree");
		searchTree(tree);
	}
	
	//populateTree method
	static void populateTree(BinarySearchTreeR<String> tree1)
	{
		//add values
		for(int i = 0; i < contentsArray.length; i++)
		{
			tree1.add(contentsArray[i]);
		}
		
		JOptionPane.showMessageDialog(null, "All values added to tree");
	}
	
	//deleteNode method
	static void deleteNode(BinarySearchTreeR<String> tree1)
	{
		String str = "";
		str = (String) JOptionPane.showInputDialog(null, "Please Choose One Element To Delete", "Choose One", JOptionPane.QUESTION_MESSAGE, null, contentsArray, contentsArray[0]);
		tree1.remove(str);
		deleteFromArray(str);
		System.out.println(str+ " removed");
		JOptionPane.showMessageDialog(null, str+ " removed");
	}

	//searchTree method
	static void searchTree(BinarySearchTreeR<String> tree1)
	{
		String str = "";
		
		str = JOptionPane.showInputDialog("Please Enter An Element To Search For");
		System.out.println("Searching for " +str + "...");
		
		if(tree1.contains(str) == true)
		{
			System.out.println(str+ " was found in tree");
			JOptionPane.showMessageDialog(null, str+ " was found in tree");
		}
		else
		{
			System.out.println(str+ " was not found in tree");
			JOptionPane.showMessageDialog(null, str+ " was not found in tree");
		}
	}
	
	//deleteFromArray method
	static void deleteFromArray(String s)
	{
		for(int i = 0; i < contentsArray.length; i++)
		{
			if(s == contentsArray[i])
			{
				contentsArray[i] = null;
			}
		}
	}
}
