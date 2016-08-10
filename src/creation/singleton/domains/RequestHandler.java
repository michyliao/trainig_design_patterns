package creation.singleton.domains;

public class RequestHandler {

	private volatile static RequestHandler handler;

	/**
	 * 
	 */
	public RequestHandler() {
		super();
	}

	public static RequestHandler getInstance() {
		if (handler == (null)) {
			synchronized (RequestHandler.class) { // locks it from sharing resources
				if (handler == null) {
					handler = new RequestHandler();
				}
			}
		}
		return handler;
	}
}
