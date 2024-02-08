# Task 1
Create a class that will have a static method.
This method takes three parameters as input:Login&Password&confirmPassword. All fields are of String data type.login must be less than 20 characters long and must not contain spaces.
If login does not meet these requirements, a WrongLoginException must be thrown. Password must be less than 20 characters long, must not contain spaces, and must contain at least one number. Also password and confirmPassword must be equal. If the password does not meet these requirements, a WrongPasswordException must be thrown. Exception classes WrongPasswordException and WrongLoginException are custom exception classes with two constructors - one default, second accepts the exception message and passes it to the constructor of the Exception class.
The method returns true if the values are valid or false otherwise. Place classes in packages: the class for checking values should be in its own separate package, the classes for exceptions should be in their own. Create a Runner class to test this class.
Try to solve the problem in two ways:
1. methods of the String class "out of the box", for example the contains method
2. split the string into an array of chars (string toCharArray()) and traverse and check the array
