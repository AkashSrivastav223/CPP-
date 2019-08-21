public class DeleteRangeThread extends Thread{
	private UnboundedArray array;
	
	public DeleteRangeThread(String name, UnboundedArray array) {
		// TODO Auto-generated constructor stub
		super(name);
		this.array = array;
	}
	
	/* to generate random number between min and max */
	
	
	public static int generate(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}
	
	public void run(){
		while(true){
			int size=array.getSize();
			int min=size/4;
			int max=(3*size)/4;
			system.out.println("min value: "+min);
			system.out.println("max value: "+max);
			array.delete(size/4, 3*size/4);
			
			try{
				sleep(5000);
			}
			catch(InterruptedException e){
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
