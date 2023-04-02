package module3quest.entity;

public class User {
    private String name;
    private int lostGames;
    private int wonGames;

    public User(String name) {
        this.name = name;
        this.lostGames = 0;
        this.wonGames = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLostGames() {
        return lostGames;
    }

    public int getWonGames() {
        return wonGames;
    }

    public void gameIsWon() {
        this.wonGames += 1;
    }
    public void gameIsLost() {
        this.lostGames +=1;
    }
}
