// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

class bank {
   private int bal = 50000;
   private int pwd;
   private int acc = 220305510;

   bank() {
   }

   public void deposit(int var1) {
      System.out.println("Enter Password: ");
      Scanner var2 = new Scanner(System.in);
      this.pwd = var2.nextInt();
      if (this.pwd == 3700) {
         this.bal += var1;
         System.out.println("Now you can deposit :" + var1 + "Rs");
         System.out.println("Total balance: " + this.bal + "Rs");
      } else {
         System.out.println("Incorrect password");
      }

   }

   public void withdraw(int var1) {
      System.out.println("Enter Password: ");
      Scanner var2 = new Scanner(System.in);
      this.pwd = var2.nextInt();
      if (this.pwd == 3700) {
         this.bal -= var1;
         System.out.println("Now you Withdraw :" + var1 + "Rs");
         System.out.println("Total balance: " + this.bal + "Rs");
      } else {
         System.out.println("Incorrect password");
      }

   }

   public void Checkbal() {
      System.out.println("Enter Password: ");
      Scanner var1 = new Scanner(System.in);
      this.pwd = var1.nextInt();
      if (this.pwd == 3700) {
         System.out.println("Total balance: " + this.bal + "Rs");
      } else {
         System.out.println("Incorrect password");
      }

   }

   public void Transfer(int var1) {
      System.out.println("Enter Password: ");
      Scanner var2 = new Scanner(System.in);
      this.pwd = var2.nextInt();
      System.out.println("Enter account : ");
      this.acc = var2.nextInt();

    //   this.var1 = var2.nextInt();

      if (this.pwd == 3700) {
         if (this.acc == 220305510) {
            System.out.println("Before Amount transfer balance: " + this.bal + "Rs");
            System.out.println("Now you Transfer :" + var1 + "Rs");
            this.bal -= var1;
            System.out.println("After Amount transfer balance: " + this.bal + "Rs");
         } else {
            System.out.println("Invaild account Number you entered");
         }
      } else {
         System.out.println("Incorrect password");
      }

   }

}

public class banking {
    // private static int var1;

    public static void main(String[] args) {
        bank BK = new bank();
        // BK.deposit(var1.nextInt());
        // System.out.println("Enter How much Amount desposit you : ");
        int var1;

        int ch;
        System.out.println("1.Deposite :");
        System.out.println("2.Withdraw :");
        System.out.println("3.CheckBalance :");
        System.out.println("4.TranferMoney :");
        
        System.out.println("Enter Your Choice :");
        
        // taking input from user : deposit,withdraw , Checkbal, Transfer 
        Scanner sc2 = new Scanner(System.in);
        ch = sc2.nextInt();
        
        switch(ch)
        {
            case 1: 
                    System.out.println("Enter How much Amount desposit you : ");
                    BK.deposit(var1 = sc2.nextInt());
            break;
            
            case 2: 
                    System.out.println("Enter How much Amount withdraw you : ");
                    BK.withdraw(var1 = sc2.nextInt());
            break;

            case 3: 
                    BK.Checkbal();
            break;

            case 4: 
                    System.out.println("Enter How much Amount you want to Tranfer : ");
                    BK.Transfer(var1 = sc2.nextInt());
            break;

            default : System.out.println("You Choice This Service not Avaliable Right Now, Try Again!");
        }
        
    }
}
