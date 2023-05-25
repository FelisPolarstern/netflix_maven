package de.felis.masterarbeit.in.model;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class GamePlaySessionIn {
    private final String profile;
    private final LocalDateTime startTime;
    private final int duration;
    private final String gameTitle;
    private final String plattform;
    private final String deviceType;
    private final String country;
    private final String esn;
    private final String ip;

    public GamePlaySessionIn(String profile, LocalDateTime startTime, int duration, String gameTitle, String plattform, String deviceType, String country, String esn, String ip) {
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
