package co.pragra.learning.sprignioc020424;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Component
public class CPPTaxes {

    public void applyCPP(){
        System.out.println("CPP applied " + Instant.now());
    }
}
