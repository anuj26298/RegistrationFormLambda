@FunctionalInterface
public interface IRegistrationFormLambda {
    boolean validateInputAndRegex(String userInput, String regex);
}
