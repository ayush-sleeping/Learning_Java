package Abstraction;

//Abstraction: Remote Control
// RemoteControl interface acts as an abstraction that defines the common methods for controlling electronic devices.
interface RemoteControl {
	void powerOn();
	void powerOff();
	void volumeUp();
	void volumeDown();
	}



//Concrete implementation: TV
class TV implements RemoteControl {
	public void powerOn() {
		System.out.println("TV is turned on");
 }
	
	public void powerOff() {
		System.out.println("TV is turned off");
 }
	
	public void volumeUp() {
		System.out.println("Volume is increased");
 }
	
	public void volumeDown() {
		System.out.println("Volume is decreased");
 }
	
}


/* The TV and DVDPlayer classes implement the RemoteControl interface 
 * and provide their specific implementations of the methods.*/


//Concrete implementation: DVD Player
class DVDPlayer implements RemoteControl {
	public void powerOn() {
		System.out.println("DVD Player is turned on");
 }
	
	public void powerOff() {
		System.out.println("DVD Player is turned off");
 }
	
	public void volumeUp() {
		System.out.println("Volume is increased");
 }
	
	public void volumeDown() {
		System.out.println("Volume is decreased");
 }
	
}



public class Main {
    public static void main(String[] args) {
    	
    	// main() method, we create objects of TV and DVDPlayer and assign them to the RemoteControl interface type. 
    	
    	
        RemoteControl tvRemote = new TV();
        tvRemote.powerOn();       // Output: TV is turned on
        tvRemote.volumeUp();      // Output: Volume is increased
        tvRemote.powerOff();      // Output: TV is turned off

        RemoteControl dvdRemote = new DVDPlayer();
        dvdRemote.powerOn();      // Output: DVD Player is turned on
        dvdRemote.volumeDown();   // Output: Volume is decreased
        dvdRemote.powerOff();     // Output: DVD Player is turned off
        
        /* use the common interface methods (powerOn(), powerOff(), volumeUp(), volumeDown()) 
         * to control the respective devices without knowing their specific implementations.*/
    }
}   

/* Abstraction : here is that the RemoteControl interface provides a simplified 
 * and standardized way to interact with different electronic devices. 
 * Users can use the remote control interface to perform common actions 
 * such as turning on/off the devices or adjusting the volume, regardless of the specific device type.*/

