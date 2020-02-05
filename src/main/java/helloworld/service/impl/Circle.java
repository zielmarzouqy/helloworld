package helloworld.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import helloworld.service.Shap;
@Primary
@Component
public class Circle implements Shap{

	public void draw() {
		System.out.println("Inside Circle draw method.");
	}

}
