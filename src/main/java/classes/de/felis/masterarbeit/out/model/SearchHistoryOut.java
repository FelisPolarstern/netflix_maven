package classes.de.felis.masterarbeit.out.model;

import java.time.LocalDateTime;

public class SearchHistoryOut {

    private final int profileId;
    private final int countryId;
    private final int deviceTypeId;
    private final boolean isKids;
    private final String queryTyped;
    private final String displayedName;
    private final String action;
    private final String section;
    private final LocalDateTime utcTimestamp;

    public SearchHistoryOut(int profileId, int countryId, int deviceTypeId, boolean isKids, String queryTyped,
                            String displayedName, String action, String section, LocalDateTime utcTimestamp) {
        this.profileId = profileId;
        this.countryId = countryId;
        this.deviceTypeId = deviceTypeId;
        this.isKids = isKids;
        this.queryTyped = queryTyped;
        this.displayedName = displayedName;
        this.action = action;
        this.section = section;
        this.utcTimestamp = utcTimestamp;
    }
}
