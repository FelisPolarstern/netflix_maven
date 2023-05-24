package de.felis.masterarbeit.in.modelOut;

public class Playtraces {
    //TODO brauchen die eine ID?
    private final String eventType;
    private final int sessionOffsetMs;
    private final int mediaOffsetMs;
    private final int playbackRelatedEventsId;

    public Playtraces(String eventType, int sessionOffsetMs, int mediaOffsetMs, int playbackRelatedEventsId) {
        this.eventType = eventType;
        this.sessionOffsetMs = sessionOffsetMs;
        this.mediaOffsetMs = mediaOffsetMs;
        this.playbackRelatedEventsId = playbackRelatedEventsId;
    }
}
