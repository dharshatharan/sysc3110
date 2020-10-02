public class BuddyInfo {

    public BuddyInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private final String name;

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer");

        System.out.println("Hello " + buddy.getName());
    }
}
