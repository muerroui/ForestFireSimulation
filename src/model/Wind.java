package model;
import java.awt.Color;

import constant.ConstantColor;

public class Wind extends WeatherObject {
	public static final Color LENS_COLOR = ConstantColor.COLOR_TRANSLUCENT_LENS_WIND;
	public static final Color BORDER_COLOR = ConstantColor.COLOR_SOLID_BORDER_WIND;
	
	public Wind(int x, int y, int radius, int duration) {
		super(x, y, radius, duration, 2);
	}
	
	public Color getLensColor() {
		return LENS_COLOR;
	}
	
	public Color getBorderColor() {
		return BORDER_COLOR;
	}
}
