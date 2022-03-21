package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location Required")
    @Size(min = 1, max = 99, message = "Location can not be more than 99 characters")
    private String location;

    @OneToMany
//    @JoinColumn(name = "employer_id")
    @JoinColumn
    private final List<Job> jobs = new ArrayList<>();

//    public Employer(String location) {
//        this.location = location;
//    }

    public Employer() {
    }

    public Employer(String location) {
        super();
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

//    public List<Job> getJobs() {
//        return jobs;
//    }

}