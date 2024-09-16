package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class RegisterFactory {

    private Map<RegisterType, Clonable> map = new HashMap<>();

    public void addRegister(RegisterType type, Clonable clonable){
        this.map.put(type, clonable);
    }

    public Clonable getRegister(RegisterType type) throws Exception {
        if(this.map.get(type) == null){
            throw new Exception("No Register available");
        }
        return this.map.get(type);
    }
}
