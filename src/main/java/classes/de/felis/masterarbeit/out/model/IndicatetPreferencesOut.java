package classes.de.felis.masterarbeit.out.model;

import java.time.LocalDate;

public class IndicatetPreferencesOut {
    private final int profileID;
    private final String profileName;
    private final int titleID;
    private final boolean hasWatched;
    private final boolean isInterested;
    private final LocalDate eventDate;
    private int interactiveID;


    public IndicatetPreferencesOut(String profileName, String show, int titleID, int profileID, int titleID1, boolean hasWatched, boolean isInterested, LocalDate eventDate) {
        this.profileName = profileName;
        this.profileID = profileID;
        this.titleID = titleID1;
        this.hasWatched = hasWatched;
        this.isInterested = isInterested;
        this.eventDate = eventDate;
    }

    public void setInteractiveID(int interactiveID) {
        this.interactiveID = interactiveID;
    }


}
