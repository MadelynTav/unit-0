package com.company;

/**
 * Created by c4q-madelyntavarez on 3/3/15.
 */
public class Lyrics {
    public static void main(String[] args){
        String part, turtle, hens, birds, rings, geese, swans, maids, ladies, lords, pipers, drummer, day;
int loop=0;

        part=" and a Partridge in a Pear Tree";
        turtle= " Two Turtle Doves"+'\n'+part;
        hens=" Three French Hens"+'\n'+turtle;
        birds=" Four Calling Birds"+'\n'+hens;
        rings=" Five Gold Rings"+'\n'+birds;
        geese=" Six Geese A Laying"+'\n'+rings;
        swans=" Seven Swams a-swimming"+'\n'+geese;
        maids=" Eight Maids a-Milking"+'\n'+swans;
        ladies=" Nine Ladies Dancing"+'\n'+maids;
        lords=" lords a-Leaping"+'\n'+ladies;
        pipers=" Eleven Pipers Piping"+'\n'+lords;
        drummer=" Twelve Drummers Drumming"+'\n'+pipers;
        day="day of Christmas my true love sent to me";

        System.out.println("On the First "+day+ '\n'+ " a Partridge in a Pear Tree");
        System.out.println();
        System.out.println("On the Second "+day+'\n' + turtle);
        System.out.println();
        System.out.println("On the Third "+day+'\n'+hens);
        System.out.println();
        System.out.println("On the Fourth "+day+'\n'+birds);
        System.out.println();
        System.out.println("On the Fifth "+day+'\n'+rings);
        System.out.println();
        System.out.println("On the sixth "+day+'\n'+geese);
        System.out.println();
        System.out.println("On the seventh "+day+'\n'+swans);
        System.out.println();
        System.out.println("On the Eigth "+day+'\n'+maids);
        System.out.println();
        System.out.println("On the Ninth "+day+'\n'+ladies);
        System.out.println();
        System.out.println("On the Tenth "+day+'\n'+lords);
        System.out.println();
        System.out.println("On the Eleventh "+day+'\n'+pipers);
        System.out.println();
        System.out.println("On the Twelfth "+day+'\n'+drummer);
        
while(loop<12){
    System.out.println("Hello World");
    loop=loop+1;
}
    }
}
