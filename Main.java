public class Main {
    public static void main(String[] args) {

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Mykhailo", "Developer", "abcd@gmail.com",
                "+49178312104", 5000, 24);
        employeesArray[1] = new Employee("Andriy", "Designer", "efgh@gmail.com",
                "+49178312105", 4000, 43);

        employeesArray[2] = new Employee("Vladislav", "HR", "ijkl@gmail.com",
                "+49178312106", 3500, 30);
        employeesArray[3] = new Employee("Roman", "DevOps", "mnop@gmail.com",
                "+49178312107", 6500, 48);

        employeesArray[4] = new Employee("Valeria", "Team Leader", "qrst@gmail.com",
                "+49178312108", 6000, 28);

        for(int i =0; i < employeesArray.length; i++){
            if (employeesArray[i].getAge() > 40){
                System.out.println(employeesArray[i]);
            }
        }
    }

}