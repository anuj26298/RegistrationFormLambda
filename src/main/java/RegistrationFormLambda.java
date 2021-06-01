import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationFormLambda{
        IRegistrationFormLambda registrationFormLambdaFunction = (userInput, regex) -> {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(userInput);
            return matcher.matches();
        };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistrationFormLambda registrationFormLambda = new RegistrationFormLambda();

        String firstName, lastName, mobileNumber, email, password, regex;
        boolean result;
        do {
            System.out.println("Enter First Name: ");
            firstName = scanner.nextLine();
            regex = "^[A-Z][a-z]{3,16}";
            result = registrationFormLambda.registrationFormLambdaFunction
                    .validateInputAndRegex(firstName,regex);
            System.out.println(result);
        }while (!result);

        do {
            System.out.println("Enter Last Name: ");
            lastName = scanner.nextLine();
            regex = "^[A-Z][a-z]{3,16}";
            result = registrationFormLambda.registrationFormLambdaFunction
                    .validateInputAndRegex(lastName,regex);
            System.out.println(result);
        }while (!result);
        do {
            System.out.println("Enter Mobile Number: ");
            mobileNumber = scanner.nextLine();
            regex = "^[0-9]{2} [0-9]{10}";
            result = registrationFormLambda.registrationFormLambdaFunction
                    .validateInputAndRegex(mobileNumber,regex);
            System.out.println(result);
        }while (!result);

        do {
            System.out.println("Enter Email: ");
            email = scanner.nextLine();
            regex = "[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}";
            result = registrationFormLambda.registrationFormLambdaFunction
                    .validateInputAndRegex(email,regex);
            System.out.println(result);
        }while (!result);

        do {
            System.out.println("Enter Password: ");
            password = scanner.nextLine();
            regex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?" +
                    "[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
            result = registrationFormLambda.registrationFormLambdaFunction
                    .validateInputAndRegex(password,regex);
        }while (!result);

    }
}
