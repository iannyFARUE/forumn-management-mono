package za.co.entelect.persistence.repository;

import za.co.entelect.persistence.exception.BusinessException;
import za.co.entelect.persistence.model.User;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository implements CrudRepository<User>{
    private final List<User> users = new ArrayList<>();

    public UserRepository(){

        users.addAll(List.of(
                new User("ian.madhara@standardbank.co.za", "farai123", LocalDate.of(1995, Month.AUGUST, 26)),
                new User("rennete.rose@standardbank.co.za","rose234",LocalDate.of(1993, Month.APRIL, 26)),
                new User("nico.kiewiet@standardbank.co.za","nico23",LocalDate.of(1989, Month.JANUARY, 26)),
                new User("emile.rose@standardbank.co.za","emile34",LocalDate.of(1995, Month.DECEMBER, 26))
        ));
    }

    @Override
    public User save(User user) {
        if(user == null) throw new BusinessException("User cannot be null");
        users.add(user);
        System.out.println("Users are now "+users);
        return user;
    }

    @Override
    public void delete(String email) {
        if(email == null) throw new BusinessException("Email cannot be null");
        User user = findByEmail(email).orElseThrow(()->new BusinessException("No User found"));
        users.remove(user);
        System.out.println("Removed user ********");
        System.out.println(user);
    }

    @Override
    public Optional<User> findByEmail(String username) {
        return users.stream().filter(user -> user.getEmail().equals(username)).findFirst();
    }

    @Override
    public List<User> findAllParticipants() {
        return users;
    }
}
