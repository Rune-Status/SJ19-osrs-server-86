package guthix.net.message;

/**
 * Created by Bart Pelle on 8/22/2014.
 */
public class Js5DataRequest {

	private int index;
	private int container;
	private boolean priority;

	public Js5DataRequest(int index, int container, boolean priority) {
		this.index = index;
		this.container = container;
		this.priority = priority;
	}

	public int index() {
		return index;
	}

	public int container() {
		return container;
	}

	public boolean priority() {
		return priority;
	}

}
