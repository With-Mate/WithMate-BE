package com.gdscewha.withmate.auth.login;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserResource {
    String id;
    String userName;
    String nickname;
    String email;
}