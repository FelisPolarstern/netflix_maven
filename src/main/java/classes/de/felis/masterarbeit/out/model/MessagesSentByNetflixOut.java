package classes.de.felis.masterarbeit.out.model;

import java.time.LocalDateTime;

public class MessagesSentByNetflixOut {
    private final int profileId;
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
    private final int deviceModelId;
    private final Integer clickCnt;

    public MessagesSentByNetflixOut(int profileId, LocalDateTime sentUtcTs, String messageName, String channel,
                                    String countryIsoCode, String accountLocale, String emailLocale, String titleName,
                                    String emailDomainName, String linksUrl, LocalDateTime clickUtcTs, int deviceModelId, Integer clickCnt) {
        this.profileId = profileId;
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
        this.deviceModelId = deviceModelId;
        this.clickCnt = clickCnt;
    }
}
