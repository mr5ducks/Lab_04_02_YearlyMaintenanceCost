public class Main {

    public static void main(String[] args) {
        //all my doubles
        double springCost = 11.01;
        double summerCost = 40.56;
        double fallCost = 77.00;
        double winterCost = 5.00;
        double finalCost = 0;
        //code for sum wint spring fall
        finalCost = springCost + summerCost + fallCost + winterCost;
        System.out.println("You inputed your costs for spring, summer, fall, and winter");
        System.out.println("Your Spring Costs were= " + springCost);
        System.out.println("Your Summer Costs were= " + summerCost);
        System.out.println("Your Fall Costs were= " + fallCost);
        System.out.println("Your Winter Costs were= " + winterCost);
        //everything comes together here
        System.out.println("Your yearly cost for maintenance is= " + finalCost);
    }
}