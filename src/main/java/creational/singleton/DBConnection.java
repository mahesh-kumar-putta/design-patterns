package creational.singleton;

public class DBConnection {

    private DBConnection(){

    }

    // why can't it be public
    // what happens if we keep final here
    // why can't we initialize the variable with the new object itself
    private static DBConnection instance = null;

    public static DBConnection getInstance(){
        if(instance == null){
            instance = new DBConnection();
        }
        return instance;
    }

}
