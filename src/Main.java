import java.util.Scanner; 

public class Main {
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int food;
    	double pizzaTime, subTime, soupTime;
    	pizzaTime = 45;
    	subTime = 60;
    	soupTime = 105;
    	int items;
    	double time;
    	System.out.println("Hello! What would you like to heat up today? ");
    	System.out.println("Press 1 for pizza");
    	System.out.println("Press 2 for subs");
    	System.out.println("Press 3 for soup");
    	
    	food = input.nextInt();

    	if(food == 1){
    	    System.out.println("How much pizza would you like?");
    	}else if(food == 2){
    	    System.out.println("How many subs would you like?");
    	}else if(food == 3){
    	    System.out.println("How much soup would you like?");
    	}else{
    		System.out.println("Please enter a valid food");
}
    	items = input.nextInt();
    	
    	if(food == 1){
    	    time = pizzaTime + (0.5*pizzaTime)*(items-1);
    	    System.out.println("It will take "+time);
    	    System.out.print(" seconds");
    	}else if(food == 2){
    	    time = subTime + (0.5*subTime)*(items-1);
    	    System.out.println("It will take "+time);
    	    System.out.print(" seconds");
    	}else if(food == 3){
    	    time = soupTime + (0.5*soupTime)*(items-1);
    	    System.out.println("It will take "+time);
    	    System.out.print(" seconds");
    	}else{
    		System.out.println("Please enter a valid food");
    	}

    	
	}
}