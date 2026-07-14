package main;

import packageone.ClassOne;
import packagetwo.ClassTwo;
import packagethree.ClassThree;

public class MainLab {
    public static void main(String[] args) {
	ClassOne objectOne = new ClassOne();
        ClassTwo objectTwo = new ClassTwo();
        ClassThree objectThree = new ClassThree();
        
        System.out.println(objectOne.greet());
        System.out.println(objectTwo.greet());
        System.out.println(objectThree.greet());	
    }
}
