package helloworld.proxy.presentation;

import helloworld.proxy.Proxy;
import helloworld.proxy.metier.IMetier;

public class Client {
	private IMetier metier = new Proxy();
	public Client() {
		System.out.println(metier.calcule());
	}
	public static void main(String[] args) {
		new Client();
	}
}
