package creational.prototype;

public class Client {
    public static void main(String[] args) {
        RegisterModel registerModel = new RegisterModel();
        registerModel.setBreadth(100);
        registerModel.setFacts("somefact");
        registerModel.setLength(150);
        registerModel.setPages(100);
        registerModel.setPrice(200);
        registerModel.setCoverType("random cover");

        // by using one object which is created above, we are creating multiple objects
        // almost similar to actual object below
        for(int i=0;i<100;i++){
            RegisterModel model = (RegisterModel) registerModel.clone();
            model.setCoverType("some new cover "+i);
            model.setFacts("Randome fact with "+i);
        }
    }
}
