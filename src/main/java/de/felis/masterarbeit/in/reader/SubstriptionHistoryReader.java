package de.felis.masterarbeit.in.reader;

import de.felis.masterarbeit.in.model.SubscriptionHistoryIn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SubstriptionHistoryReader {

    public static List<SubscriptionHistoryIn> readSubscriptionHistoryLis(String path) throws IOException{
        List<List<String>> content = ImportHelper.readCsvFileForNetflixData(path);
        List<SubscriptionHistoryIn> returnVal = new ArrayList<>();

        for(List<String> listItem: content){
            returnVal.add(new SubscriptionHistoryIn(ImportHelper.toInstant(listItem.get(0)),ImportHelper.toBoolean(listItem.get(1)), ImportHelper.toInstant(listItem.get(2)),
                                                    ImportHelper.toString(listItem.get(3)), ImportHelper.toString(listItem.get(4)), ImportHelper.toInteger(listItem.get(5)),
                                                    ImportHelper.toString(listItem.get(6)), ImportHelper.toLocalDate(listItem.get(7)), ImportHelper.toString(listItem.get(8)),
                                                    ImportHelper.toInteger(listItem.get(9)), ImportHelper.toString(listItem.get(10)), ImportHelper.toString(listItem.get(11)),
                                                    ImportHelper.toInteger(listItem.get(12)), ImportHelper.toString(listItem.get(13)), ImportHelper.toString(listItem.get(14))));

        }
        return returnVal;
    }
}
