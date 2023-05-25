package classes.de.felis.masterarbeit.out.model;

import java.time.LocalDateTime;

public class InteractiveTitleOut {
    private final int interactiveId;
    private final int profileId;
    private final int titleId;
    private final String selectionType;
    private final String choiceSegmentId;
    private final boolean hasWatched;
    private final String source;
    private final LocalDateTime utcTimestamp;

    public InteractiveTitleOut(int interactiveId, int profileId, int titleId, String selectionType,
                               String choiceSegmentId, boolean hasWatched, String source, LocalDateTime utcTimestamp) {
        this.interactiveId = interactiveId;
        this.profileId = profileId;
        this.titleId = titleId;
        this.selectionType = selectionType;
        this.choiceSegmentId = choiceSegmentId;
        this.hasWatched = hasWatched;
        this.source = source;
        this.utcTimestamp = utcTimestamp;
    }
}
