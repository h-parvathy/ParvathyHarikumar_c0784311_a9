import javax.swing.*;

public class CommissionCalculator {
    protected int id;
    protected String name;
    protected double sales; // Salesperson's total monthly sale
    protected double rate; // Salespersons commision rate
    protected double commission; // Commision
    protected double advance; // advance drawn
    protected double pay; // gross pay

    public CommissionCalculator(int id, String name, double sales, double advance) {
        this.id = id;
        this.name = name;
        this.sales = sales;
        this.advance = advance;
    }


    public double getPay() { return pay;  }


    public void calcPay(){
        if(this.sales< 10000.00){
            this.rate = 0.05;
        }else if(this.sales>=10000 && this.sales <= 14999){
            this.rate = 0.10;
        }else if(this.sales >= 15000 && this.sales <= 17999){
            this.rate = 0.12;
        }else if(this.sales>=18000 && this.sales <= 21999){
            this.rate = 0.15;
        }else if(this.sales>=22000)
            this.rate = 0.16;

        this.commission = this.rate*this.sales;
        this.pay = this.commission - this.advance;
    }
}
