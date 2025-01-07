package com.cjava.programmer.domain.entities;

public class Attendee {
    private String code;
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String location;

    private Attendee(Builder builder) {
        this.code = builder.code;
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
        this.location = builder.location;
    }

    public static class Builder {
        private String code;
        private String name;
        private String lastName;
        private String email;
        private String phone;
        private String address;
        private String location;

        public Builder setCode(String code) {
            this.code = code;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Attendee build() {
            return new Attendee(this);
        }
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Attendee { " + name + " " + lastName + " | " + location + " }";
    }
}
