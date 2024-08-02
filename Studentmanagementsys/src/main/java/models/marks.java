package models;

public class marks {

	private String pinnumber;
	private int cns;
	private int bda;
	private int ml;
	private int ads;
	private int swm;
	private int ipr;
	
	public String getpinnumber() {
		return pinnumber;
	}
	public void setpinnumber(String pinnumber) {
		this.pinnumber = pinnumber;
	}
	
	public int getcns() {
		return cns;
	}
	public void setcns(int cns) {
		this.cns = cns;
	}
	
	public int getbda() {
		return bda;
	}
	public void setbda(int bda) {
		this.bda = bda;
	}
	
	public int getml() {
		return ml;
	}
	public void setml(int ml) {
		this.ml = ml;
	}
	
	public int getads() {
		return ads;
	}
	public void setads(int ads) {
		this.ads = ads;
	}
	
	public int getswm() {
		return swm;
	}
	public void setswm(int swm) {
		this.swm = swm;
	}
	
	public int getipr() {
		return ipr;
	}
	public void setipr(int ipr) {
		this.ipr = ipr;
	}
	
	public marks(String pinnumber,int cns,int bda,int ml,int ads,int swm,int ipr) {
		super();
		this.pinnumber = pinnumber;
		this.cns = cns;
		this.bda = bda;
		this.ml = ml;
		this.ads = ads;
		this.swm = swm;
		this.ipr = ipr;
	}
	
	public marks() {
		super();
	}
}
