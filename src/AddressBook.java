import java.util.LinkedList;

public class AddressBook {

    private final LinkedList<BuddyInfo> buddyList;

    public AddressBook() {
        this.buddyList = new LinkedList<>();
    }

    public LinkedList<BuddyInfo> getBuddyList() {
        return buddyList;
    }

    public void addBuddy(BuddyInfo buddyInfo) {
        buddyList.add(buddyInfo);
    }

    public void removeBuddy(BuddyInfo buddyInfo) {
        buddyList.remove(buddyInfo);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }

}
