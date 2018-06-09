package com.rb.oauth.service.impl;

import com.rb.oauth.service.OauthService;
import org.springframework.stereotype.Service;

/**
 * @author xujiping
 * @date 2018/6/8 17:02
 */
@Service
public class OauthServiceImpl implements OauthService {
    @Override
    public void addAuthCode(String authCode, String username) {

    }

    @Override
    public void addAccessToken(String accessToken, String username) {

    }

    @Override
    public boolean checkAuthCode(String authCode) {
        return true;
    }

    @Override
    public boolean checkAccessToken(String accessToken) {
        return false;
    }

    @Override
    public String getUsernameByAuthCode(String authCode) {
        return "9a71ee7b99189d32ca2c8311ac8a78b9";
    }

    @Override
    public String getUsernameByAccessToken(String accessToken) {
        return null;
    }

    @Override
    public long getExpireIn() {
        return 360000;
    }

    @Override
    public boolean checkClientId(String clientId) {
        return true;
    }

    @Override
    public boolean checkClientSecret(String clientSecret) {
        return true;
    }
}
