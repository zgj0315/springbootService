package org.after90.component;

import lombok.extern.slf4j.Slf4j;
import org.after90.repository.ConfigRepository;
import org.after90.repository.ESRepository;
import org.after90.service.PrintMessageService;
import org.after90.utils.ParaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by zhaogj on 16/02/2017.
 */
@Component
@Slf4j
@Order(value = 1)
public class StartRunnerComponent implements CommandLineRunner {
    @Autowired
    private ESRepository es;
    @Autowired
    private PrintMessageService printMessage;
    @Autowired
    private ConfigRepository configRepository;

    @Override
    public void run(String... args) throws Exception {
        log.info("StartRunnerComponent is run");
        log.info("totalMemory:{}M", Runtime.getRuntime().totalMemory() / 1024 / 1024);
        //判断当前是否为单元测试，如果是单元测试，工程需要启动的线程可以不启动
        if (ParaUtil.isTesting) {
            log.info("This is a test.");
        } else {
            log.info("This is not a test.");
            es.initClient();
//            printMessage.doJob();
            configRepository.initConfig();
        }
    }
}
