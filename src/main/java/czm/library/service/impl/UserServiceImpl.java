package czm.library.service.impl;

import czm.library.mapper.UserMapper;
import czm.library.pojo.User;
import czm.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户管理业务层
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public int addUser(User user){
        return userMapper.insert(user);
    }

    @Override
    public List<User> showUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public User getUserByUid(Integer uid) {
        return userMapper.selectUserByUid(uid);
    }

    @Override
    public User getUserByOpenid(String openid) {
        return userMapper.selectUserByOpenid(openid);
    }

    @Override
    public List<User> getUserByUname(String uname) {
        return userMapper.selectUserByUname(uname);
    }

    @Override
    public int deleteUser(Integer uid) {
        return userMapper.deleteUserByUid(uid);
    }


    @Override
    public int updateUser(User user) {
        return userMapper.updateUserByUid(user);
    }
}
