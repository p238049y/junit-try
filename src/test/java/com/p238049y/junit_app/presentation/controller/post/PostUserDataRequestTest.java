package com.p238049y.junit_app.presentation.controller.post;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class PostUserDataRequestTest {
    private static final BigInteger ID = BigInteger.ONE;
    private static final String NAME = "パイロットユーザー";
    private static final String PHONE_NUMBER = "090-1234-5678";
    private static final String MAIL_ADDRESS = "A@example.com";

    @Nested
    @DisplayName("PhoneNumberとMailAddressのどちらか一方の値がnullであればtrueを返すかを判定するhasEitherPhoneNumberOrMailAddressOldのテスト")
    class HasEitherPhoneNumberOrMailAddressOld {
        @Test
        void PhoneNumberのみnullの場合trueを返すこと () {
            var request = new PostUserDataRequest(
                    ID,
                    NAME,
                    null,
                    MAIL_ADDRESS
            );

            Assertions.assertTrue(request.hasEitherPhoneNumberOrMailAddressOld());
        }

        @Test
        void MailAddressのみnullの場合trueを返すこと() {
            var request = new PostUserDataRequest(
                    ID,
                    NAME,
                    PHONE_NUMBER,
                    null
            );

            Assertions.assertTrue(request.hasEitherPhoneNumberOrMailAddressOld());
        }

        @Test
        void MailAddressとPhoneNumberの両方の値がnullの場合falseを返すこと() {
            var request = new PostUserDataRequest(
                    ID,
                    NAME,
                    null,
                    null
            );

            Assertions.assertFalse(request.hasEitherPhoneNumberOrMailAddressOld());
        }

        @Test
        void MailAddressとPhoneNumberの両方の値が存在する場合falseを返すこと() {
            var request = new PostUserDataRequest(
                    ID,
                    NAME,
                    PHONE_NUMBER,
                    MAIL_ADDRESS
            );

            Assertions.assertFalse(request.hasEitherPhoneNumberOrMailAddressOld());
        }
    }

    @Nested
    @DisplayName("PhoneNumberとMailAddressのどちらか一方の値がnullであればtrueを返すかを判定するhasEitherPhoneNumberOrMailAddressNewのテスト")
    class HasEitherPhoneNumberOrMailAddressNew {
        @Test
        void PhoneNumberのみnullの場合trueを返すこと () {
            var request = new PostUserDataRequest(
                    ID,
                    NAME,
                    null,
                    MAIL_ADDRESS
            );

            Assertions.assertTrue(request.hasEitherPhoneNumberOrMailAddressNew());
        }

        @Test
        void MailAddressのみnullの場合trueを返すこと() {
            var request = new PostUserDataRequest(
                    ID,
                    NAME,
                    PHONE_NUMBER,
                    null
            );

            Assertions.assertTrue(request.hasEitherPhoneNumberOrMailAddressNew());
        }

        @Test
        void MailAddressとPhoneNumberの両方の値がnullの場合falseを返すこと() {
            var request = new PostUserDataRequest(
                    ID,
                    NAME,
                    null,
                    null
            );

            Assertions.assertFalse(request.hasEitherPhoneNumberOrMailAddressNew());
        }

        @Test
        void MailAddressとPhoneNumberの両方の値が存在する場合falseを返すこと() {
            var request = new PostUserDataRequest(
                    ID,
                    NAME,
                    PHONE_NUMBER,
                    MAIL_ADDRESS
            );

            Assertions.assertFalse(request.hasEitherPhoneNumberOrMailAddressNew());
        }
    }
}
