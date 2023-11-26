package Activity1;

public class Square extends Shape {
    
    private int results;

    public Square() {}  

    public Square(int tinput1, int tinput2, int tresults) {
        super(tinput1, tinput2);

        this.results = tresults;
    }

    public void setresults(int tinput1)
    {
        this.results = (tinput1*tinput1);
    }



    public String getresults() {

        return "Sides length of the square:" + super.getinput1() +"/n"
             + "The Area of the square:" + this.results;
       
    } 



}




