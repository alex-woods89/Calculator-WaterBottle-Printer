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
        if (paper > copies)
        { return this.paper - copies; }
        else {return this.paper;}
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
        if(toner > copies){
        return this.toner - this.copies;}
        else { return this.toner;}
    }

    public int printCopies(){
        return this.copies = 0;
    }


    }

