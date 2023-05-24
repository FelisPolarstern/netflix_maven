package de.felis.masterarbeit.in.model;

import java.time.Instant;
//TODO Readerklasse
public class ProfilesIn {
    private final String profileName;
    private final String emailAdress;
    private final Instant profileCreationTime; //TODO ist das der richtige Datentyp?

    private final int maturityLevel;

    private final boolean hasAutoPlayback;

    private final String maxStramWuality;
    private final boolean profileTransfered;
    private final Instant profileTransferTime;

    public ProfilesIn(String profileName, String emailAdress, Instant profileCreationTime, int maturityLevel, boolean hasAutoPlayback, String maxStramWuality, boolean profileTransfered, Instant profileTransferTime) {
        this.profileName = profileName;
        this.emailAdress = emailAdress;
        this.profileCreationTime = profileCreationTime;
        this.maturityLevel = maturityLevel;
        this.hasAutoPlayback = hasAutoPlayback;
        this.maxStramWuality = maxStramWuality;
        this.profileTransfered = profileTransfered;
        this.profileTransferTime = profileTransferTime;
    }
}
