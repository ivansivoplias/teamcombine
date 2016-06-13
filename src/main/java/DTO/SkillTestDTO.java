package DTO;

import java.util.List;

/**
 * Created by Andrew on 13.06.2016.
 */
public class SkillTestDTO {
    List<String> questions;
    List<String> allAnswers;
    List<String> rightAnswers;

    public SkillTestDTO() {
    }

    public SkillTestDTO(SkillTestDTO skillTestDTO) {
        this(skillTestDTO.getQuestions(), skillTestDTO.getAllAnswers(), skillTestDTO.getRightAnswers());
    }

    public SkillTestDTO(List<String> questions, List<String> allAnswers, List<String> rightAnswers) {
        this.questions = questions;
        this.allAnswers = allAnswers;
        this.rightAnswers = rightAnswers;
    }

    public List<String> getQuestions() {
        return questions;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }

    public List<String> getAllAnswers() {
        return allAnswers;
    }

    public void setAllAnswers(List<String> allAnswers) {
        this.allAnswers = allAnswers;
    }

    public List<String> getRightAnswers() {
        return rightAnswers;
    }

    public void setRightAnswers(List<String> rightAnswers) {
        this.rightAnswers = rightAnswers;
    }
}
