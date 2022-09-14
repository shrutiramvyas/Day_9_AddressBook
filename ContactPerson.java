import java.util.*;

public class ContactPerson {
    Scanner scan = new Scanner(System.in);

    Collection<AdressBookClass> c= new ArrayList<AdressBookClass>();
    public void create(){
        System.out.println("Number Of Contact Person You want to add: ");
        int num = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < num; i++) {
            insert();
        }
    }
    public void insert(){
        ContactPerson add = new ContactPerson();
        System.out.println("Enter First Name :");
        String first_name = scan.next();
        scan.nextLine();
        System.out.println("Enter Last Name :");
        String last_name = scan.nextLine();
        System.out.println("Enter address :");
        String address = scan.nextLine();
        System.out.println("Enter city :");
        String city = scan.next();
        System.out.println("Enter state :");
        String state = scan.next();
        System.out.println("Enter email :");
        String email = scan.next();
        scan.nextLine();
        System.out.println("Enter Phone Number :");
        long phoneNumber = scan.nextLong();
        scan.nextLine();
        System.out.println("Enter Zip :");
        int zip = scan.nextInt();
        c.add(new AdressBookClass(first_name, last_name, address, city, state, email, phoneNumber, zip));
    }


    public void display(){
        System.out.println("==============================================");
        Iterator<AdressBookClass> i=c.iterator();
        while(i.hasNext()){
            AdressBookClass e=i.next();
            System.out.println(e);
        }
        System.out.println("==============================================");
    }

    public void ask() {
        int choose;
        do {
            System.out.println("1 for create new contact \n 2 for display\n: ");
            choose = scan.nextInt();
            switch (choose) {
                case 1:
                    create();
                    break;
                case 2:
                    display();
                    break;

            }
        }while(choose!=0);
    }

    public static void main(String[] args) {
        ContactPerson co = new ContactPerson();
        co.ask();
    }
}
