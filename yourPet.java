import java.util.*;


public class yourPet {
    public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter a Color | Valid Colors: Blue, Green, Red");
            String color = userInput.nextLine().toLowerCase();
            String season; 
            String name;
            String pet = null;
            String consonants = "bcdfghjklmnpqrstvwxyz";
            String vowels = "aeiou";
            if (color.equals("blue") || color.equals("green") || color.equals("red"))
            {
                System.out.println("Enter a Season | Valid Seasons: Fall, Winter, Spring, Summer");
                season = userInput.nextLine().toLowerCase();
            }
            else{
                System.out.println("That is not a valid color | Valid Colors: Blue, Green, Red");
                return;
            }
            
            if (season.equals("fall") || season.equals("winter") ||season.equals("spring") || season.equals("summer"))
            {
                System.out.println("Enter Your Name");
                 name = userInput.nextLine().toLowerCase();
            }
            else{
                System.out.println("That is not a season | Valid Seasons: Fall, Winter, Spring, Summer");
                return;
            }
            
           
            
            
            for (int i = 0; i <= name.length()-1; i++)
            {
                 if ("abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(i, i + 1).toLowerCase()) >= 0){
                    if (color.equals("blue") && season.equals("fall"))
                    {
                        pet = "alligator";
                        System.out.println(pet);
                        return;
                    }
                    if (color.equals("blue") && season.equals("spring"))
                    {
                        pet = "ostrich";
                        System.out.println(pet);
                        return;
                    }

            for (int c = 0; c == 0; c++)
            {
                if (consonants.indexOf(name.substring(0,1).toLowerCase()) >= 0 && color.equals("green") && season.equals("winter"))
                {
                    
                    pet = "giraffe";
                    System.out.println(pet);
                    return;
                    
                    
                    
                }
                else if (color.equals("green") && (season.equals("winter") || season.equals("spring") || season.equals("summer")))
                    
                    pet = "dog";
                    System.out.println(pet);
                    return;
                }
            }
            for (int v = 0; v == 0; v++)
            {
                if (color.equals("red"))
                {
                    pet = "panda";
                    System.out.println(pet);
                    return;
                }
                else if (vowels.indexOf(name.substring(0,1).toLowerCase()) >= 0)
                {
                    pet = "porcupine";
                    System.out.println(pet);
                    return;
                }

            }
                
                     
                    
                    
                    
                    
                    
                    
                   
                }
                //else{
                   // System.out.println("Please Enter a Valid Name");
                 //   return;
                //}
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