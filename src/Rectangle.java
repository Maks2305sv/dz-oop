public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length<=0){
            System.err.println("error");
            return;
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width<=0){
            System.err.println("error");
            return;
        }
        this.width = width;
    }

    double calculateArea(){
        return length*width;
    }
}
