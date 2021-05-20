package com.Junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidateUserTest {
    // Test method to validate FirstName True Case
    @Test
    void givenFirstName_WhenProper_ShouldReturnTrue() {
        ValidateUser validator = new ValidateUser();
        boolean result = ValidateUser.validateFirstName("Shailendra");
        Assertions.assertEquals(true, result);
    }
}
