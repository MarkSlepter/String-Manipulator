package task1;

import task1.validation.ValidationUtil;

public class Runner {
    public static void main(String[] args) {
        String login = "user123";
        String password = "SecurePass123";
        String confirmPassword = "SecurePass123";

        if (ValidationUtil.validateCredentials(login, password, confirmPassword)) {
            System.out.println("Credentials are valid");
        } else {
            System.out.println("Credentials are invalid");
        }
    }
}
