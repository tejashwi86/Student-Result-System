public class Student {
    int id;
    String name;
    int m1,m2,m3;
    double percentage;
    int total;
    char grade;
    void calculate()
    {
        total=m1+m2+m3;
        percentage=total/3.0;
        if(percentage>=90)
            grade='A';
        else if (percentage>=75)
            grade='B';
        else if(percentage>=60)
            grade='C';
        else grade='F';
    }
}