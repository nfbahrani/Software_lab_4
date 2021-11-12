package Prototype.Models;

public class ConcretePrototype2 implements Prototype, java.lang.Cloneable {
    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    private int code;

    @Override
    public ConcretePrototype2 clonePrototype() throws CloneNotSupportedException {
        return (ConcretePrototype2) this.clone();
    }
}
