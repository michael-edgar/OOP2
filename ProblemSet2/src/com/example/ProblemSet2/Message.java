package com.example.ProblemSet2;

public class Message {
    private String sender;
    private String recipient;
    private String message;

    public void setSender(String sender)
    {
        this.sender = sender;
    }//End of setSender

    public void setRecipient(String recipient)
    {
        this.recipient = recipient;
    }//End of setRecipient

    public void setMessage(String message)
    {
        this.message = message;
    }//End of setMessage

    public String getSender()
    {
        return sender;
    }//End of getSender

    public String getRecipient()
    {
        return recipient;
    }//End of getRecipient

    public String getMessage()
    {
        return message;
    }//End of getMessage

    public Message()
    {
        this("James O' Donoghue", "Gouch Cooper", ".........");
    }//End of default Message set

    public Message(String sender, String recipient, String message)
    {
        setSender(sender);
        setRecipient(recipient);
        setMessage(message);
    }//End of Message set

    public String toString() {
        return String.format("From: %-30s \nTo: %-30s \nMessage %-30s\n", sender, recipient, message);
    }//End of toString
}//End of Message Class
