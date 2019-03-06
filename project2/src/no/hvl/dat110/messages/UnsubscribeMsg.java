package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// TODO: 
	// Implement objectvariables, constructor, get/set-methods, and toString method
    private MessageType type;
    private String user;
    private String topic;

    public UnsubscribeMsg(String User, String Topic) {
        this.type = MessageType.DELETETOPIC;
        this.user = User;
        this.topic = Topic;
    }

    public String getTopic() {
        return topic;
    }

    @Override
    public MessageType getType() {
        return type;
    }

    @Override
    public String getUser() {
        return user;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Message [type=" + type + ", user=" + user + ", topic=" + topic + "]";
    }
}
