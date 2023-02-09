package de.felis.masterarbeit.in.model;

import java.time.Instant;
import java.time.LocalDateTime;

public class PlaybackRelatedEventsIn {

    private final String profileName;
    private final String titleDescription;
    private final String device;
    private final LocalDateTime playbackStartUtcTs;
    private final String country;
    private final String playtraces;

    public PlaybackRelatedEventsIn(String profileName, String titleDescription, String device, LocalDateTime playbackStartUtcTs, String country, String playtraces) {
        this.profileName = profileName;
        this.titleDescription = titleDescription;
        this.device = device;
        this.playbackStartUtcTs = playbackStartUtcTs;
        this.country = country;
        this.playtraces = playtraces;
    }
}
