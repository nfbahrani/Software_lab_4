package Prototype.Test;

import Prototype.Models.Client;
import Prototype.Models.ConcretePrototype1;
import Prototype.Models.ConcretePrototype2;
import Prototype.Models.Prototype;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    Client client;
    Prototype prototype;

    @BeforeEach
    void setUp() {
        client = new Client();
    }

    @Test
    void createPrototype() {
        client.createPrototype(1);
        this.prototype = client.getPrototype();
        assertTrue(this.prototype instanceof ConcretePrototype1);
        client.createPrototype(2);
        this.prototype = client.getPrototype();
        assertTrue(this.prototype instanceof ConcretePrototype2);
    }

    @Test
    void clonePrototype() {
        client.createPrototype(2);
        this.prototype = client.clone();
        assertTrue(this.prototype instanceof ConcretePrototype2);
    }
}