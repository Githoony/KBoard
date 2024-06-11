package com.lec.spring.config.oauth.provider;

import java.util.Map;

public class FacebookUserInfo implements OAuth2UserInfo {
    // ↓ loadUser() 로 받아온 OAuth2User.getAttributes() 결과를 담을거다
    private final Map<String, Object> attributes;

    public FacebookUserInfo(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String getProvider() {
        return "facebook";
    }

    @Override
    public String getProviderId() {
        return (String) attributes.get("id");
    }

    @Override
    public String getEmail() {
        return (String) attributes.get("email");
    }

    @Override
    public String getName() {
        return (String) attributes.get("name");
    }
}
