package creational.singleton;

public class DBConnection2 {

    private DBConnection2(){

    }

    // why can't it be public
    // what happens if we keep final here
    // why can't we initialize the variable with the new object itself
    private static DBConnection2 instance = null;

    public static synchronized DBConnection2 getInstance(){
        if(instance == null){
            instance = new DBConnection2();
        }
        return instance;
    }

}
