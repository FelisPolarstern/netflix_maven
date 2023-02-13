package de.felis.masterarbeit.in.model;

import java.time.*;

public class MessagesSentByNetflixIn {
    private final String profileName;
    private final LocalDateTime sentUtcTs;
    private final String messageName;
    private final String channel;
    private final String countryIsoCode;
    private final String accountLocale;
    private final String emailLocale;
    private final String titleName;
    private final String emailDomainName;
    private final String linksUrl;
    private final LocalDateTime clickUtcTs;
    private final String deviceModel;
    private final Integer clickCnt;

    public MessagesSentByNetflixIn(String profileName, LocalDateTime sentUtcTs, String messageName, String channel, String countryIsoCode,
                                   String accountLocale, String emailLocale, String titleName, String emailDomainName,
                                   String linksUrl, LocalDateTime clickUtcTs, String deviceModel, Integer clickCnt) {
        this.profileName = profileName;
        this.sentUtcTs = sentUtcTs;
        this.messageName = messageName;
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
