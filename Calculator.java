class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        
        System.out.println(calc.add(5, 3));          
        System.out.println(calc.add(2.5, 3.7));        
        System.out.println(calc.add("Hello", "World"));
    }
}
