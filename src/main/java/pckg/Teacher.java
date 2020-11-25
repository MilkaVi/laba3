package pckg;
// Данные о преподавателях: фамилия, имя, отчество,
//         ученая степень, ученое звание, должность, пол,
//         дата рождения, количество читаемых курсов.
public class Teacher {
    private Integer id;
    private String secondName;
    private String name;
    private String lastName;

    private String degree;
    private String rank;
    private String position;

    private String sex;
    private String date;
    private Integer countCourse;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", secondName='" + secondName + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", degree='" + degree + '\'' +
                ", rank='" + rank + '\'' +
                ", position='" + position + '\'' +
                ", sex='" + sex + '\'' +
                ", date='" + date + '\'' +
                ", countCourse=" + countCourse +
                '}';
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getCountCourse() {
        return countCourse;
    }

    public void setCountCourse(Integer countCourse) {
        this.countCourse = countCourse;
    }
}