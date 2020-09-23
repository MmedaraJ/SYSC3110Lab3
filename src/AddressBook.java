import java.util.ArrayList;

public class AddressBook
{
    private ArrayList<BuddyInfo> addressBook;

    public AddressBook()
    {
        addressBook = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy)
    {
        addressBook.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy)
    {
        addressBook.remove(buddy);
    }

    public static void main(String[] args)
    {
        AddressBook addressBook = new AddressBook();

        BuddyInfo buddy0 = new BuddyInfo("John", 123456789,
                "2000-01-12", "20, Rich Road");

        addressBook.addBuddy(buddy0);

        System.out.println("Address Book");
    }
}
