package springrest.crm.entity;

public class CustomerErrorResponse {

	private int statusCode;
	private String message;
	private long timestamp;

	public CustomerErrorResponse() {
	}

	public CustomerErrorResponse(int statusCode, String message) {
		this.statusCode = statusCode;
		this.message = message;
		this.timestamp = System.currentTimeMillis();
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "CustomerErrorResponse [statusCode=" + statusCode + ", message=" + message + ", timestamp=" + timestamp + "]";
	}

}
