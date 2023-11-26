package Activity1;

public class Rectangle extends Shape {
    
    private int results;

    public Rectangle() {}  

    public Rectangle(int tinput1, int tinput2, int tresults) {
        super(tinput1, tinput2);

        this.results = tresults;
    }

    public void setresults(int tinput1, int tinput2) 
    {
        this.results = (tinput1*tinput2);
    }



    public String getresults() {

        return "length of the rectangle:" + super.getinput1() +"/n"
             + "width of the rectangle:" + super.getinput2() +"/n"
             + "The Area of the square:" + this.results;

    } 
}

