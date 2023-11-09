package com.board.notice.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.board.notice.user.model.UserJoinRq;
import com.board.notice.user.model.UserLoginRq;
import com.board.notice.user.model.UserLoginRs;

@Mapper
public interface UserMapper {
    int insertUserJoin(UserJoinRq rq);
    
    UserLoginRs anyUserLogin(UserLoginRq rq);
}
