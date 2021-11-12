package Prototype.Models;

public class ConcretePrototype1 implements Prototype, java.lang.Cloneable {
    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    private int code;

    @Override
    public ConcretePrototype1 clonePrototype() throws CloneNotSupportedException {
        return (ConcretePrototype1) this.clone();
    }
}
