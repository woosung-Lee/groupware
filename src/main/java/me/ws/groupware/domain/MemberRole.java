package me.ws.groupware.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.ws.groupware.config.enums.EnumMapperType;

@RequiredArgsConstructor
public enum MemberRole implements EnumMapperType {

    ADMIN("관리자"),
    USER("사용자"),
    GUEST("게스트");


    @Getter
    private final String name;

    @Override
    public String getCode() {
        return name();
    }

}
