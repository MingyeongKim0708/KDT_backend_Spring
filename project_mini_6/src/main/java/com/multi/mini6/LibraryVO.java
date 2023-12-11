package com.multi.mini6;

public class LibraryVO {
	private String lib_code;
	private String lib_name;
	private int lib_region;
	private int lib_dtl_region;
	private String lib_address;
	private String lib_tel;
	private String lib_fax;
	private double lib_latitude;
	private double lib_longitude;
	private String lib_homepage;
	private String lib_closed;
	private String lib_operating_time;
	private int lib_bookcount;

	public String getLib_code() {
		return lib_code;
	}

	public void setLib_code(String lib_code) {
		this.lib_code = lib_code;
	}

	public String getLib_name() {
		return lib_name;
	}

	public void setLib_name(String lib_name) {
		this.lib_name = lib_name;
	}

	public int getLib_region() {
		return lib_region;
	}

	public void setLib_region(int lib_region) {
		this.lib_region = lib_region;
	}

	public int getLib_dtl_region() {
		return lib_dtl_region;
	}

	public void setLib_dtl_region(int lib_dtl_region) {
		this.lib_dtl_region = lib_dtl_region;
	}

	public String getLib_address() {
		return lib_address;
	}

	public void setLib_address(String lib_address) {
		this.lib_address = lib_address;
	}

	public String getLib_tel() {
		return lib_tel;
	}

	public void setLib_tel(String lib_tel) {
		this.lib_tel = lib_tel;
	}

	public String getLib_fax() {
		return lib_fax;
	}

	public void setLib_fax(String lib_fax) {
		this.lib_fax = lib_fax;
	}

	public double getLib_latitude() {
		return lib_latitude;
	}

	public void setLib_latitude(double lib_latitude) {
		this.lib_latitude = lib_latitude;
	}

	public double getLib_longitude() {
		return lib_longitude;
	}

	public void setLib_longitude(double lib_longitude) {
		this.lib_longitude = lib_longitude;
	}

	public String getLib_homepage() {
		return lib_homepage;
	}

	public void setLib_homepage(String lib_homepage) {
		this.lib_homepage = lib_homepage;
	}

	public String getLib_closed() {
		return lib_closed;
	}

	public void setLib_closed(String lib_closed) {
		this.lib_closed = lib_closed;
	}

	public String getLib_operating_time() {
		return lib_operating_time;
	}

	public void setLib_operating_time(String lib_operating_time) {
		this.lib_operating_time = lib_operating_time;
	}

	public int getLib_bookcount() {
		return lib_bookcount;
	}

	public void setLib_bookcount(int lib_bookcount) {
		this.lib_bookcount = lib_bookcount;
	}

	@Override
	public String toString() {
		return "LibraryVO [lib_code=" + lib_code + ", lib_name=" + lib_name + ", lib_region=" + lib_region
				+ ", lib_dtl_region=" + lib_dtl_region + ", lib_address=" + lib_address + ", lib_tel=" + lib_tel
				+ ", lib_fax=" + lib_fax + ", lib_latitude=" + lib_latitude + ", lib_longitude=" + lib_longitude
				+ ", lib_homepage=" + lib_homepage + ", lib_closed=" + lib_closed + ", lib_operating_time="
				+ lib_operating_time + ", lib_bookcount=" + lib_bookcount + "]";
	}

}
