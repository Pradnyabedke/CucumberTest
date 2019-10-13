package Thread;

public class Test extends  Thread{

	public void run() {
		// TODO Auto-generated method stub
		{
			for(int i = 1; i <= 5; i++)
			{
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i);
				
			}
		}
	}
}
