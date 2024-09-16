package creational.prototype;

// Classmate note book design
public class Client {
    public static void main(String[] args) throws Exception {
        RegisterModel a4RegisterModel = new RegisterModel();
        a4RegisterModel.setBreadth(100);
        a4RegisterModel.setFacts("somefact");
        a4RegisterModel.setLength(150);
        a4RegisterModel.setPages(100);
        a4RegisterModel.setPrice(200);
        a4RegisterModel.setCoverType("random cover");

        RegisterModel a3RegisterModel = new RegisterModel();
        a3RegisterModel.setBreadth(100);
        a3RegisterModel.setFacts("somefact");
        a3RegisterModel.setLength(150);
        a3RegisterModel.setPages(100);
        a3RegisterModel.setPrice(200);
        a3RegisterModel.setCoverType("random cover");

        RegisterModel a5RegisterModel = new RegisterModel();
        a5RegisterModel.setBreadth(100);
        a5RegisterModel.setFacts("somefact");
        a5RegisterModel.setLength(150);
        a5RegisterModel.setPages(100);
        a5RegisterModel.setPrice(200);
        a5RegisterModel.setCoverType("random cover");

        RegisterFactory factory = new RegisterFactory();
        factory.addRegister(RegisterType.A3, a3RegisterModel);
        factory.addRegister(RegisterType.A4, a4RegisterModel);
        factory.addRegister(RegisterType.A5, a5RegisterModel);


        // by using one object which is created above, we are creating multiple objects
        // almost similar to actual object below
        for(int i=0;i<100;i++){
            RegisterModel a3model = (RegisterModel) factory.getRegister(RegisterType.A3).clone();
            a3model.setCoverType("some new cover "+i);
            a3model.setFacts("Randome fact with "+i);
        }
        for(int i=0;i<100;i++){
            RegisterModel a4model = (RegisterModel) factory.getRegister(RegisterType.A4).clone();
            a4model.setCoverType("some new cover "+i);
            a4model.setFacts("Randome fact with "+i);
        }
        for(int i=0;i<100;i++){
            RegisterModel a5model = (RegisterModel) factory.getRegister(RegisterType.A5).clone();
            a5model.setCoverType("some new cover "+i);
            a5model.setFacts("Randome fact with "+i);
        }
    }
}
