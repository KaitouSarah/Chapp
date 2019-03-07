package no.hvl.dat110.messages;

public class PublishMsg extends Message {
	
	// TODO: 
	// Implement objectvariables, constructor, get/set-methods, and toString method
    String message;
    String topic;

    public PublishMsg(String usr, String topic, String message) {
        super(MessageType.PUBLISH, usr);
        this.message = message;
        this.topic = topic;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getTopic(){
        return topic;
    }
    @Override
    public String toString() {
        return "Publish message: " + message;
    }

}
