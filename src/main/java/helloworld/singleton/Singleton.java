package helloworld.singleton;

public class Singleton {
	private static final Singleton singleton;
	static {
		singleton = new Singleton();
	}
	public int compteur;
	public int test = 15;
	private Singleton() {
		System.out.println("Instanciation du singleton");
	}
	public static Singleton getSingleton() {
		return singleton;
	}
//	
	public /*synchronized*/ void traiter(String taskName) {
		System.out.println("..... Traitement de la tache " + taskName);
		for(int i=1;i<=5;i++) {
//			synchronized (this) {
//				++compteur;
//			}
			++compteur;
			System.out.println(".."+compteur);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("..... Fin du traitement de la tache "+taskName+" compteur="+compteur);
	}

}
