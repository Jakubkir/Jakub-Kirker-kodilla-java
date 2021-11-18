package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



public final class World {

   private final List<Continent> listContinet = new ArrayList<>();

    public List<Continent> getListContinet() {
        return listContinet;
    }

    public void addContinent(Continent continent){
       listContinet.add(continent);
   }
   public BigDecimal getPeopleQuantityAll(){
       return listContinet.stream()
               .flatMap(continent -> continent.getListCountry().stream())
               .map(Country::getGetPeopleQuantity)
               .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
   }

}
