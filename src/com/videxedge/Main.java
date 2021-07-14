package com.videxedge;

import java.util.Scanner;

public class Main {

    public static void q2() {
        Scanner input = new Scanner(System.in);
        String name;
        int section, total = 0;
        for (int i=0; i<44; i++) {
            System.out.println ("Enter the section name:");
            name = input.next();
            System.out.println ("Enter length of section:");
            section = input.nextInt();
            total += section;
            if (section > 10) {
                System.out.println (name);
            }
        }
        System.out.println ("Total length of trail:"+total);
    }

    public static void q3() {
        Scanner input = new Scanner(System.in);
        String name;
        int fix, total = 0;
        for (int i=0; i<286; i++) {
            System.out.println ("Enter the worker name:");
            name = input.next();
            System.out.println ("Enter fixes of worker:");
            fix = input.nextInt();
            total += fix;
            if (fix > 25) {
                System.out.println (name+" BONUS");
            }
        }
        System.out.println ("Total fixes for day:"+total);
    }

    public static void q4() {
        Scanner input = new Scanner(System.in);
        String name;
        int units, grade, totalfive = 0;
        for (int i=0; i<975; i++) {
            System.out.println ("Enter the student name:");
            name = input.next();
            System.out.println ("Enter number of units in CS:");
            units = input.nextInt();
            System.out.println ("Enter grade in CS:");
            grade = input.nextInt();
            System.out.print (name+" have "+units+" units with grade: "+grade);
            if (grade > 95) {
                System.out.println (" A");
            } else {
                System.out.println ();
            }
            if (units == 5) {
                totalfive++;
            }
        }
        System.out.println ("Total 5 units students: "+totalfive);
    }

    public static void q5() {
        Scanner input = new Scanner(System.in);
        String name;
        int boxes, price,total20 = 0;
        for (int i=0; i<4790; i++) {
            System.out.println ("Enter the customer name:");
            name = input.next();
            System.out.println ("Enter number of boxes:");
            boxes = input.nextInt();
            if (boxes < 4) {
                price = 10 + 35*boxes;
            } else {
                price = 35*boxes;
            }
            System.out.println (name+" have to pay "+price);
            if (boxes > 20) {
                total20++;
            }
        }
        System.out.println ("Total customers that bought more then 20 boxes: "+total20);
    }

    public static void q6() {
        Scanner input = new Scanner(System.in);
        String flag;
        int blackDay = 0;
        for (int i=1; i<=30; i++) {
            System.out.println ("Enter flag color:");
            flag = input.next();
            System.out.println ("Day "+i+" with "+flag+" flag.");
            if (flag.equals("BLACK")) {
                blackDay++;
            }
        }
        System.out.println ("Total black flag days: "+blackDay);
    }

    public static void q7() {
        Scanner input = new Scanner(System.in);
        String name, bloodType;
        int birthYear, typeO = 0;
        for (int i=0; i<275; i++) {
            System.out.println ("Enter the patient name:");
            name = input.next();
            System.out.println ("Enter birth year:");
            birthYear = input.nextInt();
            System.out.println ("Enter patient blood type:");
            bloodType = input.next();
            System.out.println (name+" was born in "+birthYear+" have "+bloodType+" blood type.");
            if (bloodType.equals("O")) {
                typeO++;
            }
        }
        System.out.println ("Total doners with O blood type: "+typeO);
    }

    public static void q8() {
        Scanner input = new Scanner(System.in);
        int measure1, measure2, allowed, max;
        for (int i=1; i<=30; i++) {
            System.out.println ("Enter 1st measure:");
            measure1 = input.nextInt();
            System.out.println ("Enter 2nd measure:");
            measure2 = input.nextInt();
            System.out.println ("Enter maximum allowed:");
            allowed = input.nextInt();
            max = Math.max(measure1,measure2);
            System.out.print ("Day "+i+" maximum measure is "+max);
            if (max > allowed) {
                System.out.println (" passed the maximum allowed !!!");
            }
        }
    }

    public static void main(String[] args) {
        q2();
        q3();
        q4();
        q5();
        q6();
        q7();
        q8();
    }
}
