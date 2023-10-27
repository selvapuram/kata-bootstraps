package model;

import command.Command;

public class Rover {
    int x;

    int y;
    Direction direction;
    private static final Rover rover = new Rover(0,0);
    private Rover() {
        // use factory method
    }

    private Rover(int x, int y) {
        this.x = x;
        this.y = y;
        this.direction = Direction.NORTH;
    }

    public static Rover of() {
        //"0:0:N"
        return rover;
    }


    public void move() {
        if(this.direction == Direction.NORTH) {
            this.y += 1;
        } else if(this.direction == Direction.SOUTH) {
            this.y -= 1;
        } else if(this.direction == Direction.EAST) {
            this.x +=1;
        } else if(this.direction == Direction.WEST) {
            this.x -=1;
        }

        if(this.x < 0) {
            this.x = 0;
        }

        if(this.y < 0) {
            this.y = 0;
        }
    }


    public Direction getDirection() {
        return direction;
    }

    public void setDirection(String command) {
        if(Command.LEFT.toString().charAt(0) == command.charAt(0)) {
            this.direction = Direction.valueOf(direction.getLeft());
        }
        if(Command.RIGHT.toString().charAt(0) == command.charAt(0)) {
            this.direction = Direction.valueOf(direction.getRight());
        }
    }

    public String getPosition() {
        return this.x + ":" + this.y + ":" + this.getDirection().toString().charAt(0);
    }

}
