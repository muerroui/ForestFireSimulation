package model;
import java.awt.Color;

import constant.ConstantColor;

public class Rain extends WeatherObject {
	public static final Color LENS_COLOR = ConstantColor.COLOR_TRANSLUCENT_LENS_RAIN;
	public static final Color BORDER_COLOR = ConstantColor.COLOR_SOLID_BORDER_RAIN;
	
	public Rain(int x, int y, int radius, int duration) {
		super(x, y, radius, duration, 1);
	}
	
	public Color getLensColor() {
		return LENS_COLOR;
	}
	
	public Color getBorderColor() {
		return BORDER_COLOR;
	}
	
}
