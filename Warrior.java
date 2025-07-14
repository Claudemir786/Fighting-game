

import java.util.Random;

public class Warrior extends Character{
    

    public Warrior(String name){
        super(name);
        setDefense(5);
        setStrength(8);
    }     

    //funçâo que ataca que passa o alvo como parametro
    public int attack(Character target){
        System.out.println("The Warrior " + getName() + " attack fiercely");
        
        int atc = getStrength();//passa para uma variavel o nivel de força

        Random random  = new Random();//a biblioteca (classe) random é chamada

        int criticalHit = random.nextInt(10); //sorteia um numero aleatório de 0 10

        if(criticalHit > 3 ){
            if(target.getLife()>0){ //verifica se o inimigo não está morto

                target.setLife(target.getLife()- atc);//diminui a vida de acordo com o ataque
                return target.getLife();
            }else{
                System.out.println("Character " + target.getName() + " is dead");

            }
        }else if(criticalHit >0 && criticalHit <3){
             if(target.getLife() > 0){
                System.out.println("Bonus critical hit");

                target.setLife(target.getLife()-(atc + criticalHit));//diminui a vida de acordo com o ataque e adiciona dano critico
                return target.getLife();
            }else{
                System.out.println("Character " + target.getName() + " is dead");
            }
        }     
   return 0;
    }

    //função de defesa
    public int defense(){
        System.out.println("Warrior defends");
        //setDefense(5);//determina a quantidade de defesa o guerreiro tem
        
        setLife(getDefense() + getLife());//adiciona a defesa a vida porque a defesa vem sempre depois do ataque inimigo

        return getLife();
    }

    @Override
    public void showStatus(){
        System.out.println("name: "+ getName() + " Life: "+ getLife() + " Strength: "+ getStrength() + " Defense: "+ getDefense());
          
    }

    

    
}
