import java.awt.Color;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class BouncingBall extends GraphicsProgram {
	// Main method for Stanford ACM Library.
	public void run() {
		// Creating circle and setting location.
		GOval ball = new GOval(250, 0, 100, 100);
		ball.setFilled(true);
		// Adding circle on canvas.
		add(ball);
		// Infinite Loop.
		while (true) {
			// Setting default color of the ball.
			ball.setColor(Color.black);
			// Adding animation effect and movement.
			while (ball.getY() < getHeight() - 100) {
				ball.move(0, 10);
				pause(25);
			}
			// Changing the color of the ball to green.
			ball.setColor(Color.green);
			// Changing the movement direction.
			while (ball.getY() != 0) {
				ball.move(0, -10);
				pause(25);
			}
		}
	}
}
