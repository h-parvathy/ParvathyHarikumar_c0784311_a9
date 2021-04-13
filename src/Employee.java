import javax.swing.*;

public class Employee {
    public static void main(String[] args) {
        JFrame input;
        input=new JFrame();

        int id = Integer.parseInt(JOptionPane.showInputDialog(input, "Enter Employee ID:"));
        String name = JOptionPane.showInputDialog(input, "Enter Employee Username:");
        double sales = Double.parseDouble(JOptionPane.showInputDialog(input, "Enter sales made this month"));
        double advance = Double.parseDouble(JOptionPane.showInputDialog(input, "Enter advance taken this month:"));

        CommissionCalculator calculator = new CommissionCalculator(id,name,sales,advance);
        calculator.calcPay();

        if (!(calculator.getPay()<0)) {
            JOptionPane.showMessageDialog(input,"Salary of "+name + " is "+ calculator.getPay());
        } else
            JOptionPane.showMessageDialog(input,name + " need to reimburse "+ calculator.getPay()+
                    "$ to the company");

    }
}
