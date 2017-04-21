package com.example.corpit.horoscope2017.Entity;

/**
 * Created by Corp IT on 17/4/2017.
 */

public class LuckyPet {
    public String horoscope;
    public int pets;
    public String petName;

    public LuckyPet(String horoscope, int pets, String petName){
        this.horoscope=horoscope;
        this.pets =pets;
        this.petName=petName;
    }

    public String getHoroscope() {
        return horoscope;
    }

    public int getPets() {
        return pets;
    }

    public String getPetName() {
        return petName;
    }

    public void setHoroscope(String horoscope) {
        this.horoscope = horoscope;
    }

    public void setPets(int pets) {
        this.pets = pets;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
}
