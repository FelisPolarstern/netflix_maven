package de.felis.masterarbeit.in.reader;

import de.felis.masterarbeit.in.model.PlaybackRelatedEventsIn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlaybackRelatedEventsReader {
    public static List<PlaybackRelatedEventsIn> readPlaybackRelatedEvents(String path) throws IOException {
        List<List<String>> content = ImportHelper.readCsvFileForNetflixData(path);
        List<PlaybackRelatedEventsIn> returnVal = new ArrayList<>();

        for (List<String> listItem : content) {
            returnVal.add(new PlaybackRelatedEventsIn(ImportHelper.toString(listItem.get(0)), ImportHelper.toString(listItem.get(1)), ImportHelper.toString(listItem.get(2)),
                    ImportHelper.toLocalDateTime(listItem.get(3)), ImportHelper.toString(listItem.get(4)), ImportHelper.toString(listItem.get(5))));
        }
        return returnVal;
    }
}

