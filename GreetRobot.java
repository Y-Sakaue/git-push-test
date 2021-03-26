public class GreetRobot {
    public static void sayHello(){
        System.out.println("Hello.");
    }
    public static void sayThank(){
        System.out.println("Thank you.");
    }
    public static void sayWelcome(){
        System.out.println("You are Welcome!");
    }

    public static void main(String[] args){

        String voiceOut = "Thanx";

        if(voiceOut=="Hello"){
            sayHello();
        }else if(voiceOut=="Thank you"||voiceOut=="Thanx")
        sayWelcome();
    }
}
