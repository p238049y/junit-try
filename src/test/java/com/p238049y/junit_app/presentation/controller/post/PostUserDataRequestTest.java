package com.p238049y.junit_app.presentation.controller.post;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class PostUserDataRequestTest {

    @Nested
    @DisplayName("ハッピーテスト")
    class HappyTest {

        @Test
        void _１と１をを足すと２になること () {
            var actual = 1+1;
            var expect = 2;

            Assertions.assertEquals(actual, expect);
        }
    }
}
