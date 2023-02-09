package de.felis.masterarbeit.in.model;
import java.time.Instant;
import java.time.LocalDateTime;

public class ClickstreamIn {

    private final String profileName;
    private final String source;
    private final String navigationLevel;
    private final String referrerUrl;
    private final String webpageUrl;
    private final LocalDateTime clickUtcTs;

    public ClickstreamIn(String profileName, String source, String navigationLevel, String referrerUrl, String webpageUrl, LocalDateTime clickUtcTs) {
        this.profileName = profileName;
        this.source = source;
        this.navigationLevel = navigationLevel;
        this.referrerUrl = referrerUrl;
        this.webpageUrl = webpageUrl;
        this.clickUtcTs = clickUtcTs;
    }
}
