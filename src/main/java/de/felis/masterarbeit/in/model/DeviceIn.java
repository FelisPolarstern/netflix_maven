package de.felis.masterarbeit.in.model;

import java.io.IOException;
import java.time.Instant;
import java.util.List;

public class DeviceIn {
    private final String profileName;
    private final String esn;
    private final String deviceType;
    private final Instant acctFirstPlaybackDate;
    private final Instant acctLastPlaybackDate;
    private final Instant acctFirstPlaybackDateForUseGeneratedPlays;
    private final Instant acctLastPlaybackDateForUserGeneratedPlays;
    private final Instant profileFirstPlaybackDate;
    private final Instant profileLastPlaybackDate;
    private final Instant profileFirstPlaybackDateForUserGeneratedPlays;
    private final Instant profileLastPlaybackDateForUserGeneratedPlays;
    private final Instant deactivationTime;

    public DeviceIn(String profileName, String esn, String deviceType, Instant acctFirstPlaybackDate,
                    Instant acctLastPlaybackDate, Instant acctFirstPlaybackDateForUseGeneratedPlays,
                    Instant acctLastPlaybackDateForUserGeneratedPlays, Instant profileFirstPlaybackDate,
                    Instant profileLastPlaybackDate, Instant profileFirstPlaybackDateForUserGeneratedPlays,
                    Instant profileLastPlaybackDateForUserGeneratedPlays, Instant deactivationTime) {
        this.profileName = profileName;
        this.esn = esn;
        this.deviceType = deviceType;
        this.acctFirstPlaybackDate = acctFirstPlaybackDate;
        this.acctLastPlaybackDate = acctLastPlaybackDate;
        this.acctFirstPlaybackDateForUseGeneratedPlays = acctFirstPlaybackDateForUseGeneratedPlays;
        this.acctLastPlaybackDateForUserGeneratedPlays = acctLastPlaybackDateForUserGeneratedPlays;
        this.profileFirstPlaybackDate = profileFirstPlaybackDate;
        this.profileLastPlaybackDate = profileLastPlaybackDate;
        this.profileFirstPlaybackDateForUserGeneratedPlays = profileFirstPlaybackDateForUserGeneratedPlays;
        this.profileLastPlaybackDateForUserGeneratedPlays = profileLastPlaybackDateForUserGeneratedPlays;
        this.deactivationTime = deactivationTime;
    }

    public void PrintDevicesExport (){
        System.out.println(this.profileName + this.esn + this.deviceType + this.acctFirstPlaybackDate + this.acctLastPlaybackDate);
    }

    /*
    public DeviceIn(List<String> DevicesImport) throws IOException{
        this.profileName = TypeTransformationHelper.toString(DevicesImport.get(0));
        this.esn = TypeTransformationHelper.toString(DevicesImport.get(1));
        this.deviceType =TypeTransformationHelper.toString(DevicesImport.get(2));
        this.acctFirstPlaybackDate = TypeTransformationHelper.toInstant(DevicesImport.get(3));
        this.acctLastPlaybackDate = TypeTransformationHelper.toInstant(DevicesImport.get(4));
        this.acct_first_playback_date_for_use_generated_plays = TypeTransformationHelper.toInstant(DevicesImport.get(5));
        this.acct_last_playback_date_for_user_generated_plays = TypeTransformationHelper.toInstant(DevicesImport.get(6));
        this.profile_first_playback_date = TypeTransformationHelper.toInstant(DevicesImport.get(7));
        this.profile_last_playback_date = TypeTransformationHelper.toInstant(DevicesImport.get(8));
        this.profile_first_playback_date_for_user_generated_plays = TypeTransformationHelper.toInstant(DevicesImport.get(9));
        this.profile_last_playback_date_for_user_generated_plays = TypeTransformationHelper.toInstant(DevicesImport.get(10));
        this.deactivation_time = TypeTransformationHelper.toInstant(DevicesImport.get(11));
    }
*/
}
