package com.poonia.colletions.test;

import java.util.Timer;
public class Timers {
	Timer timer_1;
	Timer timer_2;
	public static void main(String args[]) {

		new Timers(1,5);

		}
	public Timers(int t1, int t2) {
		timer_1 = new Timer();

//		timer_1.schedule(new TaskMaster("Alpha"), t1 * 1000, t1 * 1000);

		 timer_1.scheduleAtFixedRate(new TaskMaster("Alpha"), t1 * 1000, t1 *
		 1000);

		timer_2 = new Timer();

		//timer_2.schedule(new TaskMaster("Delta"), t2 * 1000, t2 * 1000);

		 timer_2.scheduleAtFixedRate(new TaskMaster("Delta"), t2 * 1000, t2 *
		 1000);

	}

}
