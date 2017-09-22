package org.after90.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.stereotype.Repository;

/**
 * Created by zhaogj on 21/09/2017.
 */
@Repository
@Slf4j
public class ConfigRepository {
    @Value("${strHadoopConfPath}")
    private String strHadoopConfPath;

    public void initConfig() {

//        log.info("spring.config.location:{}", System.getProperty("spring.config.location"));
        log.info("strHadoopConfPath:{}", strHadoopConfPath);

    }
}
