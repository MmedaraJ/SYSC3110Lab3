
//commenting here because i am too lazy
public class BuddyInfo
{
    private String name = "";

    private long phoneNumber;
    private String birthday;
    private String address;

    public BuddyInfo(String name, long phoneNumber, String birthday, String address)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName()
    {
        return name;
    }

    public long getPhoneNumber()
    {
        return phoneNumber;
    }

    public String getBirthday()
    {
        return birthday;
    }

    public String getAddress()
    {
        return address;
    }
}
