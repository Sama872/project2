/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author hp
 */
public class person2 extends person1{
    private String exam;
        
    public person2(String name, int birthdate,String exam) {
        super(name, birthdate);
        this.exam=exam;
    }
    public void doexam(){
        super.doExam();
        System.out.println("person2 name:"+getname());
        System.out.println("person2 birthdate:" + birthdate);
        System.out.println("exam name " + exam);
        
    }
        
}
