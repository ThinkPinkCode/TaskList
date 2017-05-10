package com.melaniecodes.tasklist.model;

import java.util.List;

public interface TaskListDAO {
    boolean add(Task task);

    List<Task> findAll();

    Task findBySlug(String slug);
}
