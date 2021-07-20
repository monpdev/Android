package monp.example.learnjava;

public class JavaObjectsAsMethodParameters {
    public static void main(String[] args){
        Employer bank = new Employer();

        Employee Jenna = new Employee("Jenna","Lasson",
                324587,"HR","Recruiter",4500);

        Employee Lance = new Employee("Lance","Cambell",
                324537,"IT","IT Support",5000);

        bank.calculateAnnualBonus(Jenna);
    }
}
