
public class Controller {
    IOProcessor processor=new IOProcessor();
    void run(){
        String exit="exit";
        String x = null;
        do{
            processor.print("Список всех классов-1\nСписок всех детей в классе-2\nСписок всех педметов-3\nСписок всех преподавателей-4\nПреподаватель предмета-5\nЖурнал-6\n");
            x=processor.read(x);
            switch (x) {
                case "1":classList();
                    break;
                case "2":processor.print("Введите название класса\n");schoolClass();
                    break;
                case "3":schoolWorkList();
                    break;
                case "4":schollTeacherList();
                    break;
                case "5":processor.print("Введите название предмета\n");schoolWork();
                    break;
                case "6":jurnajStart();
            }
        }while (!exit.equals(x));
    }
    private void schoolClass() {
        String countryID=null;
        countryID=processor.read(countryID);
        school.UIAbstractFactory uiFactory = null;
        if (countryID.equals("class 1")) uiFactory = new Klass1UIFactory();
        if (countryID.equals("class 2")) uiFactory = new Klass2UIFactory();
        if (countryID.equals("class 3")) uiFactory = new Klass3UIFactory();
        if (countryID.equals("class 4")) uiFactory = new Klass4UIFactory();
        if (countryID.equals("class 5")) uiFactory = new Klass5UIFactory();

        if (uiFactory != null) {
            school.Teacher teacher = uiFactory.getTeacher();
            processor.print("Учитель " + teacher.getTeacherCountry());
            school.Learner learner = uiFactory.getLearner();
            processor.print("Список учеников " + learner.getLearnerCountry());
        }
    }
    private void schoolWork(){
        String countryID=null;
        countryID=processor.read(countryID);
        school.UIAbstractFactory2 uiFactory=null;
        if (countryID.equals("School Work 1")) uiFactory=new SchoolWork1UIFactory();
        if (countryID.equals("School Work 2")) uiFactory=new SchoolWork2UIFactory();
        if (countryID.equals("School Work 3")) uiFactory=new SchoolWork3UIFactory();
        if (countryID.equals("School Work 4")) uiFactory=new SchoolWork4UIFactory();
        if (countryID.equals("School Work 5")) uiFactory=new SchoolWork5UIFactory();
        if (countryID.equals("School Work 6")) uiFactory=new SchoolWork6UIFactory();
        if (countryID.equals("School Work 7")) uiFactory=new SchoolWork7UIFactory();
        if (countryID.equals("School Work 8")) uiFactory=new SchoolWork8UIFactory();


        if (uiFactory !=null){
            school.SchoolWork schoolWork=uiFactory.getSchoolWork();
            processor.print("Предмет: "+schoolWork.getSchoolWorkCountry()+"\n");
            school.TeacherWork teacherWork=uiFactory.getTeacherWork();
            processor.print("Учитель: "+teacherWork.getTeacherWorkCountry()+"\n");
        }
    }
    private void schoolWorkList(){
        processor.print("School Work 1\nSchool Work 2\nSchool Work 3\nSchool Work 4\nSchool Work 5\nSchool Work 6\nSchool Work 7\nSchool Work 8\n");
    }
    private void schollTeacherList(){
        processor.print("Teacher Work 1\nTeacher Work 2\nTeacher Work 3\nTeacher Work 4\nTeacher Work 5\nTeacher Work 6\nTeacher Work 7\nTeacher Work 8\n");
    }
    private void classList(){
        processor.print("class 1\nclass 2\nclass 3\nclass 4\nclass 5\n");
    }
    private void jurnajStart(){
        processor.print("Редактировать журнал-1\nПросмотр-2\n");
        String x=null;
        x=processor.read(x);
        Journal journal=new Journal();
        switch (x){
            case "1":journal.writeJurnal();
                break;
            case "2":journal.readJurnaj();
                break;
        }
    }
}
