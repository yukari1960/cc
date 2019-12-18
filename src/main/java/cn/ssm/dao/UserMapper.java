package cn.ssm.dao;

import cn.ssm.pojo.replay;

public interface UserMapper {
    replay getLoginUser(String userCode);
}
