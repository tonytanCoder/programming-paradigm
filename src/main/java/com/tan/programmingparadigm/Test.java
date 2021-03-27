package com.tan.programmingparadigm;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        UserHeartEvent message = UserHeartEvent.builder().roomid(1500000457L).time(new Date()).timestamp(1611655669055L).userId(1000012422L).type(2)
                .build();
        String kafkaJson = JSON.toJSONString(message);
    }
}
