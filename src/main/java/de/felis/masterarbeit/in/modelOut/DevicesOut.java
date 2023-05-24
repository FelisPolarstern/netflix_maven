package de.felis.masterarbeit.in.modelOut;

import java.time.Instant;

public class DevicesOut {
    private final int profileId;
    private final String esn;
    private final int deviceId;
    private final Instant acctFirstPlaybackDate;
    private final Instant acctLastPlaybackDate;
    private final Instant acctFirstPlaybackDateForUseGeneratedPlays;
    private final Instant acctLastPlaybackDateForUserGeneratedPlays;
    private final Instant profileFirstPlaybackDate;
    private final Instant profileLastPlaybackDate;
    private final Instant profileFirstPlaybackDateForUserGeneratedPlays;
    private final Instant profileLastPlaybackDateForUserGeneratedPlays;
    private final Instant deactivationTime;
    private final String iPAdressesAccountCreation;
    private final String gamePlaySession;

    public DevicesOut(int profileId, String esn, int deviceId, Instant acctFirstPlaybackDate, Instant acctLastPlaybackDate,
                      Instant acctFirstPlaybackDateForUseGeneratedPlays, Instant acctLastPlaybackDateForUserGeneratedPlays,
                      Instant profileFirstPlaybackDate, Instant profileLastPlaybackDate, Instant profileFirstPlaybackDateForUserGeneratedPlays,
                      Instant profileLastPlaybackDateForUserGeneratedPlays, Instant deactivationTime, String iPAdressesAccountCreation,
                      String gamePlaySession) {
        this.profileId = profileId;
        this.esn = esn;
        this.deviceId = deviceId;
        this.acctFirstPlaybackDate = acctFirstPlaybackDate;
        this.acctLastPlaybackDate = acctLastPlaybackDate;
        this.acctFirstPlaybackDateForUseGeneratedPlays = acctFirstPlaybackDateForUseGeneratedPlays;
        this.acctLastPlaybackDateForUserGeneratedPlays = acctLastPlaybackDateForUserGeneratedPlays;
        this.profileFirstPlaybackDate = profileFirstPlaybackDate;
        this.profileLastPlaybackDate = profileLastPlaybackDate;
        this.profileFirstPlaybackDateForUserGeneratedPlays = profileFirstPlaybackDateForUserGeneratedPlays;
        this.profileLastPlaybackDateForUserGeneratedPlays = profileLastPlaybackDateForUserGeneratedPlays;
        this.deactivationTime = deactivationTime;
        this.iPAdressesAccountCreation = iPAdressesAccountCreation;
        this.gamePlaySession = gamePlaySession;
    }
}
