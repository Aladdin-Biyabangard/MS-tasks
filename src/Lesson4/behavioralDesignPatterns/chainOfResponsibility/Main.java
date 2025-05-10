package Lesson4.behavioralDesignPatterns.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        emailSender.sendEmail(new EmailRequest("bonus","Bonus emaili"));
        System.out.println("====================");
        emailSender.sendEmail(new EmailRequest("<script>","Bonus emaili"));
        System.out.println("====================");
        emailSender.sendEmail(new EmailRequest("discount","Bonus emaili"));
        System.out.println("====================");
        emailSender.sendEmail(new EmailRequest("Success","Bonus emaili"));
    }
}
