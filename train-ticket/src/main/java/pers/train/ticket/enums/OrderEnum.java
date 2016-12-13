package pers.train.ticket.enums;

public enum OrderEnum {
	PAID(1, "已支付"), NO_PAID(2, "未支付"), CANCEL(3, "已取消"), HAS_ENDORSED(4, "已改签");
	private int index;
	private String info;

	private OrderEnum(int index, String info) {
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

	public static OrderEnum getInfos(int index) {
		for (OrderEnum enums : values()) {
			if (enums.getIndex() == index) {
				return enums;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(OrderEnum.getInfos(3).getInfo());
	}
}
