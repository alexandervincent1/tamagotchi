import java.util.Random;
import java.util.ArrayList;

public class tamagotchi {

    private int Hunger;
    private int Boredom;
    private ArrayList<String> Words = new ArrayList<>();
    private boolean IsAlive = true;
    private Random Generator;
    public String Name;
    
    public tamagotchi() {
        Words.add("Hej");
        Hunger = 0;
        Boredom = 0;
    }

    public void Feed() {
        if (Hunger >= 4) {
            Hunger = Hunger-4;
        }
            
        
        
    }

    public void Teach(String word) {
        Words.add(word);
        Reduceboredom();
    }

    public void Hi() {
        Random random = new Random(); 
        String randomWord = Words.get(random.nextInt(Words.size()));
        System.out.println(randomWord);
        Reduceboredom();
    }

    public void Tick() {
        Boredom++;
        Hunger++;
        if (Boredom <=6 && Hunger <= 6) {
            IsAlive = true;
        } else {
            IsAlive = false;
        }
    }

    public void PrintStats() {
        System.out.println(Name+ " boredom är "+Boredom + " och "+Name +" hunger är "+ Hunger);
    }

    public boolean GetAlive() {
        return IsAlive;
        
    }

    private void Reduceboredom() {
        if (Boredom >= 2) {
            Boredom= Boredom-2;
        }
        
    }
}