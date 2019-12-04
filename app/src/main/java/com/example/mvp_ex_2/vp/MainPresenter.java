package com.example.mvp_ex_2.vp;

import com.example.mvp_ex_2.model.ITaskRepository;
import com.example.mvp_ex_2.model.TaskReository;
import com.example.mvp_ex_2.model.domain.Task;

public class MainPresenter {

    private IView view;
    private ITaskRepository taskRepository;

    public void attachView(IView view) {
        this.view = view;
        this.taskRepository = TaskReository.getInstance();
    }

    public void loadTask() {
        Task task = taskRepository.getTask(1);
        String titleToShow = task.getTitle() + "입니다.";
        view.setTaskTitle(titleToShow );
    }
}
