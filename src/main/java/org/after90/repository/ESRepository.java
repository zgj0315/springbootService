package org.after90.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class ESRepository {
    public String strClient;

    public void initClient() {
        log.info("init client");
        strClient = "client is ok";
    }
}
