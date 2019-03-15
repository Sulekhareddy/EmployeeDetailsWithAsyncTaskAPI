package com.example.employeedetailswithasynctaskapi;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class EmployeeViewHolder extends RecyclerView.ViewHolder {

    TextView employeeTextView;

    public EmployeeViewHolder(@NonNull View itemView) {
        super(itemView);
        employeeTextView = itemView.findViewById(R.id.employee);
    }

    public void bind(Employee employee) {

        employeeTextView.setText(employee.getEmployeeName());
    }
}
