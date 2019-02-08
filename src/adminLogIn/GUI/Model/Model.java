/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminLogIn.GUI.Model;

import adminLogIn.BE.Student;
import adminLogIn.BLL.BLLManager;
import java.util.List;

/**
 *
 * @author Nijas Hansen
 */
public class Model {
    
    BLLManager bllMan = new BLLManager();
    
    public List<Student> getAllStudents() {
        return bllMan.getAllStudents();
    }
    
}
