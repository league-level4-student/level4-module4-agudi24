package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    protected int x;
    protected int y;
    protected int width = 50;
    protected int height = 50;
    int theta = 0;
    Polymorph(int x, int y){
   	 setX(x);
   	 setY(y);
    }
    
    

	public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
    int getX() {
    	return x;
    }
    int getY() {
    	return y;
    }
    int getWidth() {
    	return width;
    }
    int getHeight() {
    	return height;
    }
    void setX(int x) {
    	this.x = x;
    }
    void setY(int y) {
    	this.y = y;
    }
    void setWidth(int w) {
    	this.width = w;
    }
    void setHeight(int h) {
    	this.height = h;
    }
}
