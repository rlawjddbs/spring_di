package kr.co.sist.vo;

public class EmpVo {
	private int empno;
	private String ename;
	
	public EmpVo(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
} // class
