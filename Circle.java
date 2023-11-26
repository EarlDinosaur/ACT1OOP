package Activity1;

public class Circle extends Shape {
    private double results;
    private int diameter;

    double pie = 3.14;


    public Circle() {}  

    public Circle(int tinput1, int tinput2, int tresults) {
        super(tinput1, tinput2);

        this.results = tresults;
    }

    public void setDiameter(int tinput1)
    {
        this.diameter = tinput1*2;
    }

    public void setresults() 
    {
        this.results = (this.diameter*pie);
    }

    public String getresults() {

        return "Sides length of the square:" + super.getinput1() +"/n"
             + "The Area of the square:" + this.results;

    } 
}
