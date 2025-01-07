package com.cjava.programmer.domain.entities;

public class Speaker {

    private String code;
    private String name;
    private String lastName;
    private double salary;
    private String email;

    private Speaker(Builder builder) {
        this.code = builder.code;
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.salary = builder.salary;
        this.email = builder.email;
    }

    public static class Builder {
        private String code;
        private String name;
        private String lastName;
        private double salary;
        private String email;

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

        public Builder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Speaker build() {
            return new Speaker(this);
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

    public double getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }
}
