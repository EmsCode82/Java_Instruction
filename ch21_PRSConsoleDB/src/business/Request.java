package business;

public class Request {
    private int  id;
    private String userId;
    private String description;
    private String justification;
    private String dateNeeded;
    private String deliveryMode;
    private String status;
    private int total;
    private String dateSubmitted;
    private String reasonForRejection;
	public Request() {
		super();
	}
	public Request(int id, String userid, String description, String justification, String dateneeded,
			String deliverymode, String status, int total, String datesubmitted, String reasonforrejection) {
		super();
		this.id = id;
		this.userId = userid;
		this.description = description;
		this.justification = justification;
		this.dateNeeded = dateneeded;
		this.deliveryMode = deliverymode;
		this.status = status;
		this.total = total;
		this.dateSubmitted = datesubmitted;
		this.reasonForRejection = reasonforrejection;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserid() {
		return userId;
	}
	public void setUserid(String userid) {
		this.userId = userid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getJustification() {
		return justification;
	}
	public void setJustification(String justification) {
		this.justification = justification;
	}
	public String getDateneeded() {
		return dateNeeded;
	}
	public void setDateneeded(String dateneeded) {
		this.dateNeeded = dateneeded;
	}
	public String getDeliverymode() {
		return deliveryMode;
	}
	public void setDeliverymode(String deliverymode) {
		this.deliveryMode = deliverymode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getDatesubmitted() {
		return dateSubmitted;
	}
	public void setDatesubmitted(String datesubmitted) {
		this.dateSubmitted = datesubmitted;
	}
	public String getReasonforrejection() {
		return reasonForRejection;
	}
	public void setReasonforrejection(String reasonforrejection) {
		this.reasonForRejection = reasonforrejection;
	}
	@Override
	public String toString() {
		return "Request [id=" + id + ", userid=" + userId + ", description=" + description + ", justification="
				+ justification + ", dateneeded=" + dateNeeded + ", deliverymode=" + deliveryMode + ", status=" + status
				+ ", total=" + total + ", datesubmitted=" + dateSubmitted + ", reasonforrejection=" + reasonForRejection
				+ "]";
	}
    
}
