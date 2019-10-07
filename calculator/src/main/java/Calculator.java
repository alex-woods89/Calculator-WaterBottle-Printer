public class Calculator {

    private int int1;
    private int int2;
    private double double1;
    private double double2;

    public Calculator(int int1, int int2, double double1, double double2){
        this.int1 = int1;
        this.int2 = int2;
        this.double1 = double1;
        this.double2 = double2;
    }

    public int add(){
        return int1 + int2;
    }

    public int subtract(){
        return int1 - int2;
    }
    public int multiply(){
        return int1 * int2;
    }

    public double divide(){
        return double1 / double2;
    }


}
