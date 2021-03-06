package com.company.resume;

import com.company.colleges.College;
import com.company.jobs.Job;
import com.company.skills.Skill;

import java.util.ArrayList;

public class Resume {

    private String name;
    ArrayList<College> education = new ArrayList<College>();
    ArrayList<Job> experience = new ArrayList<Job>();
    ArrayList<Skill> expertise = new ArrayList<Skill>();

    public Resume() {
        this.name = name;
        education = new ArrayList<College>();
        experience = new ArrayList<Job>();
        expertise = new ArrayList<Skill>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<College> getEducation() {
        return education;
    }

    public void setEducation(ArrayList<College> education) {
        this.education = education;
    }

    public ArrayList<Job> getExperience() {
        return experience;
    }

    public void setExperience(ArrayList<Job> experience) {
        this.experience = experience;
    }

    public ArrayList<Skill> getExpertise() {
        return expertise;
    }

    public void setExpertise(ArrayList<Skill> expertise) {
        this.expertise = expertise;
    }

    public void addCollege(College colleges){
        this.education.add(colleges);
    }
    public void addJob(Job jobs){
        this.experience.add(jobs);
    }
    public void addSkill(Skill skills){
        this.expertise.add(skills);
    }
}
