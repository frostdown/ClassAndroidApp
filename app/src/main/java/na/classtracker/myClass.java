package na.classtracker;

/**
 * Created by kristopher on 5/28/17.
 */
import java.io.Serializable;
import java.util.ArrayList;

public class myClass implements Serializable{

    private String professorName;
    private String location;
    private String classTime;
    private double totalTimeSpent;
    private int totalExamPoints;
    private double earnedExamPoints;
    private int totalQuizPoints;
    private double earnedQuizPoints;
    private int totalHomeworkPoints;
    private double earnedHomeworkPoints;
    public ArrayList<Homework> classHomework;

    public myClass(String professorName, String location, String classTime) {

        this.professorName = professorName;
        this.location = location;
        this.classTime = classTime;
        this.totalTimeSpent = 0;
        this.totalExamPoints = 0;
        this.earnedExamPoints = 0;
        this.totalQuizPoints = 0;
        this.earnedQuizPoints = 0;
        this.totalHomeworkPoints = 0;
        this.earnedHomeworkPoints = 0;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getTotalTimeSpent() {
        return totalTimeSpent;
    }

    public void setTotalTimeSpent(double totalTimeSpent) {
        this.totalTimeSpent = totalTimeSpent;
    }

    public int getTotalExamPoints() {
        return totalExamPoints;
    }

    public void setTotalExamPoints(int totalExamPoints) {
        this.totalExamPoints = totalExamPoints;
    }

    public double getEarnedExamPoints() {
        return earnedExamPoints;
    }

    public void setEarnedExamPoints(double earnedExamPoints) {
        this.earnedExamPoints = earnedExamPoints;
    }

    public int getTotalQuizPoints() {
        return totalQuizPoints;
    }

    public void setTotalQuizPoints(int totalQuizPoints) {
        this.totalQuizPoints = totalQuizPoints;
    }

    public double getEarnedQuizPoints() {
        return earnedQuizPoints;
    }

    public void setEarnedQuizPoints(double earnedQuizPoints) {
        this.earnedQuizPoints = earnedQuizPoints;
    }

    public int getTotalHomeworkPoints() {
        return totalHomeworkPoints;
    }

    public void setTotalHomeworkPoints(int totalHomeworkPoints) {
        this.totalHomeworkPoints = totalHomeworkPoints;
    }

    public double getEarnedHomeworkPoints() {
        return earnedHomeworkPoints;
    }

    public void setEarnedHomeworkPoints(double earnedHomeworkPoints) {
        this.earnedHomeworkPoints = earnedHomeworkPoints;
    }


}
