package Game;

public enum Platforms {
    WINDOWS("Windows"), LINUX("Linux"), MacOS("MacOS");

    private String name;

    Platforms(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
