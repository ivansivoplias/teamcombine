package model;

import model.enums.Skills;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Ivan on 05.06.2016.
 */
public class User {
    private Integer id;
    private String login, password;
    private String name, surname;
    private String email;
    private String location;
    private Double rating;
    private List<String> reviews;
    private HashMap<Skills,SkillTestResult> skills;

    public User() {

    }

    public User(String email, Integer id, String location, String login, String name, String password,
                Double rating, List<String> reviews, HashMap<Skills, SkillTestResult> skills, String surname) {
        this.email = email;
        this.id = id;
        this.location = location;
        this.login = login;
        this.name = name;
        this.password = password;
        this.rating = rating;
        this.reviews = reviews;
        this.skills = skills;
        this.surname = surname;
    }

    public User(User user) {
        this(user.getEmail(), user.getId(), user.getLocation(), user.getLogin(), user.getName(),
                user.getPassword(), user.getRating(), user.getReviews(), user.getSkills(), user.getSurname());
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void setReviews(List<String> reviews) {
        this.reviews = reviews;
    }

    public HashMap<Skills, SkillTestResult> getSkills() {
        return skills;
    }

    public void setSkills(HashMap<Skills, SkillTestResult> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", location='" + location + '\'' +
                ", rating=" + rating +
                ", reviews=" + reviews +
                '}';
    }
}
