import model.Rover;

public class RoboticRover {

    private Rover rover = Rover.of();

    public void move(String command) {
        //RMMLM
        for(char commandChar: command.toCharArray()) {
            if(commandChar == 'L' || commandChar == 'R') {
                rover.setDirection(String.valueOf(commandChar));
            }
            if(commandChar == 'M') {
                rover.move();
            }
        }
    }

    public String getPosition() {
        return rover.getPosition();
    }
}
