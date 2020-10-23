import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import GameTreeSol.BinaryTreeNode;

/**
 * @author MatthewSheldon
 */
public class GameTree {
	/**
	 * Private class that handles the node aspect of the
	 * Binary Search Tree.
	 */
	private class GameTreeNode {
		public String data;					// The String values that it is holding
		public boolean isQuestion;			// Whether or not the node is a question or answer
		public GameTreeNode left, right;	// The children of the current node
		public GameTreeNode(String data, boolean isQuestion) {
			this.isQuestion = isQuestion;
			this.data = data;
		}
	}
	/**
	 * A reference to the overall root node in the tree
	 */
	public GameTreeNode root;
	/**
	 * Constructor needed to create the game.
	 *
	 * @param fileName this is the name of the file we need to import the game
	 *                 questions and answers from.
	 */
	public GameTree(String fileName) {
		try {
			Scanner scan = new Scanner(new File(fileName));
			while(scan.hasNext()) {
				String line = scan.nextLine();
				
			}
		} catch (FileNotFoundException s) {
			System.out.println("File does Not Exist Please Try Again: ");
		}
	}

	/*
	 * Add a new question and answer to the currentNode. If the current node has the
	 * answer chicken, theGame.add("Does it swim?", "goose"); should change that
	 * node like this:
	 */
	// -----------Feathers?-----------------Feathers?------
	// -------------/----\------------------/-------\------
	// ------- chicken horse-----Does it swim?-----horse--
	// -----------------------------/------\---------------
	// --------------------------goose--chicken-----------
	/**
	 * @param newQ The question to add where the old answer was.
	 * @param newA The new Yes answer for the new question.
	 */
	public void add(String newQ, String newA) {
		// TODO
	}

	/**
	 * True if getCurrent() returns an answer rather than a question.
	 * @return False if the current node is an internal node rather than an answer
	 *         at a leaf.
	 */
	public boolean foundAnswer() {
		// TODO

		return false; // replace
	} 
	
	/**
	 * Return the data for the current node, which could be a question or an answer.
	 * Current will change based on the users progress through the game. 
	 * @return The current question or answer.
	 */
	public String getCurrent() {
		// TODO

		return ""; // replace
	}

	/**
	 * Ask the game to update the current node by going left for Choice.yes or right
	 * for Choice.no Example code: theGame.playerSelected(Choice.Yes);
	 *
	 * @param yesOrNo
	 */
	public void playerSelected(Choice yesOrNo) {
		// TODO
	}

	/**
	 * Begin a game at the root of the tree. getCurrent should return the question
	 * at the root of this GameTree.
	 */
	public void reStart() {
		// TODO
	}

	@Override
	public String toString()
	{
		// TODO

		return "";
	}

	/**
	 * Overwrite the old file for this gameTree with the current state that may have
	 * new questions added since the game started.
	 *
	 */
	public void saveGame()
	{
		// TODO
	}
}