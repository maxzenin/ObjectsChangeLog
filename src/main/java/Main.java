import models.Users;
import models.Records;
import models.ObjectElements;
//import services.UserService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        models.Users users = new Users();
        models.Records records = new Records();
        System.out.println("Hello world");



        System.out.println(users.getId());
    }
}