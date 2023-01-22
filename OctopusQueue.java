//Ameer Ahmed

import java.util.LinkedList;
import java.util.Queue;

public class OctopusQueue {

	public static void main(String[] args) {

		// create queue using the LinkedList class
		Queue<String> LineShow = new LinkedList<>();

		// add elements to the Queue
		LineShow.add("Bobby");
		LineShow.add("Paul");
		LineShow.add("Tony");
		// Alternative way: LineShow.offer("Tony");

		// look at the head of the Queue
		System.out.println("The head of the Queue is: " + LineShow.peek() + "\n");

		// remove an element from the Queue
		System.out.println("One person can go inside to see the octopus which is: " + LineShow.remove());
		System.out.println("The line now contains: " + LineShow);

		LineShow.add("Amy");
		System.out.println("\n" + "The line is now: " + LineShow);
	}
}