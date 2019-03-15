package com.example.employeedetailswithasynctaskapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, HttpRequestAsyncTask.OnAsyncInteractionListser{

    private Button employeeButton;
    private ProgressBar progressBar;
    private RecyclerView recyclerView;
    private EmployeeAdapter adapter;

    String url = "http://dummy.restapiexample.com/api/v1/employees";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        progressBar = findViewById(R.id.progress_circular);
        employeeButton = findViewById(R.id.employee_button);
        recyclerView = findViewById(R.id.recyclerView);

        adapter = new EmployeeAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        employeeButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        recyclerView.setVisibility(View.GONE);
        new HttpRequestAsyncTask(this).execute(url);
    }

    @Override
    public void onPreExecute() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void onPostExecute(List<Employee> result) {
        adapter.setEmployees(result);
        progressBar.setVisibility(View.GONE);
        recyclerView.setVisibility(View.VISIBLE);

    }
}
