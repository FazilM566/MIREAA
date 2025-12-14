package ПР17;

public class TestE {
    public static void main(String[] args) {
        Employee model = pt();
        EmployeeView view = new EmployeeView();
        EmployeeContoller em = new EmployeeContoller(model,view);
        em.updateView();

        em.setEmployeeName("Vasif");
        em.setEmployeeZp(100000);
        em.updateView();

    }
    public static Employee pt(){
        Employee em = new Employee();
        em.setName("Noname");
        em.setZp(0);
        return em;
    }

}
