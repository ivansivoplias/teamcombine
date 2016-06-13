package DTO;

import model.enums.TypeOfProject;

import java.util.Date;
import java.util.List;

/**
 * Created by Andrew on 13.06.2016.
 */
public class ProjectDTO {
    Date startDate, endDate;
    TypeOfProject projectType;
    List<String> hashTags;
    String projectTitle;
    String description;

    public ProjectDTO() {
    }

    public ProjectDTO(Date startDate, Date endDate, TypeOfProject projectType, List<String> hashTags, String projectTitle, String description) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.projectType = projectType;
        this.hashTags = hashTags;
        this.projectTitle = projectTitle;
        this.description = description;
    }

    public ProjectDTO(ProjectDTO projectDTO) {
        this(projectDTO.getStartDate(), projectDTO.getEndDate(), projectDTO.getProjectType(),
                projectDTO.getHashTags(), projectDTO.getProjectTitle(), projectDTO.getDescription());
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
