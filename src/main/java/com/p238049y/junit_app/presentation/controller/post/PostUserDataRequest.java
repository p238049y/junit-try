package com.p238049y.junit_app.presentation.controller.post;

import jakarta.annotation.Nullable;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigInteger;
import java.util.Objects;

@AllArgsConstructor
@Getter
public class PostUserDataRequest {
    private BigInteger id;

    private String name;

    @Nullable
    private String phoneNumber;

    @Nullable
    private String mailAddress;

    public boolean hasEitherPhoneNumberOrMailAddressNew() {
        if (Objects.isNull(this.phoneNumber) && Objects.isNull(this.mailAddress)) {
            return false;
        } else if (Objects.isNull(this.phoneNumber)) {
            return true;
        } else {
            return Objects.isNull(this.mailAddress);
        }
    }

    public boolean hasEitherPhoneNumberOrMailAddressOld() {
        return Objects.isNull(this.phoneNumber) ^ Objects.isNull(this.mailAddress);
    }
}
