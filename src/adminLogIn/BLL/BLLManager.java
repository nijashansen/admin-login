/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminLogIn.BLL;

import adminLogIn.BE.Student;
import adminLogIn.BE.Teacher;
import adminLogIn.DAL.TeacherDAO;
import java.util.List;

/**
 *
 * @author Nijas Hansen
 */
public class BLLManager{
    
    TeacherDAO teachDAO = new TeacherDAO();

    
    public List<Student> getAllStudents() {
        return getAllStudents();
    }

    public String getTeacherID(Teacher teacher) {
        return teacher.getTeacherID();
    }

    
    public String getTeacherPassword(Teacher teacher) {
        return teacher.getPassword();
    }

    public Teacher generateTeachers() {
        return teachDAO.generateTeachers();
    }
    
    
    
}
