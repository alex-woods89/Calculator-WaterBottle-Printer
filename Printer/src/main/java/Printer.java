public class Printer {

    private int paper;
    private int toner;
    private int copies;

    public Printer( int paper, int toner, int copies){
        this.paper = paper;
        this.copies = copies;
        this.toner = toner;
    }

    public int getPaper(){
        return this.paper;
    }

    public int reducePaper(){
        return this.paper - copies;
    }

    public String checkPaper(){
       if (copies > paper){
           return "not enough paper";
       } else {
           return "You have enough paper";
       }
    }

    public int getToner(){
        return this.toner;
    }

    public int reduceToner(){
        return this.toner - this.copies;
    }

    public int printCopies(){
        return this.copies = 0;
    }


    }

