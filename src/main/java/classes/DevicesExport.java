package classes;

import de.felis.masterarbeit.in.reader.ImportHelper;

import java.io.IOException;
import java.time.Instant;
import java.util.List;

public class DevicesExport {
    private final int profile_id;
    private final int device_id;
    private final String esn;
    private final String device_type;
    private final Instant acct_first_playback_date;
    private Instant acct_last_playback_date;
    private final Instant acct_first_playback_date_for_use_generated_plays;
    private final Instant acct_last_playback_date_for_user_generated_plays;
    private final Instant profile_first_playback_date ;
    private final Instant profile_last_playback_date;
    private final Instant profile_first_playback_date_for_user_generated_plays;
    private final Instant profile_last_playback_date_for_user_generated_plays;
    private final Instant deactivation_time ;

    public DevicesExport(String path) throws IOException{
        List<String> DevicesImport = ImportHelper.readFileOld(path, 15);
        this.profile_id = Integer.valueOf(DevicesImport.get(0));
        this.device_id = Integer.valueOf(DevicesImport.get(1));
        this.esn = DevicesImport.get(2);
        this.device_type=DevicesImport.get(3);
        this.acct_first_playback_date = Instant.parse(DevicesImport.get(4));
        this.acct_last_playback_date = Instant.parse (DevicesImport.get(5));
        this.acct_last_playback_date = Instant.parse (DevicesImport.get(6));
        this.acct_first_playback_date_for_use_generated_plays = Instant.parse(DevicesImport.get(7));
        this.acct_last_playback_date_for_user_generated_plays = Instant.parse(DevicesImport.get(8));
        this.profile_first_playback_date = Instant.parse(DevicesImport.get(9));
        this.profile_last_playback_date = Instant.parse(DevicesImport.get(10));
        this.profile_first_playback_date_for_user_generated_plays = Instant.parse (DevicesImport.get(11));
        this.profile_last_playback_date_for_user_generated_plays = Instant.parse(DevicesImport.get(12));
        this.deactivation_time = Instant.parse(DevicesImport.get(13));
    }
}
