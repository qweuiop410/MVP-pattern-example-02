package com.example.mvp_ex_2.model;

import com.example.mvp_ex_2.model.domain.Task;

public interface ITaskRepository {
    Task getTask(int id);
}
