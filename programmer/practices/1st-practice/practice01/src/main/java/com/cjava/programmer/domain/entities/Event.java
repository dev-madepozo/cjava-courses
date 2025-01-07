package com.cjava.programmer.domain.entities;

import com.cjava.programmer.util.Constants.*;

import java.time.LocalTime;
import java.util.List;

import static com.cjava.programmer.util.Constants.*;

public class Event {
    private String title;
    private LocalTime startTime;
    private LocalTime endTime;
    private int duration;
    private Speaker speaker;
    private boolean isPeakSeason;
    private List<Attendee> attendees;

    public Event(String title, LocalTime startTime, LocalTime endTime, int duration, Speaker speaker, boolean isPeakSeason, List<Attendee> attendees) {
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.duration = duration;
        this.speaker = speaker;
        this.isPeakSeason = isPeakSeason;
        this.attendees = attendees;
    }

    public double getTicketCost(String location) {
        return switch (location) {
            case "P" -> COST_LOCATION_PLATINUM;
            case "G" -> COST_LOCATION_GOLD;
            case "V" -> COST_LOCATION_VIP;
            default -> throw new IllegalArgumentException("Invalid location: " + location);
        };
    }

    public double calculateTicketCostWithIGV(double ticketCost) {
        return ticketCost + (IGV * ticketCost);
    }

    public double calculateTicketCostWithDiscount(double ticketCost) {
        return ticketCost * (this.isPeakSeason ? DISCOUNT_BY_PEAK_SEASON : DISCOUNT_BY_NOT_PEAK_SEASON);
    }

    public String getTitle() {
        return title;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public int getDuration() {
        return duration;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public boolean isPeakSeason() {
        return isPeakSeason;
    }

    public List<Attendee> getAttendees() {
        return attendees;
    }
}
