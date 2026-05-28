import java.util.Scanner;

interface Billable{
    double calculateTotal();
}
class bill_genrator implements Billable{
    private String customer_name;
    private double current_unit;
    private double pre_units;
    private double consumed_units;
    private double total_Amount;

    public bill_genrator(String customer_name,double current_unit,double pre_units){
        this.customer_name=customer_name;
        this.current_unit=current_unit;
        this.pre_units=pre_units;
        this.consumed_units=current_unit-pre_units;
    }
    public double calculateTotal(){
        double units=consumed_units;
        total_Amount=0;
        if (units<=100){
            total_Amount=units*1;
        } else if (units<=300) {
            total_Amount=(100*1) + ((units-100)* 2);

        } else {
            total_Amount=(100*1)+(200*2)+((units-300)*5);
        }
        return  total_Amount;
    }

    public void  print_receipt(){
        double final_amount= calculateTotal();
        System.out.println("\n====== SMARTPAY RECEIPT ======");
        System.out.println("Customer Name  : "+ customer_name);
        System.out.println("Units Consumed : "+ consumed_units);
        System.out.println("Tax Amount     : Included in slab rates");
        System.out.println("Final_Amount   : "+ final_amount);
    }

}
public class Smartpay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Please Enter Consumer Name ( Or Enter Exit To Quit The Application) : ");
            String name=sc.nextLine();
            if (name.equalsIgnoreCase("Exit")){
                break;
            }
            try {
                System.out.println("Please Enter Current Units :");
                double curr_unit=sc.nextDouble();
                System.out.println("Please Enter Previous Units :");
                double pre_units=sc.nextDouble();

                sc.nextLine(); // it remove left over space for other looping

                if (curr_unit<pre_units){
                    System.out.println("Previous Reading Cannot Be Greater Than Current Reading ");
                    continue;
                }

                bill_genrator bill=new bill_genrator(name,curr_unit,pre_units);
                bill.print_receipt();
            }
            catch (Exception e){
                System.out.println("Invalid input! Please enter correct values.");
                sc.nextLine(); // buffer cleaning.
            }
        }

    }
}
