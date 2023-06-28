package org.launchcode.bar_helper.models;

import java.util.Date;

public class AddCompletedTasks {

    private enum completedTaskType {
        CLEANING,
        STOCKING,
        ROTATING,
        ORDERING,
        MISCELLANEOUS;
    }
    private String completedTaskNotes;
    private Date dateCompleted;

    public AddCompletedTasks(String completedTaskDescription, Date dateCompleted) {
        this.completedTaskNotes = completedTaskDescription;
        this.dateCompleted = dateCompleted;
    }

    public String getCompletedTaskNotes() {
        return completedTaskNotes;
    }

    public void setCompletedTaskNotes(String completedTaskNotes) {
        this.completedTaskNotes = completedTaskNotes;
    }

    public Date getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    @Override
    public String toString() {
        return "Completed Tasks" + '\n' +
                "Notes: " + completedTaskNotes + '\n' +
                "Date Completed: " + dateCompleted;
    }
}
