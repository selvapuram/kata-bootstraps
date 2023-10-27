package model;

public enum Direction {
    NORTH("WEST", "EAST"),
    WEST("SOUTH", "NORTH"),
    SOUTH("EAST", "WEST"),
    EAST("NORTH", "SOUTH");

    public String getLeft() {
        return left;
    }

    public String getRight() {
        return right;
    }


    private String left;
    private String right;

    Direction(String left, String right) {
        this.left = left;
        this.right = right;
    }

}
