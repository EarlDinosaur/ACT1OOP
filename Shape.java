package Activity1;

public class Shape {
    
    private int input1, input2;


    public Shape(){};

    public Shape(int tinput1, int tinput2) {
       
            this.input1 = tinput1;
            this.input2 = tinput2;
    };

    public void setinput1(int tinput1) {

        this.input1 = tinput1;

    }  

    public void setinput2( int tinput2) {
        this.input2 = tinput2;
    }   

    public int getinput1() {

        return this.input1;

    }  
  
    public int getinput2() {

        return this.input2;

    } 
}
