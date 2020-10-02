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
        if(buddyInfo != null) {
            buddyList.add(buddyInfo);
        }
    }

    public void removeBuddy(int index) {
        if(index >= 0 && index < buddyList.size()) {
            buddyList.remove(index);
        }
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}
