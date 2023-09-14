public class CodingHours {
    public static void main(String[] args) {
        int codeHours = 6*5*17;

        System.out.println("The attendee codes " + codeHours + "h per semester");

        double codePc = (codeHours/(52f*17f))*100;
        System.out.println("They spend " + codePc + "% of their work time with coding");
    }
}