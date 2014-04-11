package chat.bean;

public abstract class BaseBean {

	public enum Type {

	}

	private Type type;

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
