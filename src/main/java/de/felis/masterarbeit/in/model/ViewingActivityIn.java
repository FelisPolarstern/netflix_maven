package de.felis.masterarbeit.in.model;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

public class ViewingActivityIn {
    private final String profileName;
    private final LocalDateTime startTime;
    private final Duration duration;
    private final String attributes;
    private final String title;
    private final String supplementalVideoType;
    private final String deviceType;
    private final Duration bookmark;
    private final Duration latestBookmark;
    private final String country;

    public ViewingActivityIn(String profileName, LocalDateTime startTime, Duration duration, String attributes,
                             String title, String supplementalVideoType, String deviceType, Duration bookmark,
                             Duration latestBookmark, String country) {
        this.profileName = profileName;
        this.startTime = startTime;
        this.duration = duration;
        this.attributes = attributes;
        this.title = title;
        this.supplementalVideoType = supplementalVideoType;
        this.deviceType = deviceType;
        this.bookmark = bookmark;
        this.latestBookmark = latestBookmark;
        this.country = country;
    }
}
