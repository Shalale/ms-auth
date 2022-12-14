package com.example.msauth.mapper;


import com.example.msauth.model.jwt.AccessTokenClaimsSet;
import com.example.msauth.model.jwt.RefreshTokenClaimsSet;
import lombok.NoArgsConstructor;

import java.util.Date;

import static com.example.msauth.model.constant.AuthConstants.ISSUER;
import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class TokenBuilder {

    public static AccessTokenClaimsSet buildAccessTokenClaimsSet(String userId, Date expirationTime) {

        return AccessTokenClaimsSet.builder()
                .iss(ISSUER)
                .userId(userId)
                .createdTime(new Date())
                .expirationTime(expirationTime)
                .build();
    }

    public static RefreshTokenClaimsSet buildRefreshTokenClaimsSet(String userId, int refreshTokenExpirationCount, Date expirationTime) {

        return RefreshTokenClaimsSet.builder()
                .iss(ISSUER)
                .userId(userId)
                .expirationTime(expirationTime)
                .count(refreshTokenExpirationCount)
                .build();
    }
}
