package co.pragra.learning.sprignioc020424;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class SprignIoc020424Application {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        PetrolEngine petrolEngine = context.getBean(PetrolEngine.class);
        PetrolEngine petrolEngine2 = context.getBean(PetrolEngine.class);
        PetrolEngine petrolEngine3 = context.getBean(PetrolEngine.class);
        PetrolEngine petrolEngine4 = context.getBean(PetrolEngine.class);
        PetrolEngine petrolEngine5 = context.getBean(PetrolEngine.class);
        PetrolEngine petrolEngine6 = context.getBean(PetrolEngine.class);
        System.out.println(petrolEngine);
        System.out.println(petrolEngine2);
        System.out.println(petrolEngine3);
        System.out.println(petrolEngine4);
        System.out.println(petrolEngine5);
        System.out.println(petrolEngine6);

        BMW bmw = context.getBean( "bmw",BMW.class);
        BMW bmw2 = context.getBean( "bmw2",BMW.class);
        BMW bmw3 = context.getBean( "bmw",BMW.class);
        BMW bmw4 = context.getBean( "bmw",BMW.class);
        BMW bmw5 = context.getBean( "bmw",BMW.class);
        System.out.println(bmw);
        System.out.println(bmw2);
        System.out.println(bmw3);
        System.out.println(bmw4);
        System.out.println(bmw5);


        //database transaction

        //SpringApplication.run(SprignIoc020424Application.class, args);
        //BMW bmw = new BMW(new PetrolEngine("Petrol", 220),220);
        //init
        //post construct
        //bmw.play();
        //pre detroy

    }

}
