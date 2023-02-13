package de.felis.masterarbeit.in.model;

import java.time.Instant;

public class MessagesSentByNetflixIn {
    private final String profileName;
    private final Instant sentUtcTs;
    private final String channel;
    private final String countryIsoCode;
    private final String accountLocale;
    private final String emailLocale;
    private final String titleName;
    private final String emailDomainName;
    private final String linksUrl;
    private final Instant clickUtcTs;
    private final String deviceModel;
    private final Integer clickCnt;

    public MessagesSentByNetflixIn(String profileName, Instant sentUtcTs, String channel, String countryIsoCode,
                                   String accountLocale, String emailLocale, String titleName, String emailDomainName,
                                   String linksUrl, Instant clickUtcTs, String deviceModel, Integer clickCnt) {
        this.profileName = profileName;
        this.sentUtcTs = sentUtcTs;
        this.channel = channel;
        this.countryIsoCode = countryIsoCode;
        this.accountLocale = accountLocale;
        this.emailLocale = emailLocale;
        this.titleName = titleName;
        this.emailDomainName = emailDomainName;
        this.linksUrl = linksUrl;
        this.clickUtcTs = clickUtcTs;
        this.deviceModel = deviceModel;
        this.clickCnt = clickCnt;
    }
}
