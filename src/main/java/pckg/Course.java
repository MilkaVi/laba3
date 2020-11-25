package pckg;

//Данные о курсах:
//         преподаватель, название,
//        специальность, номер курса обучения, номер семестра,
//        количество студентов, количество лекционных часов, количество часов практических занятий,
//        количество часов лабораторных занятий, есть ли зачёт по курсу, есть ли экзамен по курсу,
//        количество контрольных работ, общее количество часов по курсу,
//
public class Course {
    private Integer id;

    private String teacher;
    private String name;
    private String specialty;

    private int coursNumber;
    private int semesterNumber;
    private int countStudents;

    private int lectures;
    private int practick;
    private int lab;

    private String formControl;//exam of test
    private int controlWork;
    private int avarageHours;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getCoursNumber() {
        return coursNumber;
    }

    public void setCoursNumber(int coursNumber) {
        this.coursNumber = coursNumber;
    }

    public int getSemesterNumber() {
        return semesterNumber;
    }

    public void setSemesterNumber(int semesterNumber) {
        this.semesterNumber = semesterNumber;
    }

    public int getCountStudents() {
        return countStudents;
    }

    public void setCountStudents(int countStudents) {
        this.countStudents = countStudents;
    }

    public int getLectures() {
        return lectures;
    }

    public void setLectures(int lectures) {
        this.lectures = lectures;
    }

    public int getPractick() {
        return practick;
    }

    public void setPractick(int practick) {
        this.practick = practick;
    }

    public int getLab() {
        return lab;
    }

    public void setLab(int lab) {
        this.lab = lab;
    }

    public String getFormControl() {
        return formControl;
    }

    public void setFormControl(String formControl) {
        this.formControl = formControl;
    }

    public int getControlWork() {
        return controlWork;
    }

    public void setControlWork(int controlWork) {
        this.controlWork = controlWork;
    }

    public int getAvarageHours() {
        return avarageHours;
    }

    //  которое вычисляется как сумма количества лекционных часов, практических часов, лабораторных часов,
//         консультаций по лекционному материалу (0,05 часа на каждый лекционный час), 2 часа консультации перед экзаменом,
//        приём экзамена (0,5 часа на каждого студента при наличии экзамена),
//        приём зачёта (0,25 часа на каждого студента при наличии зачёта),
//        проверка контрольных работ (0,15 часа на каждого студента на каждую контрольную работу),
//        при этом общее количество часов в конечном итоге округляется вверх до целого числа.
    public void setAvarageHours() {
        avarageHours = lectures + practick + lab + (int) Math.ceil(((double) lectures * 0.05));
        System.out.println(this.formControl);
        if (formControl.equals("exam")) {
            avarageHours += (int)(2 + Math.ceil((0.5 * (double)countStudents)));
        }else{
            avarageHours += (int)(Math.ceil(((double)countStudents* 0.25)));
        }
        avarageHours += (int)(Math.ceil(((double)countStudents *0.15 * (double)controlWork)));

    }
}
