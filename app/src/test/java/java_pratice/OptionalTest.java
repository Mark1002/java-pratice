package java_pratice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OptionalTest {
    
    private static final Logger logger = LogManager.getLogger(OptionalTest.class.getName());

    @Test
    public void whenCreateEmptyOptionalThenNull() {
        Exception exception = assertThrows(NoSuchElementException.class, () -> {
            Optional<String> emptyOpt = Optional.empty();
            emptyOpt.get();
        });
        logger.debug(exception.getMessage());
    }
    
    @Test
    public void whenCreateEmptyOptionalThenOk() {
        String name = "Mark";
        Optional<String> opt = Optional.ofNullable(name);
        assertTrue(opt.isPresent());
        assertEquals("Mark", opt.get());
    }
}
