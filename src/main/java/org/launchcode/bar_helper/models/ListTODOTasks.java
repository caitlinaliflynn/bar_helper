package org.launchcode.bar_helper.models;

public class ListTODOTasks {

    private enum listTODOTaskType {
        CLEANING,
        STOCKING,
        ROTATING,
        ORDERING,
        MISCELLANEOUS;
    }
    private String listTODOTaskNotes;
    private String listIdealDateCompletedBy;

    public ListTODOTasks(String listTODOTaskNotes, String listIdealDateCompletedBy) {
        this.listTODOTaskNotes = listTODOTaskNotes;
        this.listIdealDateCompletedBy = listIdealDateCompletedBy;
    }

    public String getListTODOTaskNotes() {
        return listTODOTaskNotes;
    }

    public void setListTODOTaskNotes(String listTODOTaskNotes) {
        this.listTODOTaskNotes = listTODOTaskNotes;
    }

    public String getListIdealDateCompletedBy() {
        return listIdealDateCompletedBy;
    }

    public void setListIdealDateCompletedBy(String listIdealDateCompletedBy) {
        this.listIdealDateCompletedBy = listIdealDateCompletedBy;
    }

    @Override
    public String toString() {
        return "TODO Tasks: " + "\n" +
                "Task Notes: " + listTODOTaskNotes + "\n" +
                "Ideal Date Completed By: " + listIdealDateCompletedBy;
    }
}
