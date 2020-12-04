package czm.library.mapper;

import czm.library.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> selectAllUser();

    int insert(User user);

    User selectUserByUid(Integer uid);

    int updateUserByUid(User user);

    int deleteUserByUid(Integer uid);

    List<User> selectUserByUname(String uname);

    User selectUserByOpenid(String openid);
}