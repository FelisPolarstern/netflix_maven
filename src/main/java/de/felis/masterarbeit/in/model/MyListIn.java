package de.felis.masterarbeit.in.model;

import java.time.Instant;

public class MyListIn {
        private final String profileName;
        private final String titleName;
        private final String country;
        private final Instant utcTitleAddDate;

    public MyListIn(String profileName, String titleName, String country, Instant utcTitleAddDate) {
        this.profileName = profileName;
        this.titleName = titleName;
        this.country = country;
        this.utcTitleAddDate = utcTitleAddDate;
    }
}
