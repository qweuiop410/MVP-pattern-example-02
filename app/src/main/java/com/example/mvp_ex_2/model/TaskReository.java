package com.example.mvp_ex_2.model;

import com.example.mvp_ex_2.model.domain.Task;

import java.util.HashMap;

public class TaskReository implements ITaskRepository{

    private static TaskReository instance;
    private HashMap<Integer, Task> tasks = new HashMap<>();

    private TaskReository()
    {

    }

    public static TaskReository getInstance()
    {
        if (null == instance)
            instance = new TaskReository();
        return instance;
    }

    public void insert()
    {}

    @Override
    public Task getTask(int id)
    {
        Task task = new Task();
        task.setTitle("title~");
        task.setContent("Content");
        return task;
    }

}
