package com.zohanubis.ecommerce_fashion_shop.service;

import com.zohanubis.ecommerce_fashion_shop.exception.UserException;
import com.zohanubis.ecommerce_fashion_shop.model.User;
import com.zohanubis.ecommerce_fashion_shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findUserById(Long userId) throws UserException {
        // Tìm kiếm người dùng theo ID trong cơ sở dữ liệu
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new UserException("User not found with ID: " + userId);
        }
    }

    @Override
    public User findUserProfileByJwt(String jwt) throws UserException {
        // Giải mã JWT để lấy thông tin người dùng, rồi tìm kiếm trong cơ sở dữ liệu
        String userEmail = decodeJwtToGetUserEmail(jwt);  // Đây là phương thức giả định để giải mã JWT
        Optional<User> user = userRepository.findByEmail(userEmail);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new UserException("User not found with JWT: " + jwt);
        }
    }

    private String decodeJwtToGetUserEmail(String jwt) {
        // Giả định phương thức giải mã JWT để lấy email người dùng
        // Trong thực tế, bạn sẽ cần sử dụng một thư viện JWT để giải mã và xác thực JWT
        // Ví dụ: sử dụng thư viện jjwt hoặc java-jwt
        return "decodedEmail@example.com";
    }
}
