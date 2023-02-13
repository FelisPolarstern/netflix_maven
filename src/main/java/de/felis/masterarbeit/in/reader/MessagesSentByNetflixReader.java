package de.felis.masterarbeit.in.reader;

import de.felis.masterarbeit.in.model.IpAdressesStreamingIn;
import de.felis.masterarbeit.in.model.MessagesSentByNetflixIn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MessagesSentByNetflixReader {
    public static List<MessagesSentByNetflixIn> readIpAdressesStreaming(String path) throws IOException {
        List<List<String>> content = ImportHelper.readCsvFile(path);
        List<MessagesSentByNetflixIn> returnVal = new ArrayList<>();

        for (List<String> listItem : content) {
            returnVal.add(new MessagesSentByNetflixIn
                    (ImportHelper.toString(listItem.get(0)), ImportHelper.toInstant(listItem.get(1)), ImportHelper.toString(listItem.get(2)),
                    ImportHelper.toString(listItem.get(3)), ImportHelper.toString(listItem.get(4)), ImportHelper.toString(listItem.get(5)),
                     ImportHelper.toString(listItem.get(6)), ImportHelper.toString(listItem.get(7)), ImportHelper.toString(listItem.get(8)),
                     ImportHelper.toInstant(listItem.get(9)), ImportHelper.toString(listItem.get(10)), ImportHelper.toInt(listItem.get(11))));
        }
        return returnVal;
    }
}
