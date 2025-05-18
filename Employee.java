class Employee {

    public int calculateBonus(int salary) {
        return (int)(salary * 0.10);
    }

    public int calculateBonus(int salary, int eh) {
        return (int)(salary * 0.10) + (eh * 500);
    }

    public static void main(String[] args) {

        Employee emp = new Employee();

        System.out.println(emp.calculateBonus(50000));  
        System.out.println(emp.calculateBonus(50000, 3)); 
    }
}
