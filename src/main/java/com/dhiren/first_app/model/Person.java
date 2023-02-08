package com.dhiren.first_app.model;

public class Person {
   String firstName;
   String lastName;
   String currentLocation;

   public Person() {
   }

   public Person(String firstName, String lastName, String currentLocation) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.currentLocation = currentLocation;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getCurrentLocation() {
      return currentLocation;
   }

   public void setCurrentLocation(String currentLocation) {
      this.currentLocation = currentLocation;
   }
}
