package na.classtracker;

/**
 * Created by kristopher on 5/28/17.
 */

public class Homework {



    private String name;
    private int worthPoints;
    private double earnedPoints;
    private String notes;
    private String deadline;
    private Partner partner;
    private boolean music;
    private boolean finished;
    private double amountComplete;

    public Homework(String name, int worthPoints, String deadline) {
        this.name = name;
        this.worthPoints = worthPoints;
        this.deadline = deadline;
        this.earnedPoints = 0;
        this.notes = null;
        this.partner = null;
        this.music = false;
        this.finished = false;
        this.amountComplete = 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorthPoints() {
        return worthPoints;
    }

    public void setWorthPoints(int worthPoints) {
        this.worthPoints = worthPoints;
    }

    public double getEarnedPoints() {
        return earnedPoints;
    }

    public void setEarnedPoints(double earnedPoints) {
        this.earnedPoints = earnedPoints;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }


    public double getAmountComplete() {
        return amountComplete;
    }

    public void setAmountComplete(double amountComplete) {
        this.amountComplete = amountComplete;
    }


}
