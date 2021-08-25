package staff;

public abstract class Employee {

    private String name;
    private int niNumber;
    private int salary;

    public Employee(String name, int niNumber, int salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;

    }
    public String getName(){
        return name;
    }
    public int getNiNumber(){
        return niNumber;
    }

}

