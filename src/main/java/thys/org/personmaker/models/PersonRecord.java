package thys.org.personmaker.models;

/**
 *
 * @author meithy0
 */
public final class PersonRecord {

    private String name;
    private String surName;
    private Address address;
    private Character gender;

    /**
     *
     * @param name
     * @param surName
     * @param address
     * @param gender
     */
    public PersonRecord(String name, String surName, Address address, Character gender) {
        this.name = name;
        this.surName = surName;
        this.address = new Address(address);
        setGender(gender);
    }

    public Address getAddress() {
        return address;
    }

    public Character getGender() {
        return gender;
    }

    private void setGender(Character g) {
        gender = Character.toUpperCase(g);
        if (!(gender == 'M' || gender == 'F')) {
            throw new IllegalArgumentException("Gender should be 'M' or 'F'");
        }
        this.gender = g;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surName;
    }

    @Override
    public String toString() {
        StringBuilder bld = new StringBuilder();
        bld.append(getName()).append(" ").append(getSurname()).append("\n");
        bld.append(getGender()).append("\n");
        bld.append(getAddress().toString()).append("\n");
        return bld.toString();
    }
}
