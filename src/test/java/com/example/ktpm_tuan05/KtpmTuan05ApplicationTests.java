package com.example.ktpm_tuan05;

import com.example.ktpm_tuan05.activeMQ.Producer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KtpmTuan05ApplicationTests {
    @Autowired
    private Producer producer;
    @Test
    void contextLoads() {
        producer.sendMessage("inbound.queue","Con lon nay");
    }

}
