package pers.train.ticket.enums;

public enum ResiduesEnum {
	BUSINESS_SEAT(1, "商务座"), FIRST_SEAT(2, "一等座"), SECOND_SEAT(3, "二等座"), NO_SEAT(4, "无座");
	private int index;
	private String info;

	private ResiduesEnum(int index, String info) {
		this.index = index;
		this.info = info;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public static ResiduesEnum getInfos(int index) {
		for (ResiduesEnum enums : values()) {
			if (enums.getIndex() == index) {
				return enums;
			}
		}
		return null;
	}
}
