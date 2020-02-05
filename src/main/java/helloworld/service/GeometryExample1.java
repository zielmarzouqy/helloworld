package helloworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class GeometryExample1 {
	@Autowired
	private Shap shap;
	
//	public GeometryExample1(Shap shap) {
//		this.shap = shap;
//	}
	
	 public void drawShape() {
	      shap.draw();
	 }

//	public Shap getShap() {
//		return shap;
//	}

	public void setShap(Shap shap) {
		this.shap = shap;
	}
	

}
