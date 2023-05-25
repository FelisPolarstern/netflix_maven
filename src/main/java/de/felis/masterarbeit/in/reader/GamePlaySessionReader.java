package de.felis.masterarbeit.in.reader;

import de.felis.masterarbeit.in.model.DeviceIn;
import de.felis.masterarbeit.in.model.GamePlaySessionIn;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GamePlaySessionReader {
    public static List<GamePlaySessionIn> readGamePlaySession(String path) throws IOException {
        List<List<String>> content = ImportHelper.readCsvFile(path);  //Inhalt der Datei wird geladen
        List<GamePlaySessionIn> returnVal = new ArrayList<>();

        for (List<String> listitem : content) {
            String profileName = ImportHelper.toString(listitem.get(0));
            LocalDateTime startTime = ImportHelper.toLocalDateTime(listitem.get(1));
            Integer duration = ImportHelper.toInteger(listitem.get(2));
            String gameTitle = ImportHelper.toString(listitem.get(3));
            String plattform = ImportHelper.toString(listitem.get(4));
            String deviceType = ImportHelper.toString(listitem.get(5));
            String country = ImportHelper.toString(listitem.get(6));
            String esn = ImportHelper.toString(listitem.get(7));
            String ip = ImportHelper.toString(listitem.get(8));

            returnVal.add(new GamePlaySessionIn(profileName, startTime, duration, gameTitle, plattform, deviceType, country,
                    esn, ip));
        }
        return returnVal;
    }
}
