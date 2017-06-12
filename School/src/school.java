import java.util.Collection;

class school {
    public interface Teacher{
        public String getTeacherCountry();
    }
    public interface Learner{
        public Collection getLearnerCountry();
    }
    public interface SchoolWork{
        String getSchoolWorkCountry();
    }
    public interface TeacherWork{
        String getTeacherWorkCountry();
    }
    public interface UIAbstractFactory{
        Teacher getTeacher();
        Learner getLearner();
    }
    public interface UIAbstractFactory2{
        SchoolWork getSchoolWork();
        TeacherWork getTeacherWork();
    }
}

class Klass1Teacher implements school.Teacher {
    public String getTeacherCountry() {
        return "teacher 1";
    }
}
class Klass1Learner implements school.Learner {
    public Collection getLearnerCountry() {
        Class aClass=new Class();
        aClass.klass1();
        return aClass.klass1();
    }
}
class Klass2Teacher implements school.Teacher {
    public String getTeacherCountry() {
        return "teacher 2";
    }
}
class Klass2Learner implements school.Learner {
    public Collection getLearnerCountry() {
        Class aClass=new Class();
        aClass.klass1();
        return aClass.klass2();
    }
}
class Klass3Teacher implements school.Teacher {
    public String getTeacherCountry() {
        return "teacher 3";
    }
}
class Klass3Learner implements school.Learner {
    public Collection getLearnerCountry() {
        Class aClass=new Class();
        aClass.klass1();
        return aClass.klass3();
    }
}
class Klass4Teacher implements school.Teacher {
    public String getTeacherCountry() {
        return "teacher 4";
    }
}
class Klass4Learner implements school.Learner {
    public Collection getLearnerCountry() {
        Class aClass=new Class();
        aClass.klass1();
        return aClass.klass4();
    }
}
class Klass5Teacher implements school.Teacher {
    public String getTeacherCountry() {
        return "teacher 5";
    }
}
class Klass5Learner implements school.Learner {
    public Collection getLearnerCountry() {
        Class aClass=new Class();
        aClass.klass1();
        return aClass.klass5();
    }
}

class Work1 implements school.SchoolWork{
    public String getSchoolWorkCountry(){
        return "School Work 1";
    }
}
class TeacherWork1 implements school.TeacherWork{
    public String getTeacherWorkCountry(){
        return "Teacher Work 1";
    }
}
class Work2 implements school.SchoolWork{
    public String getSchoolWorkCountry(){
        return "School Work 2";
    }
}
class TeacherWork2 implements school.TeacherWork{
    public String getTeacherWorkCountry(){
        return "Teacher Work 2";
    }
}
class Work3 implements school.SchoolWork{
    public String getSchoolWorkCountry(){
        return "School Work 3";
    }
}
class TeacherWork3 implements school.TeacherWork{
    public String getTeacherWorkCountry(){
        return "Teacher Work 3";
    }
}
class Work4 implements school.SchoolWork{
    public String getSchoolWorkCountry(){
        return "School Work 4";
    }
}
class TeacherWork4 implements school.TeacherWork{
    public String getTeacherWorkCountry(){
        return "Teacher Work 4";
    }
}
class Work5 implements school.SchoolWork{
    public String getSchoolWorkCountry(){
        return "School Work 5";
    }
}
class TeacherWork5 implements school.TeacherWork{
    public String getTeacherWorkCountry(){
        return "Teacher Work 5";
    }
}
class Work6 implements school.SchoolWork{
    public String getSchoolWorkCountry(){
        return "School Work 6";
    }
}
class TeacherWork6 implements school.TeacherWork{
    public String getTeacherWorkCountry(){
        return "Teacher Work 6";
    }
}
class Work7 implements school.SchoolWork{
    public String getSchoolWorkCountry(){
        return "School Work 7";
    }
}
class TeacherWork7 implements school.TeacherWork{
    public String getTeacherWorkCountry(){
        return "Teacher Work 7";
    }
}
class Work8 implements school.SchoolWork{
    public String getSchoolWorkCountry(){
        return "School Work 8";
    }
}
class TeacherWork8 implements school.TeacherWork{
    public String getTeacherWorkCountry(){
        return "Teacher Work 8";
    }
}

class Klass1UIFactory implements school.UIAbstractFactory{
    public school.Teacher getTeacher(){
        return new Klass1Teacher();
    }
    public school.Learner getLearner(){
        return new Klass1Learner();
    }
}
class Klass2UIFactory implements school.UIAbstractFactory{
    public school.Teacher getTeacher(){
        return new Klass2Teacher();
    }
    public school.Learner getLearner(){
        return new Klass2Learner();
    }
}
class Klass3UIFactory implements school.UIAbstractFactory{
    public school.Teacher getTeacher(){
        return new Klass3Teacher();
    }
    public school.Learner getLearner(){
        return new Klass3Learner();
    }
}
class Klass4UIFactory implements school.UIAbstractFactory{
    public school.Teacher getTeacher(){
        return new Klass4Teacher();
    }
    public school.Learner getLearner(){
        return new Klass4Learner();
    }
}
class Klass5UIFactory implements school.UIAbstractFactory{
    public school.Teacher getTeacher(){
        return new Klass5Teacher();
    }
    public school.Learner getLearner(){
        return new Klass5Learner();
    }
}

class SchoolWork1UIFactory implements school.UIAbstractFactory2{
    public school.SchoolWork getSchoolWork(){
        return new Work1();
    }
    public school.TeacherWork getTeacherWork(){
        return new TeacherWork1();
    }
}
class SchoolWork2UIFactory implements school.UIAbstractFactory2{
    public school.SchoolWork getSchoolWork(){
        return new Work2();
    }
    public school.TeacherWork getTeacherWork(){
        return new TeacherWork2();
    }
}
class SchoolWork3UIFactory implements school.UIAbstractFactory2{
    public school.SchoolWork getSchoolWork(){
        return new Work3();
    }
    public school.TeacherWork getTeacherWork(){
        return new TeacherWork3();
    }
}
class SchoolWork4UIFactory implements school.UIAbstractFactory2{
    public school.SchoolWork getSchoolWork(){
        return new Work4();
    }
    public school.TeacherWork getTeacherWork(){
        return new TeacherWork4();
    }
}
class SchoolWork5UIFactory implements school.UIAbstractFactory2{
    public school.SchoolWork getSchoolWork(){
        return new Work5();
    }
    public school.TeacherWork getTeacherWork(){
        return new TeacherWork5();
    }
}
class SchoolWork6UIFactory implements school.UIAbstractFactory2{
    public school.SchoolWork getSchoolWork(){
        return new Work6();
    }
    public school.TeacherWork getTeacherWork(){
        return new TeacherWork6();
    }
}
class SchoolWork7UIFactory implements school.UIAbstractFactory2{
    public school.SchoolWork getSchoolWork(){
        return new Work7();
    }
    public school.TeacherWork getTeacherWork(){
        return new TeacherWork7();
    }
}
class SchoolWork8UIFactory implements school.UIAbstractFactory2{
    public school.SchoolWork getSchoolWork(){
        return new Work8();
    }
    public school.TeacherWork getTeacherWork(){
        return new TeacherWork8();
    }
}