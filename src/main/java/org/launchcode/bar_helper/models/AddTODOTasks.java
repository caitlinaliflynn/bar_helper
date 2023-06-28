package org.launchcode.bar_helper.models;

import java.util.Date;
import java.util.Objects;

public class AddTODOTasks {

    private enum todoTaskType {
        CLEANING,
        STOCKING,
        ROTATING,
        ORDERING,
        MISCELLANEOUS;
    }
    private String todoTaskName;

    private String todoTaskNotes;

    private Date desiredCompletionDate;

    public AddTODOTasks(String todoTaskName, String todoTaskDescription, Date desiredCompletionDate) {
        this.todoTaskName = todoTaskName;
        this.todoTaskNotes = todoTaskDescription;
        this.desiredCompletionDate = desiredCompletionDate;
    }

    public String getTodoTaskName() {
        return todoTaskName;
    }

    public void setTodoTaskName(String todoTaskName) {
        this.todoTaskName = todoTaskName;
    }

    public String getTodoTaskNotes() {
        return todoTaskNotes;
    }

    public void setTodoTaskNotes(String todoTaskNotes) {
        this.todoTaskNotes = todoTaskNotes;
    }

    public Date getDesiredCompletionDate() {
        return desiredCompletionDate;
    }

    public void setDesiredCompletionDate(Date desiredCompletionDate) {
        this.desiredCompletionDate = desiredCompletionDate;
    }

    @Override
    public String toString() {
        return "Name: " + todoTaskName + '\n' +
                "Notes: " + todoTaskNotes + '\n' +
                "Ideal Date Completed By: " + desiredCompletionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddTODOTasks that)) return false;
        return Objects.equals(getTodoTaskName(), that.getTodoTaskName()) && Objects.equals(getTodoTaskNotes(), that.getTodoTaskNotes()) && Objects.equals(getDesiredCompletionDate(), that.getDesiredCompletionDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTodoTaskName(), getTodoTaskNotes(), getDesiredCompletionDate());
    }
}
