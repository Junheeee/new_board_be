package com.board.notice.user.model;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("userLoginRq")
public class UserLoginRq {
    private String loginId;
    private String loginPswd;
}
