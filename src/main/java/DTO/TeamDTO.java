package DTO;

import model.Project;

import java.util.List;

/**
 * Created by Andrew on 13.06.2016.
 */
public class TeamDTO {
    //TODO: Write all stuff
    List<Project> projects;

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
