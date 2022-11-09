package lsp;

public class Square implements Shape {

    private int width;
    private int height;

    Square(int side) {
        this.setSide(side);
    }

    public int getArea(){
        return this.width * this.height;
    }
    

    public void setWidth(int width){
        this.setSide(width);

        
    }
  
    public void setHeight(int height){
        this.setSide(height);


    }
  
    public int getWidth(){
        return width;
    }
  
    public int getHeight(){
        return height;
    }
  
    public void setSide(int side){
        this.width = side;
        this.height = side;
    }
    
}
