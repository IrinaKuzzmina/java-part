package com.academy.telesen.Homework01;

public class Task09
{

    public static void main(String[] args) {
        if (args.length == 2) {
            System.out.println(args[0] + "Hello!" + args[1] + "\n" +
                    args[0] + "This my first program. I'm programming on Java." + args[1] + "\n" +
                    args[0] + "Programming is a pleasure." + args[1] + "\n" +
                    args[0] + "My goal is to become a cool QA Automation Engineer." + args[1]);
        } else {
            System.out.println("Please, enter arguments");
        }
    }
}
