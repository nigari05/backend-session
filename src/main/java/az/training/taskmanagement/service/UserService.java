package az.training.taskmanagement.service;

import az.training.taskmanagement.dto.CreateUserRequest;
import az.training.taskmanagement.dto.UserResponse;
import az.training.taskmanagement.model.User;

import java.util.List;
import java.util.Optional;

/**
 * User business logic kontraktı.
 * Service DTO qəbul edir və DTO qaytarır - domain model xaricə "sızmır".
 */
public interface UserService {

    UserResponse createUser(CreateUserRequest request);

    UserResponse getUserById(Long id);

    List<User> getUserByName(String name);

    List<UserResponse> getAllUsers();
    void deleteUser(Long id);
}
