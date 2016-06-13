package model;

import java.util.List;

/**
 * Created by Ivan on 05.06.2016.
 */
public class SkillTest {
    List<String> questions;
    List<String> allAnswers;
    List<String> rightAnswers;

    public SkillTest() {
    }

    public SkillTest(SkillTest skillTest) {
        this(skillTest.getAllAnswers(), skillTest.getQuestions(), skillTest.getRightAnswers());
    }

    public SkillTest(List<String> allAnswers, List<String> questions, List<String> rightAnswers) {
        this.allAnswers = allAnswers;
        this.questions = questions;
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
