public class PrisonTest {
    public static void main(String[] args) {
        Prisoner bubba = new Prisoner();
        String bubbaName = "Bubba";
        String bubbaName2 ="Bubba";
        bubba.name= bubbaName;
        bubba.height=2.08;
        bubba.sentence=4;

        Prisoner twitch = new Prisoner();
        twitch.name= bubbaName2;
        twitch.height = 2.08;
        twitch.sentence=4;

        boolean impersonate = (twitch == bubba);
        System.out.println(impersonate);

        //same memory location
        bubba = twitch;
        impersonate = (twitch == bubba);
        System.out.println(impersonate);

        //results as false when using new keyword, results as true when not
        boolean nameCheck = bubbaName == bubbaName2;
        System.out.println(nameCheck);
    }


}
