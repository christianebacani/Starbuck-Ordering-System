import java.util.Scanner;
public class StarbucksOrderingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        boolean transaction = true;
        int priceTall[] = {185,160,150,185,190,200,175};
        int priceGrande[] = {200,175,165,200,205,215,190};
        int priceVenti[] = {215,190,180,215,220,230,205};
        
        System.out.print("Welcome to Starbucks!\n");
        System.out.print("Press enter to start : ");
        String pressEnter = input.nextLine();
        
        while(transaction){
        
        System.out.print("\n\tMENU\n\n");
        System.out.print("\t\t\tTALL\t\tGRANDE\t\tVENTI\n\n");
        System.out.print("1.) Caramel Macchiato\tP 185\t\tP 200\t\tP 215\n\n");
        System.out.print("2.) Caffe Latte      \tP 160\t\tP 175\t\tP 190\n\n");
        System.out.print("3.) Caffe Americano  \tP 150\t\tP 165\t\tP 180\n\n");
        System.out.print("4.) White Chocolate Mocha P 185\t\tP 200\t\tP 215\n\n");
        System.out.print("5.) Java Chip Frappuccino P 190\t\tP 205\t\tP 220\n\n");
        System.out.print("6.) Dark Mocha Frappuccino P 200\tP 215\t\tP 230\n\n");
        System.out.print("7.) Mocha Frapuccino \tP 175\t\tP 190\t\tP 205\n\n");
        
        System.out.print("Enter your order here: ");
        int order = input.nextInt();
        
        
        System.out.print("1.) Tall\n2.) Grande\n3.) Venti\n");
        System.out.print("Enter the size of your cup : ");
        int size = input.nextInt();
        
        System.out.print("Enter the quantity here : ");
        int quantity = input.nextInt();
        
        switch(size){
            case 1:
                total += priceTall[order - 1] * quantity;
                break;
                
            case 2:
                total += priceGrande[order - 1] * quantity;
                break;
                
            case 3:
                total += priceVenti[order - 1] * quantity;
                break;
            
            default:
                System.out.print("\n\nINVALID CHOICE!\n");
               
        }
        
        System.out.print("Do you want to order more? (y/n): ");
        input.nextLine();
        String buyMore = input.nextLine();
        
        if(buyMore.equalsIgnoreCase("n")){
           transaction = false;
           System.out.print("The total price is : P " + total + "\n");
        
           System.out.print("Enter your payment here: P ");
           int payment = input.nextInt();
        
           int change = payment - total;
        
           System.out.print("Change : P " + change + "\n");
           System.out.print("\n\nTHANK YOU FOR ORDERING ^_^\n\n");
        
        }
        
        }
        
        
        
        
        
        
        
        
        
    }
}
