package command.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Robot {

    int xPosition;
    int yPosition;
    String direction;

    public Robot(int xPosition, int yPosition, String direction) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                ", direction='" + direction + '\'' +
                '}';
    }
}
