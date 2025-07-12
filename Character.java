

public abstract class Character {
        
    private String name;
    private int life = 20;
    private int strength;
    private int defense;



    public Character(String name){
        this.name = name;

    }

    public abstract void attack(Character alvo);

    public abstract void defense();

    public void showStatus(){
        System.out.println("name: "+ this.name + " Life: "+ this.life + "Strength: "+ this.strength + "Defence: "+ this.defense);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    

    
    
}
