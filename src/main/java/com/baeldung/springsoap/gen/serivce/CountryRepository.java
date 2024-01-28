package com.baeldung.springsoap.gen.serivce;

import com.baeldung.springsoap.gen.Country;
import com.baeldung.springsoap.gen.Currency;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Country harryPotterI = new Country();
        harryPotterI.setCapital("巴黎");
        harryPotterI.setName("法國");;
        harryPotterI.setCurrency(Currency.EUR);
        harryPotterI.setPopulation(198555);


        countries.put(harryPotterI.getName(), harryPotterI);
    }

    public Country findCountry(String name) {
        return countries.get(name);
    }
}
