package de.felis.masterarbeit.in.model;

import java.time.Instant;
import java.time.LocalDate;

public class RatingsIn {
    private final String profileName;
    private final String titleName;
    private final String ratingType;
    private final Integer starValue;
    private final Integer thumbsValue;
    private final String deviceModel;
    private final Instant eventUtcTs;
    private final LocalDate regionViewDate;

    public RatingsIn(String profileName, String titleName, String ratingType, Integer starValue, Integer thumbsValue,
                     String deviceModel, Instant eventUtcTs, LocalDate regionViewDate) {
        this.profileName = profileName;
        this.titleName = titleName;
        this.ratingType = ratingType;
        this.starValue = starValue;
        this.thumbsValue = thumbsValue;
        this.deviceModel = deviceModel;
        this.eventUtcTs = eventUtcTs;
        this.regionViewDate = regionViewDate;
    }
}
