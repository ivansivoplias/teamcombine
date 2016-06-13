package DTO;

import model.SkillTestResult;
import model.enums.Skills;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Andrew on 13.06.2016.
 */
public class UserDTO {
    private Integer id;
    private String login, password;
    private String name, surname;
    private String email;
    private String location;
    private Double rating;
    private List<String> reviews;
    private HashMap<Skills, SkillTestResult> skills;

    public UserDTO() {
    }

    public UserDTO(UserDTO userDTO) {
        this(userDTO.getId(), userDTO.getLogin(), userDTO.getPassword(), userDTO.getName(), userDTO.getEmail(),
                userDTO.getLocation(), userDTO.getRating(), userDTO.getReviews(), userDTO.getSkills(), userDTO.getSurname());
    }

    public UserDTO(Integer id, String login, String password, String name, String email, String location,
                   Double rating, List<String> reviews, HashMap<Skills, SkillTestResult> skills, String surname) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.email = email;
        this.location = location;
        this.rating = rating;
        this.reviews = reviews;
        this.skills = skills;
        this.surname = surname;
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
