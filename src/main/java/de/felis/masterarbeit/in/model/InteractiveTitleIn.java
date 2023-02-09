package de.felis.masterarbeit.in.model;

import java.time.Instant;
import java.time.LocalDateTime;

public class InteractiveTitleIn {
    private final String profileName;
    private final String titleDesc;
    private final String selectionType;
    private final String choiceSegmentId;
    private final boolean hasWatched;
    private final String source;
    private final LocalDateTime utcTimestamp;

    public InteractiveTitleIn(String profileName, String titleDesc, String selectionType, String choiceSegmentId, boolean hasWatched, String source, LocalDateTime utcTimestamp) {
        this.profileName = profileName;
        this.titleDesc = titleDesc;
        this.selectionType = selectionType;
        this.choiceSegmentId = choiceSegmentId;
        this.hasWatched = hasWatched;
        this.source = source;
        this.utcTimestamp = utcTimestamp;
    }
}
