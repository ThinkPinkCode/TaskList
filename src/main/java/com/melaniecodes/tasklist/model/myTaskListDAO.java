package com.melaniecodes.tasklist.model;

import org.omg.CosNaming.NamingContextPackage.NotFound;

import java.util.ArrayList;
import java.util.List;

public class myTaskListDAO implements TaskListDAO {

    private List<Task> tasks;

    public myTaskListDAO() {
        tasks = new ArrayList<>();
    }


    @Override
    public boolean add(Task task) {
        //returns true if collection changed, false if it stayed the same
        return tasks.add(task);
    }

    @Override
    public List<Task> findAll() {
        return new ArrayList<>(tasks);
    }

    @Override
    public Task findBySlug(String slug) {
        return tasks.stream()
                .filter(task -> task.getSlug().equals(slug))
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }
}
