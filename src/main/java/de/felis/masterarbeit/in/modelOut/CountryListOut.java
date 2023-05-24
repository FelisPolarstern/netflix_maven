package de.felis.masterarbeit.in.modelOut;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class CountryListOut {

    List<Country> countryList;

    public CountryListOut() {
        this.countryList = new ArrayList<>();
    }

    public boolean addCountry(String countryName){
        for(Country currentCountry: countryList){
            if(currentCountry.getCountry().equalsIgnoreCase(countryName)){
                return false;
            }
        }
        this.countryList.add(new Country(countryName));
        return true;
    }

}
