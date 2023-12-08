package org.howard.edu.lsp.exam.problem51;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class TestLogger {

    @Test
    public void testDisplayLog() {
        Logger logger = Logger.getInstance();
        logger.logMessage("Test Message");
        assertEquals("Log:\nTest Message\n", logger.displayLog());
    }

    @Test
    public void testLoggerInstances() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        assertSame(logger1, logger2);
    }

    @Test
    public void testMultipleLogMessages() {
        Logger logger = Logger.getInstance();
        logger.logMessage("Message1:");
        logger.logMessage("Message 2:");
        
        // Get the log after logging messages
        String log = logger.displayLog();
        
        // Assertion 1: Check if Message1 is logged
        assertEquals(true, log.contains("Message1:"));
        
        // Assertion 2: Check if Message 2 is logged after Message1
        assertEquals(true, log.contains("Message 2:"));
    }

}


