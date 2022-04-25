public class TestEmployee {


    public static void main(String[] args) {
        Employee e1, e2, e3, e4;
        e1 = new Employee(100, "Nupi");
        e2 =e1;
        e4 = new Employee(200, "Eda");
        e3=e4;
        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e4.emp_name="Eren";
        e4.emp_no=300;
        e3.display();
        e4.display();
        e4 = new Employee(400, "Lana");
        e3.display();


    }
}
