package dio.decola_tech_2025.Service.imp;

import dio.decola_tech_2025.Model.User;
import dio.decola_tech_2025.Repository.UserRepository;
import dio.decola_tech_2025.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account number already exist");
        }

        return userRepository.save(userToCreate);
    }
}
