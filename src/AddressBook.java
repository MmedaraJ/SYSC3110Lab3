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
        if(buddy != null)
        {
            addressBook.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index)
    {
        if(index >= 0 && index < addressBook.size())
        {
            return addressBook.remove(index);
        }
        return null;
    }

    public static void main(String[] args)
    {
        AddressBook addressBook = new AddressBook();
        BuddyInfo buddy0 = new BuddyInfo("John", 123456789,
                "2000-01-12", "20, Rich Road");
        BuddyInfo buddy1 = new BuddyInfo("John", 123456789,
                "2000-01-12", "20, Rich Road");
        addressBook.addBuddy(buddy0);
        addressBook.addBuddy(buddy1);
        addressBook.removeBuddy(0);
    }
}
