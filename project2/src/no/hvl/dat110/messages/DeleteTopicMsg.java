package no.hvl.dat110.messages;

public class DeleteTopicMsg extends Message {
	
	// DID:
	// Implement objectvariables, constructor, get/set-methods, and toString method
    String topic;

    public DeleteTopicMsg(String usr, String topic) {
        super(MessageType.DELETETOPIC, usr);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "Delete topic message: " + topic;
    }
}
