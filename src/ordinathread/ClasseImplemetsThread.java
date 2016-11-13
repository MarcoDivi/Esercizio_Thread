package ordinathread;

public class ClasseImplemetsThread implements Runnable{
    
    private int[] array;
	
	public ClasseImplemetsThread (int[] array) {
		this.array = array;
	}
	
	public void ordine() {
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - 1; j++) {
				if(array[j] < array[j+1]) {
				} else {
					int x = array[j];
					array[j] = array[j+1];
					array[j+1] = x;
				}
			}			
		}
	}
	
	public void run() {
		ordine();
	}
    
}
