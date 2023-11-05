package com.board.notice.user.model;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("userJoinRq")
public class UserJoinRq {
    private String loginId;
    private String loginPswd;
    private String cstmrNm;
}
