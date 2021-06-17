package com.javaex.ex03;

public class Rectangle {

	int width;
	int height;
	
	public Rectangle() {
		super();
	}

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public boolean equals(Rectangle a) {
		if(this.width == ((Rectangle)a).width && this.height == ((Rectangle)a).height ){
			return true;
		}else {
			return false;
		}
	
	}
	
	
	
	
}
