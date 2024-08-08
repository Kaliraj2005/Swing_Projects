package AWT_Swing_Projects;
import java.io.*;
import java.awt.*;
import java.lang.*;
public class Student_Management_Process extends Frame
{
    Student_Management_Process()
    {
        Label firstName = new Label("FIRST NAME");
        firstName.setBounds(20, 50, 80, 20);

        Label lastName = new Label("LAST NAME");
        lastName.setBounds(20, 80, 80, 20);

        Label dob = new Label("DATE-OF-BIRTH");
        dob.setBounds(20, 110, 80, 20);

        Label age = new Label("AGE");
        age.setBounds(20, 140, 80, 20);

        TextField firstNameTF = new TextField();
        firstNameTF.setBounds(120, 50, 100, 20);

        TextField lastNameTF = new TextField();
        lastNameTF.setBounds(120, 80, 100, 20);

        TextField dobTF = new TextField();
        dobTF.setBounds(120, 110, 100, 20);

        TextField ageTF = new TextField();
        ageTF.setBounds(120, 140, 100, 20);

        Button sbmt = new Button("SUBMIT");
        sbmt.setBounds(20, 200, 100, 30);

        Button reset = new Button("RESET");
        reset.setBounds(160, 200, 100, 30);

        Button cancel = new Button("CANCEL");
        reset.setBounds(180, 200, 100, 30);

        add(firstName);
        add(lastName);
        add(dob);
        add(age);
        add(firstNameTF);
        add(lastNameTF);
        add(dobTF);
        add(ageTF);
        add(sbmt);
        add(reset);
        add(cancel);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        Student_Management_Process awt = new Student_Management_Process();
    }
}

