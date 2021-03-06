package com.company;
/**
*Class Hookey extends class Hobby. Has new fields, constructors and method tellAboutHobby.
*Designed by Ihor Kyrychenko.*/
import com.company.Hobby;
import java.util.Scanner;

public class Hookey extends Hobby {
    private int yearsOfPlayingHookey;

    public Hookey() {

    }

    Hookey(byte favouriteHobby, short numberOfHobbies, char letter, int age, long normNamesEnds, float currentHrivnyaValue, double currentBitcoinValue, boolean areYouLike, int yearsOfPlayingHookey) {
        super(favouriteHobby, numberOfHobbies, letter, age, normNamesEnds, currentHrivnyaValue, currentBitcoinValue, areYouLike);
        this.yearsOfPlayingHookey = yearsOfPlayingHookey;
    }

    public int getYearsOfPlayingHookey() {
        return yearsOfPlayingHookey;
    }

    public void setYearsOfPlayingHookey(int yearsOfPlayingHookey) {
        this.yearsOfPlayingHookey = yearsOfPlayingHookey;
    }

    @Override
    public void setHobby() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter your age:");
        super.setAge(scan.nextInt());

        System.out.println("Enter your favourite letter:");
        super.setLetter(scan.next().charAt(0));

        System.out.println("Enter the number of your hobbies:");
        super.setNumberOfHobbies(scan.nextShort());

        System.out.println("Enter your favourite hobby:");
        super.setFavouriteHobby(scan.nextByte());

        System.out.println("Enter the number of years you are playing hookey:");
        setYearsOfPlayingHookey(scan.nextInt());

        System.out.println("Enter the number of hours i spend to name this field:");
        super.setNormNamesEnds(scan.nextLong());

        System.out.println("Enter the current value of Hrivnya:");
        super.setCurrentHrivnyaValue(scan.nextFloat());

        System.out.println("Enter the current value of Bitcoin:");
        super.setCurrentBitcoinValue(scan.nextDouble());

        System.out.println("Do you like my questions?");
        super.setAreYouLike(scan.nextBoolean());
    }

    @Override
    public void tellAboutHobby() {
        System.out.println("Your age is " + super.getAge());
        System.out.println("Your favourite letter is " + super.getLetter());
        System.out.println("The number of your hobbies " + super.getNumberOfHobbies());
        System.out.println("Your favourite hobby is " + super.getFavouriteHobby());
        System.out.println("The number of years you are playing hookey " + getYearsOfPlayingHookey());
        System.out.println("The number of hours I was thinking how to name this field is " + super.getNormNamesEnds());
        System.out.println("The current Hrivnya value is " + super.getCurrentHrivnyaValue());
        System.out.println("The current Bitcoin value is " + super.getCurrentBitcoinValue());
        System.out.println("And you answer is " + super.isAreYouLike());
    }
}
