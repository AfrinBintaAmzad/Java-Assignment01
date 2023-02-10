package JavaAssignment;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//6. Create a program which will take input from users for registration and save the info to a json file. The system will require following user info:
//   Full Name, email, password, address, mobile no.
public class UserRegistration {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String name, email, password, address, mobile;

        System.out.print("Enter your full name: ");
        name = sc.nextLine();

        System.out.print("Enter your email: ");
        email = sc.nextLine();

        System.out.print("Enter your password: ");
        password = sc.nextLine();

        System.out.print("Enter your address: ");
        address = sc.nextLine();

        System.out.print("Enter your mobile number: ");
        mobile = sc.nextLine();

        JSONObject jsonObject=new JSONObject();
        jsonObject.put("FullName",name);
        jsonObject.put("Email",email);
        jsonObject.put("Password",password);
        jsonObject.put("Address",address);
        jsonObject.put("Mobile",mobile);
        System.out.println(jsonObject);
        FileWriter file = new FileWriter("./src/main/resources/Employee.json");
        file.write(jsonObject.toJSONString());
        file.flush();
        file.close();
    }
}
