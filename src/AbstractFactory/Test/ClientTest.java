package AbstractFactory.Test;

import AbstractFactory.Models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    Client client;
    JapaneseGardenCreator japaneseGardenCreator;
    IranianGardenCreator iranianGardenCreator;

    @BeforeEach
    void setUp() {
        this.client = new Client();
        this.japaneseGardenCreator = new JapaneseGardenCreator();
        this.iranianGardenCreator = new IranianGardenCreator();
    }

    @Test
    void contractWithGardenCreator() {
        client.contractWithGardenCreator(iranianGardenCreator);
        assertEquals(this.iranianGardenCreator, client.getGardenCreator());
    }

    @Test
    void getFlower() {
        client.contractWithGardenCreator(iranianGardenCreator);
        AbstractFlower flower = client.getFlower();
        assertTrue(flower instanceof Khatmi);
    }

    @Test
    void getTree() {
        client.contractWithGardenCreator(japaneseGardenCreator);
        AbstractTree tree = client.getTree();
        assertTrue(tree instanceof J1);
    }
}