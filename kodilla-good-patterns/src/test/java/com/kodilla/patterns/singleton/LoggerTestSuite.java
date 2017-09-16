package com.kodilla.patterns.singleton;

import com.kodilla.patterns.Logger;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    private static Logger logger;

//    @BeforeClass
//    public static void createLoggerObject() {
//        logger = new Logger();
//    }

    @Test
    public void testCreatingLogFile() {
        //Given
        //When
        String log = "This is new log file";
        logger.getInstance().log(log);
        //Then
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLog = logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("This is new log file", lastLog);
    }
}
