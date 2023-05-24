package de.felis.masterarbeit.in.modelOut;

import java.time.LocalDateTime;
import java.util.List;

public class PlaybackRelatedEventsOut {

    private final int profileId;
    private final int titleId;
    private final int deviceId;
    private final LocalDateTime playbackStartUtcTs;
    private final int countryId;
    List<Playtraces> playtracesList;

    public PlaybackRelatedEventsOut(int profileId, int titleId, int deviceId, LocalDateTime playbackStartUtcTs, int countryId) {
        this.profileId = profileId;
        this.titleId = titleId;
        this.deviceId = deviceId;
        this.playbackStartUtcTs = playbackStartUtcTs;
        this.countryId = countryId;
    }

    public void setPlaytracesList(List<Playtraces> playtracesList) {
        this.playtracesList = playtracesList;
    }
}
