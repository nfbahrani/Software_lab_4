package AbstractFactory.Models;

public class Client {
    AbstractGardenCreator gardenCreator;
    public void contractWithGardenCreator(AbstractGardenCreator gardenCreator) {
        this.gardenCreator = gardenCreator;
    }

    public AbstractFlower getFlower() {
        return this.gardenCreator.createFlower();
    }

    public AbstractTree getTree() {
        return this.gardenCreator.createTree();
    }
}
