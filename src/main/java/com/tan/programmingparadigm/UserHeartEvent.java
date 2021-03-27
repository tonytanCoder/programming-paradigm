package com.tan.programmingparadigm;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class UserHeartEvent {
    Long timestamp;
    Long roomid;
    Long userId;
    Long microNum;
    int type;
    String ext;
    Date time;
    boolean isOnMike;
}
