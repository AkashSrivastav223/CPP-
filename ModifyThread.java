public class ModifyThread extends Thread{
	private UnboundedArray array;

	public ModifyThread(String name, UnboundedArray array) {
		// TODO Auto-generated constructor stub
		super(name);
		this.array = array;
	}

	public static int generate(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}

	public void run() {
		// Write your code to implement the job of insert thread
		while(true) {
			int index=generate(0, array.getSize()-1);
			int value=generate(0, 1000);
			array.modify(index, value);
			
			try{
				sleep(5000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
