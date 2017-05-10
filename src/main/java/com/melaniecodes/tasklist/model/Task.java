package com.melaniecodes.tasklist.model;

import com.github.slugify.Slugify;

public class Task {


    private String slug;
    private String taskName;


    public Task(String taskName) {
        this.taskName = taskName;
        Slugify slugify = new Slugify();
        slug = slugify.slugify(taskName);
    }

    public String getTaskName() {
        return taskName;
    }

    public String getSlug() {
        return slug;
    }


}
