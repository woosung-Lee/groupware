package me.ws.groupware.domain;

public enum MemberRole {

    ADMIN(1), User(2), GUEST(3);

    private final int value;

    MemberRole(int value) {
        this.value = value;
    }


}
