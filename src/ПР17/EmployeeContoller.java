package ПР17;

public class EmployeeContoller {
    Employee model;
    EmployeeView view;

    public EmployeeContoller(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model.setName(name);
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setEmployeeZp(double zp) {
        model.setZp(zp);
    }

    public double getEmployeeZp() {
        return model.getZp();
    }

    public void updateView(){
        view.printEmployeeDetails(model.getName(), model.getZp());
    }
}
