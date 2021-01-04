package principal;

public class Player implements Playable {

    private int health;
    private int pointsMathRush;
    private int oneVone;
    private int Training;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return pointsMathRush;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void setPoints(int pts) {
        this.pointsMathRush = pts;
    }

    public int getOneVone() {
        return oneVone;
    }

    public void setOneVone(int oneVone) {
        this.oneVone = oneVone;
    }

    public int getTraining() {
        return Training;
    }

    public void setTraining(int training) {
        Training = training;
    }

}
