import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import helloworld.service.GeometryExample1;

public class MainApp {

	public static void main(String args[]) 
	{
		List<String> list = null;
		// master local and remote change
//		@SuppressWarnings("resource")
//		ApplicationContext appcntxt = new ClassPathXmlApplicationContext("applicationContext.xml");
//		GeometryExample1 geo = appcntxt.getBean("geometryExample1", GeometryExample1.class);
//		geo.drawShape();
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		GeometryExample1 geo = context.getBean(GeometryExample1.class);
		geo.drawShape();
		
	}
	
	

}
