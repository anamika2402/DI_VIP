import java.util.Scanner;
class bank
{
    long accno,mob;
    String date,name,address,nomi,actype;
    
    Scanner in = new Scanner(System.in);
    void getdata()
    {
    System.out.print("Enter the account number of the account holder :\n");
    accno = in.nextLong();
    
    date = in.nextLine();
    System.out.print("\nEnter the account opening date :");
    date = in.nextLine();
    
    System.out.print("\nEnter the account name of account holder :");
    name = in.nextLine();
    
    System.out.print("\nEnter the address of account holder :");
    address = in.nextLine();
    
    System.out.print("\nEnter the Mobile Number of account holder :");
    mob = in.nextLong();
    
    nomi = in.nextLine();
    System.out.print("\nEnter the nominee name of account holder :");
    nomi = in.nextLine();
    
    System.out.print("\nEnter the Account type of account holder(current/loan) :");
    actype = in.nextLine();
    }
};
class account extends bank
{
    Scanner in = new Scanner(System.in);
    double balance,ebalance;

    void getbal()
    {
        System.out.print("\nEnter the balance in account Holder's account : ");
        balance = in.nextDouble();
	ebalance = balance;
    }

};
class transaction extends account
{
    Scanner in = new Scanner(System.in);
    String transdate,tt,msg;
    double amt;
    
    void getdate()
    {
        System.out.print("\nEnter the date of transaction :");
        transdate = in.nextLine();
    }
    void transtype()
    {
        System.out.print("\nEnter the type of transaction (withdraw || deposit) :");
        tt = in.nextLine();
        
        System.out.print("\nEnter the Amount to be deposited or withdrawn : ");
        amt = in.nextLong();
        
        if(tt.equals("deposit"))
        {
           depositamt();
        }
        else
        {
             withdrawamt();
        }
    }
    
    void depositamt()
    {
             balance = amt + balance;
             msg="\nAmount to be deposited :";
    }
    
    void withdrawamt()
    {
        
        if(balance < amt)
        {
            msg="The balance is insufficient";
        }
        else
        {
                balance = balance - amt;
               msg="Amount to be withdrawn :";
               
                
        }
    }
    
    void print()
    {
        System.out.print("\n_______\n");
        System.out.print("\nThe account number is "+accno+"\n");
        System.out.print("\n The account opening date is "+date+"\n");
        System.out.print("\nThe name of A/C holder is "+name+"\n");
        System.out.print("\nThe address of A/C holder is "+address+"\n");
        System.out.print("\nThe mobile number of A/C holder is "+mob+"\n");
        System.out.print("\nThe nominee of account is "+nomi+"\n");
        System.out.print("\nAccount is "+actype+"\n");
        
        System.out.print("\n_______\n"+"\n");
        System.out.print("\nthe balance in account :"+ebalance+"\n");
        System.out.print("\nDate of transaction :"+transdate+"\n");
        System.out.print("\nType of transaction :"+tt+"\n");
        System.out.println(msg+amt);
         System.out.println("\n_______\n");
         System.out.print("The available amount in account of "+name+" "+balance+"\n");
         
          System.out.print("\n_______\n");
    }
};



class banks
{
    public static void main(String[] args)
    {
        transaction tr = new transaction();
        
        tr.getdata();
        tr.getbal();
        tr.getdate();
        tr.transtype();
        tr.print();
    }
}