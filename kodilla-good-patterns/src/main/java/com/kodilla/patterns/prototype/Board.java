package com.kodilla.patterns.prototype;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class Board extends Prototype {
    String name;
    Set<TaskList> lists = new HashSet<>();

    public Board(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<TaskList> getLists() {
        return lists;
    }

    @Override
    public String toString() {
        String s = "Board [" + name + "]\n";
        for(TaskList list : lists) {
            s = s + list.toString() + "\n";
        }
        return s;
    }

    public Board shallowCopy() throws CloneNotSupportedException {
        return (Board)super.clone();
    }

    public Board deepCopy() throws CloneNotSupportedException {
        Board clonedBoard = (Board)super.clone();
        clonedBoard.lists = new HashSet<>();

        for(TaskList theList : this.lists) {
            TaskList clonedTaskList = new TaskList(theList.getName());

            for(Task task : theList.getTasks()) {
                clonedTaskList.getTasks().add(task);
            }
            clonedBoard.lists.add(clonedTaskList);
        }
        return clonedBoard;
    }
}
