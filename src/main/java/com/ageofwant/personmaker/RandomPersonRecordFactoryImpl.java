package com.ageofwant.personmaker;

import com.ageofwant.personmaker.models.Address;
import com.ageofwant.personmaker.models.PersonRecord;
import java.util.Random;

public class RandomPersonRecordFactoryImpl implements PersonRecordFactory {

    private static final String[] NAMES = new String[]{
        "JAN",
        "SUZANNE",
        "JOSEPH",
        "KYLIE",
        "RENEE",
        "CHERYL",
        "MADELEINE",
        "TEGAN",
        "MICHELLE",
        "DANIELLE",
        "MADELAINE",
        "RAKESH",
        "SUNNI",
        "JARRED",
        "YAN",
        "PEET",
        "THYS",
        "JOHN"
    };
    private static String[] SURNAMES = new String[]{
        "CAWTHORN",
        "HAWACH",
        "MORRIS",
        "KEEN",
        "ROBINSON",
        "HANSEN",
        "JUSTICE",
        "TURNBULL",
        "HEAD MOLONEY",
        "BEVAN-WUEHRL",
        "AHMED",
        "KOHLER",
        "WATERSON",
        "ROSE",
        "MOON"
    };
    private static Character[] GENDER = new Character[]{'M', 'F'};
    private Random rnd = new Random();
    private AddressFactory addressFactory = new RandomAddressFactoryImpl();

    @Override
    public PersonRecord getPersonRecord() {
        PersonRecord randomRecord = new PersonRecord(
                getName(),
                getSurname(),
                getAddress(),
                getGender());
        return randomRecord;
    }

    private Address getAddress() {
        return addressFactory.getAddress();
    }

    private Character getGender() {
        return GENDER[rnd.nextInt(GENDER.length)];
    }

    private String getSurname() {
        int size = SURNAMES.length;
        if (size > 0) {
            return SURNAMES[rnd.nextInt(SURNAMES.length)];
        } else {
            return "NONAME";
        }
    }

    private String getName() {
        int size = NAMES.length;
        if (size > 0) {
            return NAMES[rnd.nextInt(NAMES.length)];
        } else {
            return "NONAME";
        }
    }
}
