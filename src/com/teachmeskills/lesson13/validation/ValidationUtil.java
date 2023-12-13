package com.teachmeskills.lesson13.validation;

import com.teachmeskills.lesson13.exceptions.WrongLoginException;
import com.teachmeskills.lesson13.exceptions.WrongPasswordException;

public class ValidationUtil {
    public static boolean validateCredentials(String login, String password, String confirmPassword){
        try {
            validateLogin(login);
            validatePassword(password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    private static void validateLogin(String login) throws WrongLoginException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Wrong login format");
        }
    }

    private static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Wrong password format");
        }
    }

}
