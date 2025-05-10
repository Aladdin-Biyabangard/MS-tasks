package Lesson4.behavioralDesignPatterns.chainOfResponsibility;

public class EmailRequest {
    private String subject;
    private String content;


    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }

    public EmailRequest(String content, String subject) {
        this.subject = subject;
        this.content = content;
    }
}
