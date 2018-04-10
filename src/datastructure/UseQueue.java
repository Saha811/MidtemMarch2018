package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<String> NBATeams = new LinkedList<>();
		NBATeams.add("Knicks");
		NBATeams.add("Nets");
		NBATeams.add("Pistons");
		NBATeams.add("Sixers");
		System.out.println("peek : "+NBATeams.peek());
		System.out.println("remove : "+NBATeams.remove());
		System.out.println("poll : "+NBATeams.poll());
		for(String x : NBATeams ){
			System.out.println("for loop : "+x);
		}
		Iterator it = NBATeams.iterator();
		while(it.hasNext()){
			System.out.println("Iterator : "+it.next());
		}

	}

}
