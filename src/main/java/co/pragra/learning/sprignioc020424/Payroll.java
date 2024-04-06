package co.pragra.learning.sprignioc020424;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class Payroll {

    @Autowired
    CPPTaxes cppTaxes;


    String ei;

//    public Payroll(CPPTaxes cppTaxes, String ei) {
//        this.cppTaxes = cppTaxes;
//        this.ei = ei;
//    }

    public void startPayroll(){

        cppTaxes.applyCPP();
        System.out.println("Payroll Started " + Instant.now());
    }
}
