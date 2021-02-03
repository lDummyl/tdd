package users;

import java.util.List;
import java.util.stream.Collectors;

public class UserProvider {

	public UserProvider(UserDao userDAO) {
		this.userDAO = userDAO;
	}

	UserDao userDAO;

	List<UserDto> getOvichNames() {
		List<UserDto> userDtos = userDAO.gerAllUsers();
		return userDtos.stream()
				.filter(i -> i.name.contains("ovich")).collect(Collectors.toList());

	}

}
