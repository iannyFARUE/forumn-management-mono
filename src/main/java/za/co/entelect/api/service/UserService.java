package za.co.entelect.api.service;

import za.co.entelect.persistence.model.User;
import za.co.entelect.persistence.repository.UserRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class UserService {

    private final UserRepository userRepository;

    private final Scanner scanner;
    public UserService(){
        userRepository = new UserRepository();
        scanner = new Scanner(System.in);
    }

    public void addUser(){
        System.out.println("Enter email");
        String email = scanner.nextLine();

        System.out.println("Enter password");
        String password = scanner.nextLine();
        User user = new User(email,password, LocalDate.now());
        userRepository.save(user);
        System.out.println("Added user successfully*****");
    }

    public List<String> getAllUsers(){
        System.out.println("Listing all users ---->>");
        return userRepository.findAllParticipants().stream().map(User::getEmail).toList();
    }

    public void deleteUser(){
        System.out.println("Enter email of user....");
        String email = scanner.nextLine();
        userRepository.delete(email);
    }
}