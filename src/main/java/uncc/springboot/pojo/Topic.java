package uncc.springboot.pojo;

public class Topic {
	
	private int id;
	private String topic;
	private String description;
	
	public Topic(int id, String topic, String description) {
		super();
		this.id = id;
		this.topic = topic;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
