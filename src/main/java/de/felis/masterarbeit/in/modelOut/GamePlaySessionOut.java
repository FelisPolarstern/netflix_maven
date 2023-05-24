package de.felis.masterarbeit.in.modelOut;

import java.time.Instant;

public class GamePlaySessionOut {

    private final int profileId;
    private final Instant startTime; //Todo Datentyp prüfen
    private final String duration; //Todo Geht das auch als datumstyp?
    private final String gameTitle;
    private final String plattform;
    private final int deviceTypeId;
    private final String country;
    private final String esn;
    private final String ip;

    public GamePlaySessionOut(int profileId, Instant startTime, String duration, String gameTitle, String plattform, int deviceTypeId, String country, String esn, String ip) {
        this.profileId = profileId;
        this.startTime = startTime;
        this.duration = duration;
        this.gameTitle = gameTitle;
        this.plattform = plattform;
        this.deviceTypeId = deviceTypeId;
        this.country = country;
        this.esn = esn;
        this.ip = ip;
    }
}
