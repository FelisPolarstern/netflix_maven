package de.felis.masterarbeit.in.reader;

import de.felis.masterarbeit.in.model.RatingsIn;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RatingsReader {

    public static List<RatingsIn> readRatings(String path) throws IOException {
        List<List<String>>  content = ImportHelper.readCsvFileForNetflixData(path);
        List<RatingsIn> returnVal = new ArrayList<>();

        for(List<String> listitem: content){
            String profileName = ImportHelper.toString(listitem.get(0));
            String titleName = ImportHelper.toString(listitem.get(1));
            String ratingType = ImportHelper.toString(listitem.get(2));
            Integer starValue = ImportHelper.toInteger(listitem.get(3));
            Integer thumbsValue =ImportHelper.toInteger(listitem.get(4));
            String deviceModel = ImportHelper.toString(listitem.get(5));
            LocalDateTime eventUtcTs = ImportHelper.toLocalDateTime(listitem.get(6));
            LocalDate regionView = ImportHelper.toLocalDate(listitem.get(7));

            returnVal.add((new RatingsIn(profileName, titleName, ratingType, starValue, thumbsValue, deviceModel, eventUtcTs, regionView)));
        }
        return returnVal;
    }
}
