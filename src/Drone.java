package src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Drone {
	
	int droneX;
	int droneY;
	int id;
	DroneArena arena;
	static List<int[]> drones = new ArrayList<>(); // a 2d list, will take in other arrays, each representing a drone position.
	int[] nums = {8,2};
	private static int counter;
	Random numberGenerator = new Random();
	int randomNumberWidth = numberGenerator.nextInt(10);
	int randomNumberHeight = numberGenerator.nextInt(10);
	

	
	
	
	
	public Drone() {

		
		this.id = counter;
		counter++;
	}
	
	public String toString() {
		System.out.println("hello");
		String location = "Drone " + this.id + " is at " + this.droneX + ", " + this.droneY;
		return location;
	}

	
	
	void showIt(int h, int w, char drone) {
		
//		System.out.print(h);
		for(int j = 0; j < drones.size(); j++) {
			if((h == drones.get(j)[0]) && (w == drones.get(j)[1])) {
				System.out.print(drone);
//				this.x = w;
				return;
				
			}
			
		}
			System.out.print(" ");	
		}
		

	
}
