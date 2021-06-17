package com.javaex.ex04;

public class Rectangle {

	int height;

	int width;

	public Rectangle() {

	}

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public boolean equals(Rectangle a) {
		if(this.width*this.height == ((Rectangle)a).width*((Rectangle)a).height ) {
			return true;
		}else {
			return false;
		}
	}
	
}
