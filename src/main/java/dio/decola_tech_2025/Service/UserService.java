package dio.decola_tech_2025.Service;

import dio.decola_tech_2025.Model.User;

public interface UserService {
    User findById(Long id);

    User create(User user);
}
