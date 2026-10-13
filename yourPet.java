import java.util.*;


public class yourPet {
    public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);
            String color = userInput.nextLine().toLowerCase();
            String season = userInput.nextLine().toLowerCase();
            String name = userInput.nextLine().toLowerCase();
            String pet;
            System.out.println(" Not Case Sensitive | Valid Colors: Blue, Green, Red | Valid Seasons: Fall, Winter, Spring Summer" );
            if (name != null){
                if ((color().equals("blue") || color().equals("green") || color().equals("red")) && (season().equals("fall") || season().equals("winter") ||season().equals("spring") || season().equals("summer")))
            {
                if (color().equals("blue") && season().equals("fall"))
                {
                    pet = "alligator";
                }
                else if (color().equals("blue") && season().equals("spring"))
                {
                    pet = "ostrich";
                }
                else if (color().equals("green") && season().equals("spring"))
                {

                }
            }
            }
            
            else{
                System.out.println("Please Enter a Valid Input from the Selection Above");
            }
                
    }
}

/* Those who prefer blue as a color and whose favorite season is fall should receive an alligator as their pet.
Those who prefer blue as a color and whose favorite season is spring should receive an ostrich as their pet.
If you like green as a color and your name starts with a consonant and your favorite season is winter you should get a giraffe.
If you like green and your favorite season is anything other than fall then a dog is right for you, unless you already got a giraffe.
Anyone who prefers red should receive a panda, unless their name starts with a vowel, then they should get a porcupine.
Ponies are perfect for those who like summer, unless of course they are already getting a dog or a panda or a porcupine.
Those whose name starts with a consonant and who like blue and whose favorite season is neither summer nor fall should be getting an axolotl, unless they’ve already gotten an ostrich 
Anyone who hasn’t qualified for one of the pets above should receive a pet rock.

*/