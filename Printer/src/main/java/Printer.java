public class Printer {

    private int paper;
    private int toner;

    public Printer( int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper(){
        return this.paper;
    }

    public int canPrint(){
        return this.paper - 1;
    }
}
