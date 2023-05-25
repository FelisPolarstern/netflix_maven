package classes.de.felis.masterarbeit.out.model;

import java.time.LocalDateTime;

public class ClickstreamOut {
    private final int accountID;
    private final int clickstreamID;
    private final String profileName;
    private final String source;
    private final String navigationLevel;
    private final String referrerUrl;
    private final String webpageUrl;
    private final LocalDateTime clickUtcTs;

    public ClickstreamOut(int accountID, int clickstreamID, String profileName, String source, String navigationLevel, String referrerUrl, String webpageUrl, LocalDateTime clickUtcTs) {
        this.accountID = accountID;
        this.clickstreamID = clickstreamID;
        this.profileName = profileName;
        this.source = source;
        this.navigationLevel = navigationLevel;
        this.referrerUrl = referrerUrl;
        this.webpageUrl = webpageUrl;
        this.clickUtcTs = clickUtcTs;
    }
}
