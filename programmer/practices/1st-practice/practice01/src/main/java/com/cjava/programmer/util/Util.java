package com.cjava.programmer.util;

import com.cjava.programmer.domain.entities.Attendee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Util {
    public static List<Attendee> generateAttendeeList(String[] group) {
        List<Attendee> attendees = new ArrayList<Attendee>();
        String[] locations = { "P", "G", "V" };
        Random random = new Random();

        for (int i = 0; i < group.length; i++) {
            String[] names = group[i].split(" ");

            attendees.add(
                new Attendee.Builder()
                   .setCode("A0" + (i + 1))
                   .setName(names[0])
                   .setLastName(names[1])
                   .setEmail((names[0] + names[1] + "@gmail.com").toLowerCase())
                   .setPhone("908070501" + i)
                   .setAddress("Av. Test 123")
                   .setLocation(locations[random.nextInt(locations.length)])
                   .build()
            );
        }

        return attendees;
    }
}
