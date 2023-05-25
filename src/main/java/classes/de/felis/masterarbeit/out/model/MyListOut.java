package classes.de.felis.masterarbeit.out.model;

import java.time.LocalDate;

public class MyListOut {

    private final int profileId;
    private final int titleId;
    private final int countryId;
    private final LocalDate utcTitleAddDate;

    public MyListOut(int profileId, int titleId, int countryId, LocalDate utcTitleAddDate) {
        this.profileId = profileId;
        this.titleId = titleId;
        this.countryId = countryId;
        this.utcTitleAddDate = utcTitleAddDate;
    }
}
