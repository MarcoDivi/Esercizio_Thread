package ordinathread;

public class OrdinaThread {

    public static void main(String[] args) {
        int[] v = new int[100];
		
		Thread thread = new Thread(new ClasseThread(array(v)));
		print(v);
		thread.start();
		
		try {
			thread.join();
		} catch(InterruptedException e) {
			System.err.println(e.toString());
			Thread.yield();
		}		
		print(v);	
	}
	
	static int[] array(int[] a) {
		for(int i = 0; i < a.length; i++) {			
			a[i] = (int) (Math.random() * 101);	
		}
		return a;
	}
	
	static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
                        System.out.println(i+") ---> "+a[i]);
		}
	}
}
