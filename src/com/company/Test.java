package com.company;

/**
 * Class Test.Includes array of hobbies and due to cycle for each works with objects of classes Hookey and Reading.
 * Created by Ihor Kyrychenko
 */

import com.company.Hobby;
import com.company.Hookey;
import com.company.Reading;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Hobby[] array = {new Hookey(), new Reading()};
        for(Hobby i: array) {
            i.setHobby();
        }
        System.out.println("And your answers!");
        for(Hobby i: array) {
            i.tellAboutHobby();
            System.out.println();
        }
    }
}




