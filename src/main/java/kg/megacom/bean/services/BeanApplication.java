package kg.megacom.bean.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Characteristics characteristics = (Characteristics) context.getBean("characteristics");

		Product product = context.getBean("product", Product.class);
		Product productClone = context.getBean("product", Product.class);

		Product2 product2 = context.getBean("product2", Product2.class);

		System.out.println("Product created with @Service annotation: " + product2);
		System.out.println("Product created with @Component annotation: " + product);
		System.out.println("Character created with @Component: " + characteristics);
	}
}
