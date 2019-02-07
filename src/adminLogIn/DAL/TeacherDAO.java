/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminLogIn.DAL;

import adminLogIn.BE.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nijas Hansen
 */
public class TeacherDAO implements TeacherDAOMock{
    
    List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        return getAllStudents();
    }
    
}
