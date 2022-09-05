package com.company;

public class Students {
    private String studentName, studentClass, studentAge;
    private int age,  amountBooksPaid, amountBooksPayable;
    private boolean booksPaid, allFeesPaid;
    private StudentBooks studentBooks;
    private Fees studentFees;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public int getAmountBooksPaid() {
        return amountBooksPaid;
    }

    public void setAmountBooksPaid(int amountBooksPaid) {
        this.amountBooksPaid = amountBooksPaid;
    }

    public int getAmountBooksPayable() {
        return amountBooksPayable;
    }

    public void setAmountBooksPayable(int amountBooksPayable) {
        this.amountBooksPayable = amountBooksPayable;
    }

    public boolean isBooksPaid() {
        return booksPaid;
    }

    public void setBooksPaid(boolean booksPaid) {
        this.booksPaid = booksPaid;
    }

    public boolean isAllFeesPaid() {
        return allFeesPaid;
    }

    public void setAllFeesPaid(boolean allFeesPaid) {
        this.allFeesPaid = allFeesPaid;
    }
}
