package classes.de.felis.masterarbeit.out.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RatingsOut {
    private final int ratingId;
    private final int profileId;
    private final int titleId;
    private final String ratingType;
    private final Integer starValue;
    private final Integer thumbsValue;
    private final String deviceModel;
    private final LocalDateTime eventUtcTs;
    private final LocalDate regionViewDate;

    public RatingsOut(int ratingId, int profileId, int titleId, String ratingType, Integer starValue, Integer thumbsValue,
                      String deviceModel, LocalDateTime eventUtcTs, LocalDate regionViewDate) {
        this.ratingId = ratingId;
        this.profileId = profileId;
        this.titleId = titleId;
        this.ratingType = ratingType;
        this.starValue = starValue;
        this.thumbsValue = thumbsValue;
        this.deviceModel = deviceModel;
        this.eventUtcTs = eventUtcTs;
        this.regionViewDate = regionViewDate;
    }
}
