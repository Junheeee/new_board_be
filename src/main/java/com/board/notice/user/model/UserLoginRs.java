package com.board.notice.user.model;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("userLoginRs")
public class UserLoginRs {
    private int cstmrSno;
    private String loginId;
    private String cstmrNm;
}
