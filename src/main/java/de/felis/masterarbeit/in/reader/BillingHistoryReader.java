package de.felis.masterarbeit.in.reader;

import de.felis.masterarbeit.in.model.BillingHistoryIn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BillingHistoryReader {
    public static List<BillingHistoryIn> readIpAdressesStreaming(String path) throws IOException {
        List<List<String>> content = ImportHelper.readCsvFileForNetflixData(path);
        List<BillingHistoryIn> returnVal = new ArrayList<>();

        for (List<String> listItem : content) {
            returnVal.add(new BillingHistoryIn(
                    ImportHelper.toLocalDate(listItem.get(0)), ImportHelper.toLocalDate(listItem.get(1)), ImportHelper.toLocalDate(listItem.get(2)),
                    ImportHelper.toString(listItem.get(3)), ImportHelper.toString(listItem.get(4)), ImportHelper.toString(listItem.get(5)),
                    ImportHelper.toLocalDate(listItem.get(6)), ImportHelper.toString(listItem.get(7)), ImportHelper.toFloat(listItem.get(8)), ImportHelper.toString(listItem.get(9)),
                   ImportHelper.toFloat(listItem.get(10)), ImportHelper.toFloat(listItem.get(11)), ImportHelper.toString(listItem.get(12)),
                    ImportHelper.toString(listItem.get(13)), ImportHelper.toString(listItem.get(14)), ImportHelper.toString(listItem.get(15)),
                    ImportHelper.toLocalDate(listItem.get(16))));
        }
        return returnVal;
    }
}
