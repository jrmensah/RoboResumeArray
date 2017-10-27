package com.company;

import com.company.colleges.College;
import com.company.jobs.Job;
import com.company.resume.Resume;
import com.company.skills.Skill;

import java.util.ArrayList;
import java.util.Scanner;

/*
*Jerilyn Mensah
* October 20, 2017
* This application will accept user input to create a resume for an employee. The user is to enter their name,
* email address, education history, work experience and skills and the application will print the results at
* the end.
*
* Update- October 25, 2017
* This application will now accept between 1 to 10 educational achievements, 0 to 20 work experiences and 1 to 20
* skills with ratings.
*
*
 */

public class Main {

    public static void main(String[] args) {

        //Declare variables

        Scanner keyboard = new Scanner(System.in);


        ArrayList<College> education = new ArrayList<College>();
        ArrayList<Job> experience = new ArrayList<Job>();
        ArrayList<Skill> expertise = new ArrayList<Skill>();


        int size = 20;
        int counter = 0;
        counter+=1;
        Resume resume = new Resume();
        College college = new College();
        Job job = new Job();
        Skill skill = new Skill();

        String answer = "";

        // Create a new person for resume
        Person person = new Person();


        //Prompt user to enter values into the program
        System.out.println("Welcome to the RoboResume!");
        System.out.println("Please enter your name, email, education, work experiences and skills with the rating below");
        System.out.println(" ");

        do {
            System.out.println("Enter your Name:");
            person.setName(keyboard.nextLine());
            System.out.println("Enter your Email:");
            person.setName(keyboard.nextLine());
            System.out.println("Education Achievements:");

            do {
                System.out.println("Please submit between 1 to 10 entries.");
                System.out.println(" ");
                System.out.println("Enter the Degree of College");
                college.degree = keyboard.nextLine();
                System.out.println("Enter Major at College:");
                college.major = keyboard.nextLine();
                System.out.println("Enter Name of College:");
                college.name = keyboard.nextLine();
                System.out.println("Enter the year of Graduation");
                college.year = keyboard.nextInt();
                keyboard.nextLine();
                education.add(college);
                counter++;
                System.out.println("Do you want to enter a school?");
                answer = keyboard.nextLine();
                if (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                    System.out.println("Invalid entry. Please enter 'Y' or 'N'");
                    answer = keyboard.nextLine();

                    while (answer.equalsIgnoreCase("y") || !answer.equalsIgnoreCase("n")) ;
                    if (counter < 1) {
                        System.out.println("You must submit at least 1 entry");
                    } else if (counter > 20) {
                        System.out.println("You have exceeded 10 entries!");
                    }


                }


            System.out.println("You have submitted" + " " +(counter+=1)+ " " +"entries");
            System.out.println(" ");

            //Print all college entries
            System.out.println("Here are the education achievements you entered:");
                System.out.println(" ");

            for (College colleges : education) {
                System.out.print(college.degree);
                System.out.print(" " + "in" + " ");
                System.out.println(college.major);
                System.out.print(college.name);
                System.out.println(" " + "," + college.year);


            }

                do {
                    System.out.println("Please submit between 0 to 10 entries.");
                    System.out.println("");
                    if(counter > 10){
                        System.out.println("You have exceeded 10 entries");
                    }
                    System.out.println("Enter the job title");
                    job.title = keyboard.nextLine();
                    System.out.println("Enter the place of the job:");
                    job.place = keyboard.nextLine();
                    System.out.println("Enter the dates you worked at the job:");
                    job.date = keyboard.nextLine();
                    System.out.println("Enter your first duty");
                    job.duty1 = keyboard.nextLine();
                    System.out.println("Enter your second duty");
                    job.duty2 = keyboard.nextLine();
                    experience.add(job);
                    System.out.println("Do you want to enter a work experience?");
                    answer = keyboard.nextLine();
                    if (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"))
                    {
                        System.out.println("Invalid entry. Please enter 'Y' or 'N'");
                        answer = keyboard.nextLine();
                    }
                } while (answer.equalsIgnoreCase("y") || !answer.equalsIgnoreCase("n"));
                  System.out.println("You have submitted" + " " +(counter+=1)+ " " +"entries");
                  System.out.println(" ");

                //Print all job entries
                System.out.println("Here are the work experiences you entered:");
                System.out.println(" ");

                for (Job jobs : experience) {
                    System.out.println(job.title);
                    System.out.println(job.place + " " + "," + " " + " " + job.date);
                    System.out.println(job.duty1);
                    System.out.println(job.duty2);
                }

            do {
                System.out.println("Please submit between 1 to 20 entries");
                System.out.println("");
                if( counter < 1){
                    System.out.println("Please submit at least 1 entry!");
                }else if(counter > 20){
                    System.out.println("You have exceeded 20 entries!");
                }
                System.out.println("Enter your first skill");
                skill.skill1 = keyboard.nextLine();
                System.out.println("Enter your second skill:");
                skill.skill2 = keyboard.nextLine();
                System.out.println("Enter your third skill:");
                skill.skill3 = keyboard.nextLine();
                expertise.add(skill);
                System.out.println("Do you want to enter a set of skills?");
                answer = keyboard.nextLine();
                if (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
                    System.out.println("Invalid entry. Please enter 'Y' or 'N'");
                    answer = keyboard.nextLine();
                }
            } while (answer.equalsIgnoreCase("y") || !answer.equalsIgnoreCase("n"));
            System.out.println("You have submitted" + " " +(counter+=1)+ " " +"entries");
            System.out.println(" ");


            //Print all skills with ratings
            System.out.println("Here are the skills and ratings you entered:");
            System.out.println(" ");

            for (Skill skills : expertise) {
                System.out.println(skill.skill1);
                System.out.println(skill.skill2);
                System.out.println(skill.skill3);

            }

            // Print all variables
            System.out.println("");
            System.out.println(person.getName());
            System.out.println(person.getEmail());
            System.out.println("");
            System.out.println("Education");
            System.out.print(college.degree);
            System.out.print(" " + "in" + " ");
            System.out.println(college.major);
            System.out.print(college.name);
            System.out.println(" " + "," + college.year);
            System.out.println(" ");
            System.out.println("Experience");
            System.out.println(job.title);
            System.out.println(job.place + " " + "," + " " + " " + job.date);
            System.out.println(job.duty1);
            System.out.println(job.duty2);
            System.out.println(" ");
            System.out.println("Skills");
            System.out.println(skill.skill1);
            System.out.println(skill.skill2);
            System.out.println(skill.skill3);

        } while (answer.equalsIgnoreCase("y"));
    }while(answer.equalsIgnoreCase("y"));
}
}








