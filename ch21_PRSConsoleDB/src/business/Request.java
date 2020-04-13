package business;

public class Request {
    private int  id;
    private String userid;
    private String description;
    private String justification;
    private String dateneeded;
    private String deliverymode;
    private String status;
    private int total;
    private String datesubmitted;
    private String reasonforrejection;
	public Request() {
		super();
	}
	public Request(int id, String userid, String description, String justification, String dateneeded,
			String deliverymode, String status, int total, String datesubmitted, String reasonforrejection) {
		super();
		this.id = id;
		this.userid = userid;
		this.description = description;
		this.justification = justification;
		this.dateneeded = dateneeded;
		this.deliverymode = deliverymode;
		this.status = status;
		this.total = total;
		this.datesubmitted = datesubmitted;
		this.reasonforrejection = reasonforrejection;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
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
		return dateneeded;
	}
	public void setDateneeded(String dateneeded) {
		this.dateneeded = dateneeded;
	}
	public String getDeliverymode() {
		return deliverymode;
	}
	public void setDeliverymode(String deliverymode) {
		this.deliverymode = deliverymode;
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
		return datesubmitted;
	}
	public void setDatesubmitted(String datesubmitted) {
		this.datesubmitted = datesubmitted;
	}
	public String getReasonforrejection() {
		return reasonforrejection;
	}
	public void setReasonforrejection(String reasonforrejection) {
		this.reasonforrejection = reasonforrejection;
	}
	@Override
	public String toString() {
		return "Request [id=" + id + ", userid=" + userid + ", description=" + description + ", justification="
				+ justification + ", dateneeded=" + dateneeded + ", deliverymode=" + deliverymode + ", status=" + status
				+ ", total=" + total + ", datesubmitted=" + datesubmitted + ", reasonforrejection=" + reasonforrejection
				+ "]";
	}
    
}
