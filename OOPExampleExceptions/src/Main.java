import java.io.*;

public class Main {
    public static void main(String[] args) {
        String email = "abv@ab.bg";
        try {
            boolean isValid = validateEmail(email);
            System.out.println(email + " is a valid email address " + isValid);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean validateEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty!");
        }
        int index = email.indexOf('@');
        int indexPoint = email.lastIndexOf('.');
        if (index < 1 || indexPoint < index + 2 || indexPoint >= email.length()) {
            throw new IllegalArgumentException("Invalid email address: " + email);
        }
        return true;
    }

    public static void processedFile(String filePath) throws FileNotFoundException, IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found!" + filePath);
        } else if (!file.isFile()) {
            throw new IllegalArgumentException("File expected: " + filePath);
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                //TODO process each line
            }
        } catch (IOException e) {
            throw new IOException("Error while reading file: " + filePath, e);
        }
    }
}