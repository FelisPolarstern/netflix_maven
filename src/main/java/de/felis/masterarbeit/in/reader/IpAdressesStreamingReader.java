package de.felis.masterarbeit.in.reader;

import de.felis.masterarbeit.in.model.IpAdressesStreamingIn;
import de.felis.masterarbeit.in.model.MyListIn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IpAdressesStreamingReader {

    public static List<IpAdressesStreamingIn> readIpAdressesStreaming(String path) throws IOException {
        List<List<String>> content = ImportHelper.readCsvFile(path);
        List<IpAdressesStreamingIn> returnVal = new ArrayList<>();

        for (List<String> listItem : content) {
            returnVal.add(new IpAdressesStreamingIn(ImportHelper.toString(listItem.get(0)), ImportHelper.toString(listItem.get(1)), ImportHelper.toString(listItem.get(2)),
                    ImportHelper.toString(listItem.get(3)), ImportHelper.toString(listItem.get(4)), ImportHelper.toInstant(listItem.get(5))));
        }
        return returnVal;
    }
}
