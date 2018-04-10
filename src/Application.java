import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//collection framework:
//LinkedList

public class Application {

	public static void main(String[] args) {
		//let's explore difference between ArrayList an LinkedList
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		//one diff: in ALs you can add and remove only at beginning and end
		//with LLs you can add and remove from the middle too
		
		doTimings("An array list here", arrayList);
		doTimings("A linked list here", linkedList);
	}

	private static void doTimings(String type, List<Integer> list){
		//the parameter List can accept either ArrayList or LinkedList
		
		long start = System.currentTimeMillis();
		
		for(int i=0; i<1E5; i++){
			list.add(i);
		}
				
		long stop = System.currentTimeMillis();
		System.out.println("Time taken for: " + type + " " + (stop - start));

		//to add items in the middle of the lists:
		start = System.currentTimeMillis();
		
		for(int i=0; i<1E5; i++){
			list.add(0, i);
		}
		
		stop = System.currentTimeMillis();
		System.out.println("Time taken for: " + type + " " + (stop - start));

		//you learned that adding items to a linked list in the middle
		//is much faster than array list.
		//prof says array list is faster than linked if you add at the end
		//but my results say otherwise
		
		//array lists manage arrays internally
		//that means going through it or finding one element is easy
		//or adding to the end, because nothing too special happens.
		//adding at the start or middle means everything else has to shift
		//it takes a long time.
		
		//linked lists consist of elements where each element
		//has a reference to the previous and next element
		//so traversing or getting one element can be slower.
		//but adding items to the beginning or middle is faster.
		//tbh i don't understand why, but it has to do with the fact
		//that all of the elements are linked to their neighbors.
	}
}
