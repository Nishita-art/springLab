package com.capg.sbu;

public class Sbu {

	private int sbuId;
	private String sbuName;
	private String sbuHead;
	
	public int getSbuId() {
		return sbuId;
	}

	public String getSbuName() {
		return sbuName;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}

	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}

	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SBU [sbuId=").append(sbuId).append(", sbuName=").append(sbuName).append(", sbuHead=")
				.append(sbuHead).append("]");
		return builder.toString();
	}

}
