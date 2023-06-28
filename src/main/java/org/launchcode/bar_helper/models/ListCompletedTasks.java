package org.launchcode.bar_helper.models;

public class ListCompletedTasks {

    private enum listCompletedTaskType {
        CLEANING,
        STOCKING,
        ROTATING,
        ORDERING,
        MISCELLANEOUS;
    }
    private String listCompletedTaskNotes;
    private String listCompletedDate;

    public ListCompletedTasks(String listTaskNotes, String listCompletedDate) {
        this.listCompletedTaskNotes = listTaskNotes;
        this.listCompletedDate = listCompletedDate;
    }

    public String getListTaskNotes() {
        return listCompletedTaskNotes;
    }

    public void setListTaskNotes(String listTaskNotes) {
        this.listCompletedTaskNotes = listTaskNotes;
    }

    public String getListCompletedDate() {
        return listCompletedDate;
    }

    public void setListCompletedDate(String listCompletedDate) {
        this.listCompletedDate = listCompletedDate;
    }

    @Override
    public String toString() {
        return "Completed Tasks: " + "\n" +
                "Task Notes: " + listCompletedTaskNotes + "\n" +
                "Task Completed on: " + listCompletedDate;
    }
}
