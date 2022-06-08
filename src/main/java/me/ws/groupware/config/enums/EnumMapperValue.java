package me.ws.groupware.config.enums;

import lombok.Getter;

@Getter
public class EnumMapperValue {
    private String code;
    private String name;

    public EnumMapperValue(EnumMapperType enumMapperType) {
        code = enumMapperType.getCode();
        name = enumMapperType.getName();
    }

}