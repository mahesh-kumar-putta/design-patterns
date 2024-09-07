package creational.singleton;

public class Main {
    public static void main(String[] args) {
//        DBConnection dbConnection = new DBConnection();
//        DBConnection dbConnection2 = new DBConnection();
//
//        System.out.println(dbConnection.equals(dbConnection2));

        DBConnection dbConnection = DBConnection.getInstance();
        DBConnection dbConnection2 = DBConnection.getInstance();

        System.out.println(dbConnection.equals(dbConnection2));
    }
}
