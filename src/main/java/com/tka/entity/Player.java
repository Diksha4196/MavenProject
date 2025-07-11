package com.tka.entity;

public class Player {
	private int pid;
	private int jn;
	private String name;
	private int runs;
	private int wk;
	private String tname;
	
	
	public Player() {
		super();
	}
	public Player(int pid, int jn, String name, int runs, int wk, String tname) {
		super();
		this.pid = pid;
		this.jn = jn;
		this.name = name;
		this.runs = runs;
		this.wk = wk;
		this.tname = tname;
		
		
		
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getJn() {
		return jn;
	}
	public void setJn(int jn) {
		this.jn = jn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWk() {
		return wk;
	}
	public void setWk(int wk) {
		this.wk = wk;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Player [pid=" + pid + ", jn=" + jn + ", name=" + name + ", runs=" + runs + ", wk=" + wk + ", tname="
				+ tname + "]";
	}
	
	
	
	
	

}
