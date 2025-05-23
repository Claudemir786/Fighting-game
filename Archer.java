package Abstract.Rpg-game;


import java.util.Random;

public class Archer extends Character {
    
    public Archer(String nome){
        super(nome);
    }

    public void attack(Character target){

        System.out.println("The archer "+ getName() + " shoots his arrow!!!");
        setStrength(7);
        int atc = getStrength();

        Random random  = new Random();
        int criticalHit = random.nextInt(10);  

        if(criticalHit >3){

            if(target.getLife() > 0){
            target.setLife(getLife()-atc);
            
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
        System.out.println("The Archer dodges");
        Random random  = new Random();

        int dodge = random.nextInt(10);//chance de esquivar

        if(dodge >= 5){ //aqui é a chance de esquivar
            System.out.println("Archer: "+ getName() +  " dodges perfectly");

        }else{
            System.out.println("Archer " + getName() +" can't dodge");
        }

        System.out.println("-------------------------------------------------------------------");
        
    }

     @Override
    public void showStatus(){
        System.out.println("name: "+ getName() + " Life: "+ getLife() + " Strength: "+ getStrength() + " Defense: "+ getDefense());
          
    }
}
