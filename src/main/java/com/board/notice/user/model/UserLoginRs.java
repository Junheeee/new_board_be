package com.board.notice.user.model;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("userLoginRs")
public class UserLoginRs {
    private String loginId;
    private String cstmrNm;
}
