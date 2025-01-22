package OopsConcept.Encapsulation;

public class EncapsulationExample{

    public String EmpName = "Aman"; // Accessible outside the class
    //public int EmpSalary = 10000;
    private int EmpSalary = 10000; // Not able access outside the class

    // getter method
    public String getEmpName(){
        return EmpName;
    }
    //Setter Method
    public void setEmpName(String empName){
        EmpName = empName;

    }

    public int getEmpSalary(String designation){
        if(designation.equals("HR")||designation.equals("Manager")){
        return EmpSalary;
        }
        else{
            return 0;
        }
    }

    public void setEmpSalary(int empSalary){
        EmpSalary = empSalary;

    }

}