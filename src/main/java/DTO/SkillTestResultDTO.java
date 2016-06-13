package DTO;

import java.util.Date;

/**
 * Created by Andrew on 13.06.2016.
 */
public class SkillTestResultDTO {
    private Date date;
    private Long result;

    public SkillTestResultDTO() {
    }

    public SkillTestResultDTO(SkillTestResultDTO skillTestResultDTO) {
        this(skillTestResultDTO.getDate(), skillTestResultDTO.getResult());
    }

    public SkillTestResultDTO(Date date, Long result) {
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
