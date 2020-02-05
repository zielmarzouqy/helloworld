package helloworld.singleton;

public class TreadedTask extends Thread{
	private String taskName;
	public TreadedTask(String taskName) {
		this.taskName=taskName;
	}
	
	@Override
	public void run() {
//		Singleton singleton = Singleton.getSingleton();
//		singleton.traiter(taskName);
	}
}
