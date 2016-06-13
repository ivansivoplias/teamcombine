package model;

import java.util.Date;

/**
 * Created by Ivan on 05.06.2016.
 */
public class SkillTestResult {
    private Date date;
    private Long result;

    public SkillTestResult() {
    }

    public SkillTestResult(SkillTestResult skillTestResult) {
        this(skillTestResult.getDate(), skillTestResult.getResult());
    }

    public SkillTestResult(Date date, Long result) {
        this.date = date;
        this.result = result;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getResult() {
        return result;
    }

    public void setResult(Long result) {
        this.result = result;
    }
}
