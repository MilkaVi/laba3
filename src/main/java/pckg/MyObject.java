package pckg;
//номер зачетки, группа, фамилия, имя,
// отчество, оценка по 1-му предмету в сессию,
// оценка по 2-му предмету в сессию, оценка по 3-му предмету в сессию,
// оценка по 4-му предмету в сессию, средний балл
public class MyObject {
    private Integer id;
    private String tickedNum;
    private String group;
    private String name;
    private String secondName;
    private String lastName;
    private Integer mark1;
    private Integer mark2;
    private Integer mark3;
    private Integer mark4;
    private Double avarageMark;


    public String getTickedNum() {
        return tickedNum;
    }

    public void setTickedNum(String tickedNum) {
        this.tickedNum = tickedNum;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getMark1() {
        return mark1;
    }

    public void setMark1(Integer mark1) {
        this.mark1 = mark1;
    }

    public Integer getMark2() {
        return mark2;
    }

    public void setMark2(Integer mark2) {
        this.mark2 = mark2;
    }

    public Integer getMark3() {
        return mark3;
    }

    public void setMark3(Integer mark3) {
        this.mark3 = mark3;
    }

    public Integer getMark4() {
        return mark4;
    }

    public void setMark4(Integer mark4) {
        this.mark4 = mark4;
    }

    public Double getAvarageMark() {
        return avarageMark;
    }

    public void setAvarageMark() {
        this.avarageMark = ((double)mark1+(double)mark2 + (double)mark3 +(double)mark4)/4;
    }
}