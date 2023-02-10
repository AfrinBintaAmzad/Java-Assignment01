package FileManipulation;
import java.util.Scanner;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJSON {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String name = scan.nextLine();

        System.out.println("Enter your email: ");
        String email = scan.nextLine();

        System.out.println("Enter your password: ");
        String password = scan.nextLine();

        System.out.println("Enter your address: ");
        String address = scan.nextLine();

        System.out.println("Enter your phone number: ");
        String phone = scan.nextLine();
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("FullName",name);
        jsonObject.put("Email",email);
        jsonObject.put("Password",password);
        jsonObject.put("Address",address);
        jsonObject.put("Phone",phone);
        System.out.println(jsonObject);
        FileWriter file = new FileWriter("./src/main/resources/Employee.json");
        file.write(jsonObject.toJSONString());
        file.flush();
        file.close();
    }
}
