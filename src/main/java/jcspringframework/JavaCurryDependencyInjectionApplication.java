package jcspringframework;

import jcspringframework.controller.ConstructorInjectionController;
import jcspringframework.controller.MyController;
import jcspringframework.controller.PropertyInjectionController;
import jcspringframework.controller.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JavaCurryDependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(JavaCurryDependencyInjectionApplication.class, args);

		System.out.println("---------------Primary---------------------");
		MyController obj= (MyController) ctx.getBean("myController");
		System.out.println(obj.sayHello());

		System.out.println("---------------Property---------------------");
		PropertyInjectionController propertyInjectionController= (PropertyInjectionController) ctx.getBean("propertyInjectionController");
		System.out.println(propertyInjectionController.sayHello());

		System.out.println("---------------Setter---------------------");
		SetterInjectionController setterInjectionController=(SetterInjectionController) ctx.getBean("setterInjectionController");
		System.out.println(setterInjectionController.sayHello());

		System.out.println("---------------Constructor---------------------");
		ConstructorInjectionController constructorInjectionController=(ConstructorInjectionController) ctx.getBean("constructorInjectionController");
		System.out.println(constructorInjectionController.sayHello());
	}


}
