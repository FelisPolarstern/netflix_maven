package de.felis.masterarbeit.in.model;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class SearchHistoryIn {
    private final String profileName;
    private final String countryIsoCode;
    private final String device;
    private final boolean isKids;
    private final String queryTyped;
    private final String displayedName;
    private final String action;
    private final String section;
    private final LocalDateTime utcTimestamp;

    public SearchHistoryIn(String profileName, String countryIsoCode, String device, boolean isKids, String queryTyped, String displayedName, String action, String section, LocalDateTime utcTimestamp) {
        this.profileName = profileName;
        this.countryIsoCode = countryIsoCode;
        this.device = device;
        this.isKids = isKids;
        this.queryTyped = queryTyped;
        this.displayedName = displayedName;
        this.action = action;
        this.section = section;
        this.utcTimestamp = utcTimestamp;
    }
}
