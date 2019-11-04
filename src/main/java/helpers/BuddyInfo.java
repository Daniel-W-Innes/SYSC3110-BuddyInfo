package helpers;

public class BuddyInfo {
    private String name;
    private String homeAddress;
    private String phoneNumber;

    public BuddyInfo(String name, String homeAddress, String phoneNumber) {
        this.name = name;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    private String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber + ", Home Address: " + homeAddress;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (null == o || getClass() != o.getClass()) return false;
        BuddyInfo buddyInfo = (BuddyInfo) o;
        return getName().equals(buddyInfo.getName()) && getHomeAddress().equals(buddyInfo.getHomeAddress()) && getPhoneNumber().equals(buddyInfo.getPhoneNumber());
    }
}