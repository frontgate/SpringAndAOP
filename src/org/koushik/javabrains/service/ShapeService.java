package org.koushik.javabrains.service;

import org.koushik.javabrains.model.Circle;
import org.koushik.javabrains.model.Rectangle;

public class ShapeService {
	private Circle circle;
	private Rectangle rectangle;
	
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Rectangle getRectangle() {
		return rectangle;
	}
	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	
	
}
