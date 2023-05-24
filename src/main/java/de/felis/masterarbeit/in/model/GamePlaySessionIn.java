package de.felis.masterarbeit.in.model;

import java.time.Instant;

//Todo Readerklasse
public class GamePlaySessionIn {
    private final String profile;
    private final Instant startTime; //Todo Datentyp prüfen
    private final String duration; //Todo Geht das auch als datumstyp?
    private final String gameTitle;
    private final String plattform;
    private final String deviceType;
    private final String country;
    private final String esn;
    private final String ip;

    public GamePlaySessionIn(String profile, Instant startTime, String duration, String gameTitle, String plattform, String deviceType, String country, String esn, String ip) {
        this.profile = profile;
        this.startTime = startTime;
        this.duration = duration;
        this.gameTitle = gameTitle;
        this.plattform = plattform;
        this.deviceType = deviceType;
        this.country = country;
        this.esn = esn;
        this.ip = ip;
    }
}
