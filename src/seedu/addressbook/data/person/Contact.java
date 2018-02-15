package seedu.addressbook.data.person;

/**
 * Represents a Person's Contact in the address book.
 * Parent class of Phone, Email and Address classes which extract commonalities from child classes.
 */
public class Contact {

    public String value;
    private boolean isPrivate;

    public Contact (boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return value;
    }

}