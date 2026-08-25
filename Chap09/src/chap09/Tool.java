package chap09;
public class Tool {
	private String name;
	private boolean active;
	private int quantity;

	public String getName() {
		return name;
	}

	public boolean setName(String name) {
		if (name == null || name.isEmpty()) {
			return false;
		} else {
			this.name = name;
		}

		return true;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getQuantity() {
		return quantity;
	}

	public boolean setQuantity(int quantity) {
		if (quantity >= 0) {
			this.quantity = quantity;
		} else {
			return false;
		}
		return true;
	}
}