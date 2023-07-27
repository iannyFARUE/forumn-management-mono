package za.co.entelect;

import za.co.entelect.api.service.AuthenticationService;
import za.co.entelect.api.service.UserService;
import za.co.entelect.core.Authentication;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class Main {

    private final AuthenticationService authenticationService;
    private final UserService userService;
    private Authentication authentication;

    private final Logger logger = Logger.getLogger("Console");

    public Main(){
        authenticationService = new AuthenticationService();
        userService = new UserService();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        String input = "";
        System.out.println("*****************************WELCOME TO JAVA FORUM 2023******************************************");
        System.out.println("To get started signin >>>>>>>>>>>>>>>>>");


        while(true) {
            try{
                System.out.println("S - To Sign In");
                System.out.println("A - To Add User");
                System.out.println("L - To List all Users");
                System.out.println("D - Delete Users");
                System.out.println("E - To exit");
                input = scanner.nextLine();
                main.processInput(input);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

        }
    }

    private  void processInput(String input) {
        switch (input){
            case "S"->{
                authentication =  authenticationService.signin();
            }
            case "A"->{
                userService.addUser();
            }
            case "L"->{
                List<String> users = userService.getAllUsers();
                System.out.println("********** All Users*****************");
                listFormatedUsers(users);
            }

            case "D"->{
                userService.deleteUser();
            }

            case "E"-> {
                System.out.println(" ********* (: Goodbye :) **********");
                System.exit(0);
            }
            default -> System.out.println("Invalid input, Try again :)");

        }
    }


    private void listFormatedUsers(List<String> users){
        IntStream.range(0, users.size()).forEach(idx->{
            System.out.println((idx+1)+" : "+users.get(idx));
        });
    }
}