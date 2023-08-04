class Employee {
    float salary;
    String name;

    Employee() {
    }

    Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Salary of "+name + " : " + salary);
    }

    float getBonus(float bonus) {
        return salary + ((salary * bonus) / 100) * 12;
    }
}
public class Main {
    public static void main(String[] args) {
        Employee[] emp = new Employee[10];

        emp[0] = new Employee("Ali", 220000f);
        emp[1] = new Employee("Akram", 120000f);
        emp[2] = new Employee("Arif", 420000f);
        emp[3] = new Employee("Aslam", 720000f);
        emp[4] = new Employee("Akash", 920000f);


        emp[5] = new Employee();
        emp[6] = new Employee();
        emp[7] = new Employee();
        emp[8] = new Employee();
        emp[9] = new Employee();


        emp[5].name = "Kiran";
        emp[5].salary = 2000f;
        emp[6].name = "Zara";
        emp[6].salary = 3000f;
        emp[7].name = "Jafar";
        emp[7].salary = 2500f;
        emp[8].name = "Kamran";
        emp[8].salary = 3500f;
        emp[9].name = "Shahid";
        emp[9].salary = 2700f;

///////////////////////////////////// Total Result

        for (int i = 0; i < 10; i++) {
            System.out.println("Employee = "+i);
            emp[i].display();
            float bonusPercentage = 10; // example: 10% bonus
            float bonus = emp[i].getBonus(bonusPercentage);
            System.out.println("Employee bonus = " + bonus);
            System.out.println(".....................");
            System.out.println();
        }


    }
}
