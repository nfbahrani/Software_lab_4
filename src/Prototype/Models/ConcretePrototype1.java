package Prototype.Models;

public class ConcretePrototype1 implements Prototype{

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    private int code;

    public ConcretePrototype1(int code) {
        this.code = code;
    }

    @Override
    public Prototype clonePrototype() {
        return this;
    }
//    @Override
//    public Prototype clonePrototype() throws CloneNotSupportedException {
//        return (ConcretePrototype2) this.clone();

//    }
}
