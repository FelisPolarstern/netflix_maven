package de.felis.masterarbeit.in.model;

import java.time.Instant;
import java.time.LocalDate;

public class MyListIn {
        private final String profileName;
        private final String titleName;
        private final String country;
        private final LocalDate utcTitleAddDate;

    public MyListIn(String profileName, String titleName, String country, LocalDate utcTitleAddDate) {
        this.profileName = profileName;
        this.titleName = titleName;
        this.country = country;
        this.utcTitleAddDate = utcTitleAddDate;
    }

    public String getProfileName() {
        return profileName;
    }

    public String getTitleName() {
        return titleName;
    }

    public String getCountry() {
        return country;
    }

    public LocalDate getUtcTitleAddDate() {
        return utcTitleAddDate;
    }
}
