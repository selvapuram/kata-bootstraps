import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Rover
1. A robotic rover is to be landed by Hellofresh on a street in Berlin
2. The rover’s position on the street is represented by a combination of X and Y coordinates in a grid
3. The coordinates 0,0 means the rover is positioned at the bottom left of the grid
4. The rover also has the direction he is pointing to, which is represented by one of the four cardinal compass points: N,S,E,W
5. When a rover lands on the plateau, his initial starting point is always: 0,0,N
6. In order to control a rover, Hellofresh sends a simple string of letters, which are called commands
7. The possible commands are ‘L’, ‘R’, and ‘M’
8. ‘L’ and ‘R’ makes the rover spin 90 degrees left or right, respectively, without moving from its current spot
9. ‘M’ moves the rover one point in the current direction

Example:

The rover receives the following commands “RMMLM” and returns the finishing point after the moves: “2:1:N” (N means facing North).

Initial position: "0:0:N"

|---|---|---|
|   |   |   |
|---|---|---|
|   |   |   |
|---|---|---|
| N |   |   |
|---|---|---|

After sending the commands RMMLM: "2:1:N"

|---|---|---|
|   |   |   |
|---|---|---|
|   |   | N |
|---|---|---|
|   |   |   |
|---|---|---|
 */
public class RoboticRoverTest {

    private RoboticRover rover = new RoboticRover();

    @Test
    public void shouldRoverPositionBe21NGivenCommandRMMMLM() {
        String command = "RMMLM";
        String expectedPosition = "2:1:N";
        rover.move(command);
        String actualPosition = rover.getPosition();
        Assertions.assertThat(actualPosition).isEqualTo(expectedPosition);
    }
}
