import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    String userName;
    String address;
    double weight;
    boolean isTame;

	  Scanner scanner = new Scanner(System.in);
 System.out.println("What is the address of the stable?");
		address = scanner.nextLine();

  Stable stable = new Stable(address);
    
    System.out.println("Do you wish to add a horse to the stable? y/n"); 
		char decision = scanner.next().charAt(0);
    
  while(decision == 'y'){
    scanner.nextLine();
    System.out.println("What is the name of the horse");
    userName= scanner.nextLine();
    
    System.out.println("What is the weight of the horse");
weight = scanner.nextDouble();
    
  System.out.println("Is the horse tamed? Enter True or False");
isTame = scanner.nextBoolean();
    
Horse horse = new Horse (userName, weight,isTame);
  stable.horseArraylist.add(horse);
     decision= scanner.next().charAt(0);
  }
    
			for(int i=0;i<stable.horseArraylist.size();i++){

System.out.println("Horse #" + (i+1)+ " Name: "+ stable.horseArraylist.get(i).name + " Weight: "+ stable.horseArraylist.get(i).weight+ " Tame: "+ stable.horseArraylist.get(i).isTame);
      
}
scanner.close();
 }
}

