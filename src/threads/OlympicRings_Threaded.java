package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.

	public static void main(String[] args) {
			Robot Jax = new Robot(400 , 700);
			Robot Jarvan = new Robot(800 , 700);
			Robot Irelia = new Robot(200 , 500);
			Robot Camille = new Robot (600 , 500);
			Robot Vladimir = new Robot (1000, 500);
			
			Jax.setSpeed(10);
			Jarvan.setSpeed(10);
			Irelia.setSpeed(10);
			Camille.setSpeed(10);
			Vladimir.setSpeed(10);
			
			Jax.setAngle(270);
			Jarvan.setAngle(270);
			Irelia.setAngle(270);
			Camille.setAngle(270);
			Vladimir.setAngle(270);
			
			Jax.setPenColor(Color.YELLOW);
			Jarvan.setPenColor(Color.GREEN);
			Irelia.setPenColor(Color.BLUE);
			Camille.setPenColor(Color.BLACK);
			Vladimir.setPenColor(Color.RED);
			
			Jax.penDown();
			Jarvan.penDown();
			Irelia.penDown();;
			Camille.penDown();
			Vladimir.penDown();
			
			new Thread(()->{for(int i = 0; i < 360; i++) {
				Jax.move(3);
				Jax.turn(1);
			}}).start();
			new Thread(()->{for(int i = 0; i < 360; i++) {
				Jarvan.move(3);
				Jarvan.turn(1);
			}}).start();
			new Thread(()->{for(int i = 0; i < 360; i++) {
				Irelia.move(3);
				Irelia.turn(1);
			}}).start();
			new Thread(()->{for(int i = 0; i < 360; i++) {
				Camille.move(3);
				Camille.turn(1);
			}}).start();
			new Thread(()->{for(int i = 0; i < 360; i++) {
				Vladimir.move(3);
				Vladimir.turn(1);
			}}).start();
			
	}
}


