package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
         String pet = JOptionPane.showInputDialog("What kind of pet would you like to buy?");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			while(happinessLevel<100) {
         int task = JOptionPane.showOptionDialog(null, "Pick a option to make your " + pet +" happier", "MAKE YOUR " + pet+ " HAPPY :)", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "food", "water","take it to the beach", "take a walk","groom","clean up poop","send to pet park" }, null);
         		
         		if(task == 0 ) {
         			cuddlePet();
         		}
         		else if(task == 1) {
         			foodPet();
         		}
         		else if(task == 2) {
         			waterPet();
         		}
         		else if(task ==3) {
         			beachPet();
         		}
         		else if(task==4) {
         			talkAwalkPet();
         			}
         		else if(task == 5) {
         			groomPet();
         		}
         		else if(task==6) {
         			poopPet();
         		}
         		else if(task==7) {
         			parkPet();
         		}
         		
         		if(happinessLevel >= 100) {
         			System.out.println("Your pet is happy now!");
         			
         		}
         		else if(happinessLevel<0) {
         			System.out.println("Your pet died of unhappiness :(");
         		}
         			
         		
			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
	}
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.


	
private static void cuddlePet() {
	
	JOptionPane.showMessageDialog(null, "You cuddle with your pet to make them more happy");
	JOptionPane.showMessageDialog(null, "Your pet made a happy noise and gained an extra 17 happiness points");
	happinessLevel +=17;
	JOptionPane.showMessageDialog(null,"Happiness level"+ happinessLevel);
	
}

private static void foodPet(){
	JOptionPane.showMessageDialog(null, "You give your pet food to cheer them up");
	JOptionPane.showMessageDialog(null, "Your pet gave you a high five and he earnt 25 happiness points");
	happinessLevel +=25;
	JOptionPane.showMessageDialog(null,"Happiness level"+ happinessLevel);
	}
private static void waterPet() {
	JOptionPane.showMessageDialog(null, "You give your pet water to make them less thirsty");
	JOptionPane.showMessageDialog(null, "Your pet pants with happiness and he earns 7 more happiness points");
	happinessLevel+=7;
	JOptionPane.showMessageDialog(null,"Happiness level"+ happinessLevel);
}
private static void talkAwalkPet() {
	JOptionPane.showMessageDialog(null, "You take your pet on a walk to let the dog more exersise");
	JOptionPane.showMessageDialog(null, "Your pet now feels more fit and he earns 28 more happiness points");
	happinessLevel+=28;
	JOptionPane.showMessageDialog(null, "Happiness level"+ happinessLevel);
}
private static void groomPet() {
	JOptionPane.showMessageDialog(null, "You groom your pet so he looks fresh");
	JOptionPane.showMessageDialog(null, "Your pet is loves his hairdoo and earns another 21 happiness points ");
	happinessLevel+=21;
	JOptionPane.showMessageDialog(null, "Happiness level"+ happinessLevel);
}
private static void poopPet() {
	JOptionPane.showMessageDialog(null, "Your pick up your pet's poop ");
	JOptionPane.showMessageDialog(null, "Your dog isn't thrilled but he dosen't want to step in his own poop so he gains 3 happiness points ");
	happinessLevel+=3;
	JOptionPane.showMessageDialog(null, "Happiness level"+ happinessLevel);
}
private static void beachPet() {
	JOptionPane.showMessageDialog(null, "You take your pet to the pet beach");
	JOptionPane.showMessageDialog(null, "Your pet is scared of water and he losses 9 happiness");
	happinessLevel-=7;
	JOptionPane.showMessageDialog(null, "Happiness level"+ happinessLevel);
	
}
private static void parkPet() {
JOptionPane.showMessageDialog(null, "You take your pet to the pet park");
JOptionPane.showMessageDialog(null, "You take your pet to the pet park but it gets attacked by another bpet and losess 20 happiness points");
happinessLevel-=20;
JOptionPane.showMessageDialog(null, "Happiness level"+ happinessLevel);
	}
}