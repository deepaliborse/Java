//Q11 Implement exception handling in Account class program.
import java.io.*;
import java.util.*;
class Account extends Exception{
    int accountno;
    String accname;
    double balance;
    Account(int accountno, String accname, double balance){
        this.accountno = accountno;
        this.accname = accname;
        this.balance = balance;
    }
    public String toString(){
        return("The account no is " +accountno+"\nThe account holder name is "+accname+"\nThe balance is  "+balance);
    }
}

class savingAccount extends Account{
    int nooftrans;
    double interestrate;
    savingAccount(int accountno, String accname, double balance, int nooftrans, double interestrate){
        super(accountno, accname, balance);
        this.nooftrans = nooftrans;
        this.interestrate = interestrate;
    }
    public String toString(){
        String output =( super.toString() + "\nThe Number of Limit of transaction is " +nooftrans+"\nThe intrest rate is  " +interestrate);
        return output;
    }
}

class currentAccount extends Account{
    int overdraft;
    currentAccount(int accountno, String accname, double balance, int overdraft){
        super(accountno, accname, balance);
        this.overdraft = overdraft;
    }
    public String toString(){
        String output =( super.toString() + "\nThe ammount can be overdraffed is " +overdraft);
        return output;
    }
}

class dematAccount extends Account{
    int tradeno;
    dematAccount(int accountno, String accname, double balance, int tradeno){
        super(accountno, accname, balance);
        this.tradeno = tradeno;
    }
    public String toString(){
        String output =( super.toString() + "\nThe demataccount numbers is" +tradeno);
        return output;
    }
}

public class AccountClass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number");
        int ac = sc.nextInt();
        System.out.println("Enter the account holder name");
        String name = sc.next();
        System.out.println("Enter the balance ");
        double bal = sc.nextDouble();
        System.out.println("Enter 1 for saving account, 2 for current account, 3 for Demataccount");
        int n = sc.nextInt();
        switch(n){
            case 1:
                try{
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Enter the Number of Limit of transaction ");
                    int nft = sc1.nextInt();
                    System.out.println("Enter the intrest rate  ");
                    double ir = sc1.nextDouble();
                    savingAccount sa = new savingAccount(ac, name, bal, nft, ir);
                    throw new savingAccount(ac, name, bal, nft, ir);

                }
                catch(savingAccount e){
                    System.out.println(e);
                }
                break;
            case 2:
                Scanner sc2 = new Scanner(System.in);
                try{
                    System.out.println("Enter the ammount can be overdraffed ");
                    int ovd = sc2.nextInt();
                    currentAccount ca = new currentAccount(ac, name, bal, ovd);
                    throw new currentAccount(ac, name, bal,ovd);
                }
                catch(currentAccount e1){
                    System.out.println(e1);
                }
                break;
            case 3:
                try{
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Enter the demataccount numbers is");
                    int dacc = sc3.nextInt();
                    dematAccount da = new dematAccount(ac, name, bal, dacc);
                    throw new dematAccount(ac, name, bal,dacc);
                }
                catch(dematAccount e1){
                    System.out.println(e1);
                }
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
