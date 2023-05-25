package classes.de.felis.masterarbeit.out.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GamePlaySessionOut {

    private final int profileId;
    private final LocalDateTime startTime;
    private final int duration;
    private final String gameTitle;
    private final String plattform;
    private final int deviceTypeId;
    private final String country;
    private final String esn;
    private final String ip;

    public GamePlaySessionOut(int profileId, LocalDateTime startTime, int duration, String gameTitle, String plattform, int deviceTypeId, String country, String esn, String ip) {
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
