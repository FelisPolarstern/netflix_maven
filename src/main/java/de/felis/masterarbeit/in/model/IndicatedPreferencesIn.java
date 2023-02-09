package de.felis.masterarbeit.in.model;

import java.time.Instant;
import java.time.LocalDate;

public class IndicatedPreferencesIn {
    private final String profileName;
    private final String show;
    private final boolean hasWatched;
    private final boolean isInterested;
    private final LocalDate eventDate;

    public IndicatedPreferencesIn(String profileName, String show, boolean hasWatched, boolean isInterested, LocalDate eventDate) {
        this.profileName = profileName;
        this.show = show;
        this.hasWatched = hasWatched;
        this.isInterested = isInterested;
        this.eventDate = eventDate;
    }
}
