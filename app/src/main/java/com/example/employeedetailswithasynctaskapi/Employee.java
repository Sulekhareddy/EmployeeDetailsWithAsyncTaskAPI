package com.example.employeedetailswithasynctaskapi;

public class Employee {

        private String id;

        private String employeeName;

        private String employeeSalary;

        private String employeeAge;

        private String profileImage;

        public Employee(String employeeName, String employeeSalary){
            this.employeeName = employeeName;
            this.employeeSalary = employeeSalary;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        public String getEmployeeSalary() {
            return employeeSalary;
        }

        public void setEmployeeSalary(String employeeSalary) {
            this.employeeSalary = employeeSalary;
        }

        public String getEmployeeAge() {
            return employeeAge;
        }

        public void setEmployeeAge(String employeeAge) {
            this.employeeAge = employeeAge;
        }

        public String getProfileImage() {
            return profileImage;
        }

        public void setProfileImage(String profileImage) {
            this.profileImage = profileImage;
        }

}
