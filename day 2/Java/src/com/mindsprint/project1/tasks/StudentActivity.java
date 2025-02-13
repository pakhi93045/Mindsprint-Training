package com.mindsprint.project1.tasks;

public class StudentActivity {
    String name;
    int[] grades;

    public StudentActivity(String name,int[] grades){
        this.name = name;
        this.grades = grades;
    }

    public double CalculateAverage(){
        if(grades.length == 0){
            return 0;
        }
        int sum = 0;
        for(int grade:grades){
            sum+=grade;
        }
        return (double) sum/grades.length;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Average Grade: "+CalculateAverage());
    }

    public static void main(String[] args) {
        int grades[] = {90, 95, 97, 97, 98, 99};
        StudentActivity s2 = new StudentActivity("Pragya", grades);
        s2.display();
    }

}
