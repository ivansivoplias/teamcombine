package model;

import model.enums.TypeOfProject;

import java.util.Date;
import java.util.List;

/**
 * Created by Ivan on 05.06.2016.
 */
public class Project {
    Date startDate, endDate;
    TypeOfProject projectType;
    List<String> hashTags;
    String projectTitle;
    String description;

    public Project() {
    }

    public Project(Project project) {
        this(project.getDescription(), project.getEndDate(), project.getHashTags(),
                project.getProjectTitle(), project.getProjectType(), project.getStartDate());
    }

    public Project(String description, Date endDate, List<String> hashTags, String projectTitle, TypeOfProject projectType, Date startDate) {
        this.description = description;
        this.endDate = endDate;
        this.hashTags = hashTags;
        this.projectTitle = projectTitle;
        this.projectType = projectType;
        this.startDate = startDate;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public TypeOfProject getProjectType() {
        return projectType;
    }

    public void setProjectType(TypeOfProject projectType) {
        this.projectType = projectType;
    }

    public List<String> getHashTags() {
        return hashTags;
    }

    public void setHashTags(List<String> hashTags) {
        this.hashTags = hashTags;
    }
}
