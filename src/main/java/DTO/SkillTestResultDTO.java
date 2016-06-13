package DTO;

import java.util.Date;

/**
 * Created by Andrew on 13.06.2016.
 */
public class SkillTestResultDTO {
    private Date date;
    private Long result;

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
