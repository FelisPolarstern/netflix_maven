package de.felis.masterarbeit.in.modelOut;

import java.time.Duration;
import java.time.LocalDateTime;

public class ViewingActivityOut {
    private final int profileId;
    private final LocalDateTime startTime;
    private final Duration duration;
    private final String attributes;
    private final int titleId;
    private final String supplementalVideoType;
    private final int deviceId;
    private final Duration bookmark;
    private final Duration latestBookmark;
    private final String country;

    public ViewingActivityOut(int profileId, LocalDateTime startTime, Duration duration, String attributes, int titleId, String supplementalVideoType, int deviceId, Duration bookmark, Duration latestBookmark, String country) {
        this.profileId = profileId;
        this.startTime = startTime;
        this.duration = duration;
        this.attributes = attributes;
        this.titleId = titleId;
        this.supplementalVideoType = supplementalVideoType;
        this.deviceId = deviceId;
        this.bookmark = bookmark;
        this.latestBookmark = latestBookmark;
        this.country = country;
    }
}
