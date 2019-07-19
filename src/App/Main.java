package App;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");
        int i = 1;

        HashMap<String, String> map = new HashMap<>();
        map.put("Paul", "java");
        map.put("Andrei", "linux");
        map.put("Ion", "work");

        do {
            System.out.print("Username: ");
            Read read = new Read();
            String user = read.getString();
            System.out.print("Password: ");
            String pass = read.getString();
            i++;
            try {
                if (map.get(user).equals(pass)) {
                    System.out.println("Login successful.");
                    Run run = new Run();
                    run.runTheProgram();
                    return;
                } else {
                    System.out.println("Wrong password!");
                }
            } catch (NullPointerException err) {
                System.out.println("Wrong username!");
            }
        } while (i <= 3);
        System.out.println("Login failed! Bye Bye!");
    }
}
