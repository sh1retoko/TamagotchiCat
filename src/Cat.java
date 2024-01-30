public class Cat implements StatsCat {
    protected String name;
    protected double weight;
    protected int age, hungry, playfulness;

    public Cat(String name, double weight, int age, int hungry, int playfulness) {
        this.name = name;
        this.weight = 3;
        this.age = 0;
        this.hungry = 100;
        this.playfulness = 80;
    }


    @Override
    public void age() {
        if (age % 20 == 0) {
            age++;
        }
    }

    @Override
    public void hungry() {
        hungry -= 10;

        if (hungry <= 0) {
            hungry = 0;
        }

        weight -= 0.1;
    }

    @Override
    public void play() {
        if (playfulness <= 0) {
            playfulness = 0;
        }

        playfulness -= 5;
    }
}
