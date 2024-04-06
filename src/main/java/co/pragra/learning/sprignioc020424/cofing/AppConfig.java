package co.pragra.learning.sprignioc020424.cofing;

import co.pragra.learning.sprignioc020424.BMW;
import co.pragra.learning.sprignioc020424.Payroll;
import co.pragra.learning.sprignioc020424.PetrolEngine;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("application.properties")
public class AppConfig {
    //
    @Value("#{'${engine}'.substring(2)}") //SPEL #{  }
    private String engineType;


    @Bean
    @Scope(value = "prototype")
    public PetrolEngine getPetrolEngine(){
        PetrolEngine petrolEngine = new PetrolEngine(engineType,600);

        return petrolEngine;
    }

    @Bean
    public BMW getBMW(){
        BMW bmw = new BMW(getPetrolEngine(),560);
        return bmw;
    }
    @Bean
    public BMW getBMW2(){
        BMW bmw2 = new BMW(getPetrolEngine(),760);
        return bmw2;
    }

    @Bean
    public String abc(){
        return "aaa";
    }

//    @Bean
//    public Payroll getPayroll(){
//        return new Payroll();
//    }
}
