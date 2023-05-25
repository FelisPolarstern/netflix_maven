package de.felis.masterarbeit.in.reader;

import de.felis.masterarbeit.in.model.CountryIn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountryReader {
    public static List<CountryIn> readCountryIn(String path) throws IOException {
        List<List<String>>  content = ImportHelper.readCsvFileForCountry(path);
        List<CountryIn> returnVal = new ArrayList<>();
        int i = 0;
        for(List<String> listitem: content){
            returnVal.add(new CountryIn(i,ImportHelper.toString(listitem.get(1)), ImportHelper.toString(listitem.get(2))));
        }
        return returnVal;
    }
}
