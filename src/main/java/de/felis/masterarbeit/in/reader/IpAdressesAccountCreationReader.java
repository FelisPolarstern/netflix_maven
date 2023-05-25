package de.felis.masterarbeit.in.reader;

import de.felis.masterarbeit.in.model.IpAdressesAccountCreationIn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IpAdressesAccountCreationReader {

    public static List<IpAdressesAccountCreationIn> readIpAdressesAccountCreation(String path) throws IOException {
        List<List<String>> content = ImportHelper.readCsvFileForNetflixData(path);
        List<IpAdressesAccountCreationIn> returnVal = new ArrayList<>();

        for (List<String> listItem : content) {
            returnVal.add(new IpAdressesAccountCreationIn(ImportHelper.toString(listItem.get(0)), ImportHelper.toString(listItem.get(1)), ImportHelper.toString(listItem.get(2)),
                    ImportHelper.toString(listItem.get(3)), ImportHelper.toString(listItem.get(4)), ImportHelper.toString(listItem.get(5)),
                    ImportHelper.toInstant(listItem.get(6))));
        }
        return returnVal;
    }
}
