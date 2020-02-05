package helloworld.singleton;

public class ApplicationSingleton {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			Singleton singleton = Singleton.getSingleton();
			//singleton.traiter("T"+i);
//			TreadedTask treadedTask = new TreadedTask("T"+i);
//			treadedTask.start();
			singleton.test = 16;
		}
		Singleton singleton = Singleton.getSingleton();
		System.out.println("==================================");
		System.out.println("test "+singleton.test);
	}

}
