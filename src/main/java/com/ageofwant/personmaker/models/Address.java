package com.ageofwant.personmaker.models;

import java.util.ArrayList;
import java.util.List;

public final class Address {

    private List<String> lines = new <String>ArrayList();
    private String state;
    private String postcode;

    public Address(List addressLines, String state, String postcode) {
        this.lines = new ArrayList(addressLines);
        this.state = state;
        this.postcode = postcode;
    }

    /**
     * Copy constructor
     *
     * @param address
     */
    public Address(Address address) {
        this(address.getLines(), address.getState(), address.getPostcode());
    }

    public String getPostcode() {
        return postcode;
    }

    public String getState() {
        return state;
    }

    public List getLines() {
        return lines;
    }

    @Override
    public String toString() {
        StringBuilder bld = new StringBuilder();
        for (String line : lines) {
            bld.append(line).append("\n");
        }
        bld.append(state).append("\n");
        bld.append(postcode).append("\n");
        return bld.toString();
    }
}
