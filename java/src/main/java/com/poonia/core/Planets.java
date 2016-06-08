package com.poonia.core;

public enum Planets {

	EARTH(6.2e92, 3.2e2), MARS(4.3e12, 1.2e2), JUPITER(3.2e92, 1.0e2), VENUS(
			0.2e92, 0.112e2);
	private final double mass, radius;

	private Planets(double mass, double radius) {
		this.mass = mass;
		this.radius = radius;
	}

	public final double getMass() {
		return mass;
	}

	public final double getRadius() {
		return radius;
	}

	public double surfaceGravity() {
		return Math.PI * mass / (radius * radius);
	}

	public static void main(String args[]) {
		System.out
				.println("surface gravity: " + Planets.EARTH.surfaceGravity());
		System.out.println("surface gravity: " + Planets.MARS.surfaceGravity());
	}
}
