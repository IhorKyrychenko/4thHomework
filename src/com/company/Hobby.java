package com.company;

/**
 * Class Hobby
 * Has all primitive types and their description
 * Created by Ihor Kyrychenko
 */

public abstract class Hobby {
    protected static byte favouriteHobby;
    protected short numberOfHobbies;
    protected char letter;
    protected int age;
    protected long normNamesEnds;
    protected float currentHrivnyaValue;
    protected double currentBitcoinValue;
    protected boolean areYouLike;

    Hobby() {

    }

    Hobby(byte favouriteHobby, short numberOfHobbies, char letter, int age, long normNamesEnds, float currentHrivnyaValue, double currentBitcoinValue, boolean areYouLike ){
        this.favouriteHobby = favouriteHobby;
        this.numberOfHobbies = numberOfHobbies;
        this.letter = letter;
        this.age = age;
        this.normNamesEnds = normNamesEnds;
        this.currentHrivnyaValue = currentHrivnyaValue;
        this.currentBitcoinValue = currentBitcoinValue;
        this.areYouLike = areYouLike;
    }

    public byte getFavouriteHobby() {
        return favouriteHobby;
    }

    public void setFavouriteHobby(byte favouriteHobby) {
        this.favouriteHobby = favouriteHobby;
    }

    public short getNumberOfHobbies() {
        return numberOfHobbies;
    }

    public void setNumberOfHobbies(short numberOfHobbies) {
        this.numberOfHobbies = numberOfHobbies;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getNormNamesEnds() {
        return normNamesEnds;
    }

    public void setNormNamesEnds(long normNamesEnds) {
        this.normNamesEnds = normNamesEnds;
    }

    public float getCurrentHrivnyaValue() {
        return currentHrivnyaValue;
    }

    public void setCurrentHrivnyaValue(float currentHrivnyaValue) {
        this.currentHrivnyaValue = currentHrivnyaValue;
    }

    public double getCurrentBitcoinValue() {
        return currentBitcoinValue;
    }

    public void setCurrentBitcoinValue(double currentBitcoinValue) {
        this.currentBitcoinValue = currentBitcoinValue;
    }

    public boolean isAreYouLike() {
        return areYouLike;
    }

    public void setAreYouLike(boolean areYouLike) {
        this.areYouLike = areYouLike;
    }

    public  abstract void setHobby();

    public abstract void tellAboutHobby();
}
