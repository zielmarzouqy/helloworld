package helloworld.proxy;

import helloworld.proxy.metier.IMetier;
import helloworld.proxy.metier.MetierImpl;

public class Proxy implements IMetier{
	private MetierImpl metier;
	
	public double calcule() {
		if(metier == null) metier = new MetierImpl();
		System.out.println("Ouverture d'une transaction");
		double res = 0.0;
		try {
			res = metier.calcule(); 
			System.out.println("Commit");

		} catch (Exception e) {
			System.out.println("Rollback");
		}
		
		return res;
	}

}
