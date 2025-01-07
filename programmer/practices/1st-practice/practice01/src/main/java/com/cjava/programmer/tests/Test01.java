package com.cjava.programmer.tests;

import com.cjava.programmer.domain.entities.Event;
import com.cjava.programmer.domain.entities.Speaker;
import com.cjava.programmer.util.Util;

import java.time.LocalTime;
import java.util.*;

public class Test01 {

    static String[] group1 = {
        "Ana Torres", "Luis Diaz", "Diego Fernandez", "Juan Gomez", "Hector Perez"
    };

    static String[] group2 = {
        "Diana Alvarez", "Nicolas Palomino", "Manuel Miranda", "Ismael Rivera", "Celia Ramirez"
    };

    public static void main(String[] args) {
        Speaker speaker1 = new Speaker.Builder()
            .setCode("S01")
            .setName("James")
            .setLastName("Gosling")
            .setSalary(1000)
            .setEmail("jamesgosling@gmail.com")
            .build();

        LocalTime startTime = LocalTime.of(19, 0);
        LocalTime endTime = LocalTime.of(21, 0);

        Event event1 = new Event(
             "Java 22: New Features",
             startTime,
             endTime,
             120,
             speaker1,
             true,
             Util.generateAttendeeList(group1)
        );

        Speaker speaker2 = new Speaker.Builder()
             .setCode("S02")
             .setName("Brendan")
             .setLastName("Eich")
             .setSalary(1000)
             .setEmail("brendaneich@gmail.com")
             .build();

        Event event2 = new Event(
             "Javascript New Features",
             startTime,
             endTime,
             120,
             speaker2,
             true,
             Util.generateAttendeeList(group2)
        );

        List<Event> events = Arrays.asList(event1, event2);

        events.stream().sorted(Comparator.comparing(Event::getTitle).reversed())
             .forEach(event -> {
                 System.out.println("Event: " + event.getTitle());
                 System.out.println("Speaker: " + event.getSpeaker().getName());
                 System.out.print("Start: " + event.getStartTime() + " - ");
                 System.out.println("End: " + event.getEndTime());
                 System.out.println("Attendees: ");
                 event.getAttendees().forEach(attendee -> {
                     System.out.println("- " + attendee);
                 });
                 System.out.println("*".repeat(50));
             });
    }
}
