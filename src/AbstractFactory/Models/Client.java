package AbstractFactory.Models;

public class Client {
    public AbstractGardenCreator getGardenCreator() {
        return gardenCreator;
    }

    private AbstractGardenCreator gardenCreator;

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
