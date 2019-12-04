package com.example.mvp_ex_2.vp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mvp_ex_2.R;
import com.example.mvp_ex_2.model.TaskReository;
import com.example.mvp_ex_2.model.domain.Task;

public class MainFragment extends Fragment implements IView {

    private MainPresenter presenter;
    private TextView TextView_title;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_main,container,false);
        TextView_title = rootView.findViewById(R.id.TextView_title);

        presenter = new MainPresenter();
        presenter.attachView(this);
        presenter.loadTask();

        return rootView;
    }

    @Override
    public void setTaskTitle(String titleToShow) {
        TextView_title.setText(titleToShow);
    }
}
