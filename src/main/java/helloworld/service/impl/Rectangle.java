package helloworld.service.impl;


import org.springframework.stereotype.Component;

import helloworld.service.Shap;
@Component
public class Rectangle implements Shap{

	public void draw() {
		System.out.println("Inside Rectangle draw method.");
	}

}
