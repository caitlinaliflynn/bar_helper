package org.launchcode.bar_helper.models;

import java.util.Date;

public class AddTODOTasks {

    private enum todoTaskType {
        CLEANING,
        STOCKING,
        ROTATING,
        ORDERING,
        MISCELLANEOUS;
    }

    private String todoTaskNotes;

    private Date idealDateCompletedBy;

    public AddTODOTasks(String todoTaskDescription, Date idealDateCompletedBy) {
        this.todoTaskNotes = todoTaskDescription;
        this.idealDateCompletedBy = idealDateCompletedBy;
    }

    public String getTodoTaskNotes() {
        return todoTaskNotes;
    }

    public void setTodoTaskNotes(String todoTaskNotes) {
        this.todoTaskNotes = todoTaskNotes;
    }

    public Date getIdealDateCompletedBy() {
        return idealDateCompletedBy;
    }

    public void setIdealDateCompletedBy(Date idealDateCompletedBy) {
        this.idealDateCompletedBy = idealDateCompletedBy;
    }

    @Override
    public String toString() {
        return "TODO Tasks" + '\n' +
                "Notes: " + todoTaskNotes + '\n' +
                "Ideal Date Completed By: " + idealDateCompletedBy;
    }
}
