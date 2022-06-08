package me.ws.groupware.domain;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.ws.groupware.config.enums.EnumMapperType;

@RequiredArgsConstructor
public enum MemberStatus implements EnumMapperType {
    REGCOMP("가입완료"),
    APPROVEDCOMP("승인완료");

    @Getter
    private final String name;

    @Override
    public String getCode() {
        return name();
    }

}
