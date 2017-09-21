package test.org.after90.repository;

import lombok.extern.slf4j.Slf4j;
import org.after90.Application;
import org.after90.repository.ConfigRepository;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Slf4j
public class ConfigRepositoryTest {
    @Autowired
    private ConfigRepository config;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: initConfig()
     */
    @Test
    public void testInitConfig() throws Exception {
        config.initConfig();
    }


} 
