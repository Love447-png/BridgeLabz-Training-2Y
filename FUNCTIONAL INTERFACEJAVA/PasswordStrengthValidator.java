
// 1. Password Strength Validator
interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*");
    }
}

public class PasswordStrengthValidator {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.isStrongPassword("Hello123")); // true
    }
}
