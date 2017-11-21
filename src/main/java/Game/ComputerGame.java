package Game;

public class ComputerGame {
    int counter = 0;
    private final int id;
    private final ComputerGameParams params;

    public ComputerGame(ComputerGameParams params){
        this.id = counter++;
        this.params = params;

    }

    public int getId() {
        return id;
    }

    public ComputerGameParams getParams() {
        return params;
    }
}
