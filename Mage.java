package Abstract.Rpg-game;

import java.util.Random;

public class Mage extends Character{

    public Mage(String name){
        super(name);
    }

    public void attack(Character target){

        System.out.println("the Mage "+getName() + " casts his magic..!!");
        setStrength(13);
        int atc = getStrength();

        Random random  = new Random();
        int criticalHit = random.nextInt(10);

        if(criticalHit > 3){
            if(target.getLife() >0){
                target.setLife(getLife() - atc);
            }else{
                System.out.println("Character " + target.getName() + " is dead");
            }
        }else if(criticalHit >0 && criticalHit <=3){
              if(target.getLife() > 0){
                System.out.println("Bonus critical hit");    
                target.setLife(getLife()-(atc + criticalHit));                
            }else{
                System.out.println("Character " + target.getName() + " is dead");
                
            }
        }
      
       
    }

    public void defense(){
        System.out.println("the Mage defends..!!");
        setDefense(2);
        setLife(getDefense() + getLife());

    }

     @Override
    public void showStatus(){
        System.out.println("name: "+ getName() + " Life: "+ getLife() + " Strength: "+ getStrength() + " Defense: "+ getDefense());
          
    }
}
