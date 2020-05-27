package lesson15.big01.statistic.event;

import java.util.Date;

public interface EventDataRow {
    public EventType getType();
    public Date getDate();
    int getTime();
}
