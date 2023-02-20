package org.cajun.navy.model;

import java.math.BigDecimal;

public class Responder {

    private BigDecimal latitude;
    private BigDecimal longitude;
    private boolean enrolled;
    private String name;
    private String phoneNumber;
    private int boatCapacity;
    private boolean medicalKit;
    private boolean available = true;
    private boolean person = false;

    public BigDecimal getLatitude() {
        return latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public boolean isEnrolled() {
        return enrolled;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getBoatCapacity() {
        return boatCapacity;
    }

    public boolean isMedicalKit() {
        return medicalKit;
    }

    public boolean isAvailable() {
        return available;
    }

    public boolean isPerson() {
        return person;
    }

    public static class Builder {

        private final Responder responder;

        public Builder() {
            this.responder = new Responder();
        }

        public Builder name(String name) {
            responder.name = name;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            responder.phoneNumber = phoneNumber;
            return this;
        }

        public Builder latitude(double latitude) {
            responder.latitude = BigDecimal.valueOf(latitude);
            return this;
        }

        public Builder longitude(double longitude) {
            responder.longitude = BigDecimal.valueOf(longitude);
            return this;
        }

        public Builder boatCapacity(Integer boatCapacity) {
            responder.boatCapacity = boatCapacity;
            return this;
        }

        public Builder medicalKit(Boolean medicalKit) {
            responder.medicalKit = medicalKit;
            return this;
        }

        public Builder available(Boolean available) {
            responder.available = available;
            return this;
        }

        public Builder person(Boolean person) {
            responder.person = person;
            return this;
        }

        public Builder enrolled(Boolean enrolled) {
            responder.enrolled = enrolled;
            return this;
        }

        public Responder build() {
            return responder;
        }

    }

}
