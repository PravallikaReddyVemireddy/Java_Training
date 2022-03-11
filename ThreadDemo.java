package pr1;

public class ThreadDemo extends Thread{
	
	public void run()
	{ 
		
		System.out.println(1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t=new ThreadDemo();
		t.start();
		t.run();
 
	}

}
