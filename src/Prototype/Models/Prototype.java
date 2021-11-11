package Prototype.Models;

public interface Prototype {
    int code = 0;
    public Prototype clonePrototype() throws CloneNotSupportedException;
}
