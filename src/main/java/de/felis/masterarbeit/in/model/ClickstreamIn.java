package de.felis.masterarbeit.in.model;
import java.time.Instant;

public class ClickstreamIn {

    private final String profileName;
    private final String source;
    private final String navigationLevel;
    private final String referrerUrl;
    private final String webpageUrl;
    private final Instant clickUtcTs;

    public ClickstreamIn(String profileName, String source, String navigationLevel, String referrerUrl, String webpageUrl, Instant clickUtcTs) {
        this.profileName = profileName;
        this.source = source;
        this.navigationLevel = navigationLevel;
        this.referrerUrl = referrerUrl;
        this.webpageUrl = webpageUrl;
        this.clickUtcTs = clickUtcTs;
    }
}
