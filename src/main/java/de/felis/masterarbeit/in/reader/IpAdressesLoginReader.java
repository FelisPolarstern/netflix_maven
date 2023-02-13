package de.felis.masterarbeit.in.reader;

import de.felis.masterarbeit.in.model.IpAdressesLoginIn;
import de.felis.masterarbeit.in.model.IpAdressesStreamingIn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IpAdressesLoginReader {
    public static List<IpAdressesLoginIn> readIpAdressesLogin(String path) throws IOException {
        List<List<String>> content = ImportHelper.readCsvFile(path);
        List<IpAdressesLoginIn> returnVal = new ArrayList<>();

        for (List<String> listItem : content) {
            returnVal.add(new IpAdressesLoginIn(ImportHelper.toString(listItem.get(0)), ImportHelper.toString(listItem.get(1)), ImportHelper.toString(listItem.get(2)),
                    ImportHelper.toString(listItem.get(3)), ImportHelper.toInstant(listItem.get(4))));
        }
        return returnVal;
    }
}
