package COM.BRIDGELABZ;
import java.sql.*;

public class RetrievingContactsOfPersons {

    public static void main(String[] args) throws SQLException {

            String jdbcUrl = "jdbc:mysql://localhost:3306/addressbookservice";
            String userName = "root";
            String password = "sri@1234";
            String query = "select * from addressbookforfriends";
            Connection connection;

            try {
                connection = DriverManager.getConnection(jdbcUrl, userName, password);
                PreparedStatement statement = connection.prepareStatement(query);
                ResultSet result = statement.executeQuery();
                System.out.println("contacts of persons : ");
                while (result.next()) {
                    String name = result.getString("phone");
                    System.out.print(name + " \n");
                }
            } catch (SQLException exec) {
                exec.printStackTrace();
            }
        }
    }
