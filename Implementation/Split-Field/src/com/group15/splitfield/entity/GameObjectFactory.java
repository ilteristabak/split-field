package com.group15.splitfield.entity;

public class GameObjectFactory {

	public GameObjectFactory(){
		
	}
	public GameObject getGameObject(int number ,int positionX, int positionY){
		if(number == 0){
			return new MajorEnemy1(positionX, positionY, "Major Enemy 1");
		}
		else if(number == 1){
			return new MajorEnemy2(positionX, positionY, "Major Enemy 2");
		}
		else if(number == 2){
			return new MinorEnemy1(positionX, positionY, "Minor Enemy 1");
		}
		else if(number == 3){
			return new MinorEnemy2(positionX, positionY, "Minor Enemy 2");
		}
		else if(number == 4){
			return new Speed(positionX, positionY, "Power Up-Speed");
		}
		else if(number == 5){
			return new Laser(positionX, positionY, "Power Up-Laser");
		}
		else if(number == 6){
			return new PauseShieldDecrement(positionX, positionY, "Power Up-Pause Shield Decrement");
		}
		else if(number == 7){
			return new ClearMinors(positionX, positionY, "Power Up-Clear Minors");
		}
		else 
			return new LineRider(positionX, positionY);
	}
}
