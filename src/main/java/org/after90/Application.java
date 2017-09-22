
package org.after90;

import lombok.extern.slf4j.Slf4j;
import org.after90.utils.ParaUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Application {

    public static void main(String[] args) {
        log.info("run application");
        ParaUtil.isTesting = false;//当进行单元测试时，不走这个方法，所以用这个标志来识别当前是否正在单元测试
        SpringApplication.run(Application.class);
        log.info("application running");
    }

}
