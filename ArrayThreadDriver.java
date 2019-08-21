//import threads.array;

/* driver program to implement dynamic array with threads */

public class ArrayThreadDriver {

	/**
	 * Generates a random number in the range of min to max both inclusive.
	   min: starting value for the range
	   max: ending value for the range
	  @return a value in the range of min to max
	 */
	 
	public static int generate(int min, int max) {               
		return min + (int) (Math.random() * ((max - min) + 1));
	}

	public static void main(String[] args) {
		
		int initialCapacity = generate(1, 10);
		UnboundedArray array = new UnboundedArray(initialCapacity);
		
		InsertThread insertThread = new InsertThread("Insert_Thread", array);
		DeleteThread deleteThread = new DeleteThread("Delete_Thread", array);
		DeleteRangeThread deleteRangeThread = new DeleteRangeThread("DeleteRange_Thread", array);
		ModifyThread modifyThread = new ModifyThread("Modify_Thread", array);
		insertThread.start();
		deleteThread.start();
		deleteRangeThread.start();
		modifyThread.start();
		
	}
}
