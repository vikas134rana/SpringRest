package springrest.demo.entity;

public class StudentErrorResponse {

	private int errorCode;
	private String message;
	private long timestamp;

	public StudentErrorResponse() {
	}

	public StudentErrorResponse(int errorCode, String message) {
		this.errorCode = errorCode;
		this.message = message;
		this.timestamp = System.currentTimeMillis();
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
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
		return "StudentErrorResponse [errorCode=" + errorCode + ", message=" + message + ", timestamp=" + timestamp + "]";
	}

}
