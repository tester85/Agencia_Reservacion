package cu.desoft.desarrollo.model;

import org.springframework.http.HttpStatus;

public class HttpResponse {
	
	private int httpStatusCode; //200,201,400,500
	
	private HttpStatus httpStatus; 	
	private String reason;
	private String message;

	public HttpResponse() {}  	
	
	public HttpResponse(int httpStatusCode, HttpStatus httpStatus, String reason, String message) {
		//super();
		this.httpStatusCode = httpStatusCode;
		this.httpStatus = httpStatus;
		this.reason = reason;
		this.message = message;
	}  
	/**
	 * @return the httpStatusCode
	 */
	public int getHttpStatusCode() {
		return httpStatusCode;
	}
	/**
	 * @param httpStatusCode the httpStatusCode to set
	 */
	public void setHttpStatusCode(int httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}
	/**
	 * @return the httpStatus
	 */
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	/**
	 * @param httpStatus the httpStatus to set
	 */
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	

	

}
