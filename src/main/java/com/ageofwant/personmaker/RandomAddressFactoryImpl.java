package com.ageofwant.personmaker;

import com.ageofwant.personmaker.models.Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomAddressFactoryImpl implements AddressFactory {

    private Random rand = new Random();
    private static String[] PLACE = new String[]{
        "KARKARILLA  ROAD",
        "CLEONE  STREET",
        "LAUREL STREET",
        "GEORGE STREET",
        "NEWSTAN PLACE",
        "BELLE COURT",
        "UNDERWOOD RD",
        "Miles Street",
        "WYMBIR AVENUE",
        "DRAYTON COURT"
    };
    private static String[] TOWNS = new String[]{
        "MOONTA MINES",
        "GUILDFORD",
        "KOOTINGAL",
        "KINGSWOOD",
        "CARTWRIGHT",
        "RAINBOW BEACH",
        "PRIESTDALE",
        "REGENTS PARK",
        "WILSTON",
        "KINGAROY",
        "BOOLARRA",
        "CANTERBURY",
        "CRAGIEBURN",
        "PARAHILLS"
    };
    private static String[] STATES = new String[]{
        "WA", "QLD", "NSW", "SA", "VIC", "TAS", "ACT", "NT"
    };

    @Override
    public Address getAddress() {
        return new Address(getAddressLines(), getState(), getPostCode());
    }

    private String getFakeStreet() {
        return rand.nextInt(1000) + " " + PLACE[rand.nextInt(PLACE.length)];
    }

    private String getState() {
        return STATES[rand.nextInt(STATES.length)];
    }

    private List getAddressLines() {
        ArrayList<String> addressLines = new ArrayList<String>();

        addressLines.add(getFakeStreet());
        addressLines.add(TOWNS[rand.nextInt(TOWNS.length)]);

        return addressLines;
    }

    private String getPostCode() {
        int length = 4;
        StringBuilder bldr = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            bldr.append(rand.nextInt(10));
        }
        return bldr.toString();
    }
}
