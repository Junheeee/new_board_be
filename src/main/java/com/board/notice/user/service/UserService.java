package com.board.notice.user.service;

import org.springframework.stereotype.Service;

import com.board.notice.user.mapper.UserMapper;
import com.board.notice.user.model.UserJoinRq;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    public int insertUserJoin(UserJoinRq rq) {
        return userMapper.insertUserJoin(rq);
    }
}
