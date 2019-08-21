public class DeleteThread extends Thread{
	private UnboundedArray array;
	
	public DeleteThread(String name, UnboundedArray array) {
		// TODO Auto-generated constructor stub
		super(name);
		this.array = array;
	}
	
	public static int generate(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}
	
	public void run(){
		while(true){
			for(int i=0; i<2; i++){
				int index=generate(0, array.getSize()-1);			
				array.delete(index);
			}
			try{
				sleep(5000);
			}
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
			
	
