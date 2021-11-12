package Prototype.Models;

public class ConcretePrototype1 implements Prototype {

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    private int code;

    @Override
    public Prototype clonePrototype() {
        return this;
    }

}
