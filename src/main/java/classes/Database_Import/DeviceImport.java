package classes.Database_Import;

import java.io.IOException;
import java.time.Instant;
import java.util.List;

public class DeviceImport {
    private String profile_name;
    private String esn;
    private String device_type;
    private Instant acct_first_playback_date;
    private Instant acct_last_playback_date;
    private Instant acct_first_playback_date_for_use_generated_plays;
    private Instant acct_last_playback_date_for_user_generated_plays;
    private Instant profile_first_playback_date ;
    private Instant profile_last_playback_date;
    private Instant profile_first_playback_date_for_user_generated_plays;
    private Instant profile_last_playback_date_for_user_generated_plays;
    private Instant deactivation_time;

    public DeviceImport(String path) throws IOException{
        List<String> DevicesImport = ImporterHelperClass.ImportHelper(path, 13);
        this.profile_name = TypeTransformationHelper.toString(DevicesImport.get(0));
        this.esn = TypeTransformationHelper.toString(DevicesImport.get(1));
        this.device_type=TypeTransformationHelper.toString(DevicesImport.get(2));
        this.acct_first_playback_date = TypeTransformationHelper.toInstant(DevicesImport.get(3));
        this.acct_last_playback_date = TypeTransformationHelper.toInstant(DevicesImport.get(4));;
        this.acct_first_playback_date_for_use_generated_plays = TypeTransformationHelper.toInstant(DevicesImport.get(5));
        this.acct_last_playback_date_for_user_generated_plays = TypeTransformationHelper.toInstant(DevicesImport.get(6));
        this.profile_first_playback_date = TypeTransformationHelper.toInstant(DevicesImport.get(7));
        this.profile_last_playback_date = TypeTransformationHelper.toInstant(DevicesImport.get(8));
        this.profile_first_playback_date_for_user_generated_plays = TypeTransformationHelper.toInstant(DevicesImport.get(9));
        this.profile_last_playback_date_for_user_generated_plays = TypeTransformationHelper.toInstant(DevicesImport.get(10));
        this.deactivation_time = TypeTransformationHelper.toInstant(DevicesImport.get(11));
    }
    public void PrintDevicesExport (){
        System.out.println(this.profile_name + this.esn + this.device_type + this.acct_first_playback_date + this.acct_last_playback_date);

    }
}
