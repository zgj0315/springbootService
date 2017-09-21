package org.after90.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * Created by zhaogj on 21/09/2017.
 */
@Repository
@Slf4j
public class ConfigRepository {
    public void initConfig() {

        log.info("spring.config.location:{}", System.getProperty("spring.config.location"));
    }
}
