import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        tamagotchi tama = new tamagotchi();
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Välj namn på din tamagotchi");
        tama.Name = tangentbord.nextLine();
        while (tama.GetAlive()) {
            tama.PrintStats();
            System.out.println(
                    "\n1.Lär ett nytt ord.\n2.Hälsa på din tamagotchi.\n3.Mata din tamagotchi.\n4.Gör ingeting");
            int val = tangentbord.nextInt();
            int kok = 1;

            if (val == 1) {
                System.out.println("Vad för ord vill du lära " + tama.Name);
                String nyttOrd = tangentbord.nextLine();
                nyttOrd = tangentbord.nextLine();
                tama.Teach(nyttOrd);
            }

            if (val == 2) {
                tama.Hi();
            }

            if (val == 3) {
                tama.Feed();
                System.out.println("Nu har du matat "+tama.Name+" och "+tama.Name+" är nöjd");
            }

            if (val == 4) {
                tama.Tick();
            }
        }
    }
}
