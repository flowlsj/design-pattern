package com.lsj.basic;


class Soldier
{
	String name;
	int hurt;
	static String team_leader;
	
	static
	{
		team_leader = "lsj";
		System.out.println("Static block");
	}
	
	public Soldier()
	{
		name = "Louis";
		hurt = 100;
//		team_leader = "Louis";
		System.out.println("Constructor");
	}
	
	public void show()
	{
		System.out.println(name + ", " + hurt + ", " + team_leader);
	}
}


public class StaticDemo {
	public static void main(String[] args) {
		
		Soldier louis = new Soldier();
		louis.show();
	}

}
