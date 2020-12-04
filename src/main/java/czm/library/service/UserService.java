package czm.library.service;

import czm.library.pojo.User;

import java.util.List;

public interface UserService {
    int addUser(User user);
    List<User> showUser();
    int deleteUser(Integer uid);
    int updateUser(User user);
    User getUserByUid(Integer uid);
    User getUserByOpenid(String openid);
    List<User> getUserByUname(String uname);
}
