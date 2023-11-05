package com.board.notice.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.board.notice.user.model.UserJoinRq;

@Mapper
public interface UserMapper {
    int insertUserJoin(UserJoinRq rq);
    
}
