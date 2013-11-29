package xuewenjian.minaserver.mapper;

import xuewenjian.minaserver.bean.User;

public interface UserMapper {

	public void insertUser(User user);
	
	public User getUser(String name);
}
