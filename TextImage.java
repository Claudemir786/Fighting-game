import java.util.Scanner;

public class TextImage {
    Scanner scanner = new Scanner(System.in);

    public void CaracterSelection(){
        int stopGame = 1;
        do {
            System.out.println("select your character");
            System.out.println("1 - Mage, 2 - Archer, 3 - Warrior");

            int chosenCharacter = scanner.nextInt();
            scanner.nextLine();
            if (chosenCharacter == 1) {
                System.out.println("who will be your opponent?");
                System.out.println("1-Mage, 2-Archer, 3-Warrior");
                int adversary = scanner.nextInt();
                scanner.nextLine();
                if (adversary != 2 && adversary != 3 && adversary != 1) {
                    System.out.println("opponent not found");


                }else {
                    System.out.println("What is the wizard's name?");
                    String mageName = scanner.nextLine();
                    Mage mage = new Mage(mageName);
                    System.out.println("What is your opponent's name?");
                    String opponnentName = scanner.nextLine();
                    if(adversary == 1){Mage mage1 = new Mage(opponnentName);
                        batlle(mage, mage1);

                    } else if (adversary == 2) {
                        Archer archer = new Archer(opponnentName);
                        batlle(mage, archer);

                    }else{
                        Warrior warrior = new Warrior(opponnentName);
                        batlle(mage, warrior);
                    }


                }

            }else if(chosenCharacter == 2){
                System.out.println("who will be your opponent?");
                System.out.println("1-Mage, 2-Archer, 3-Warrior");
                int adversary = scanner.nextInt();
                scanner.nextLine();
                if(adversary != 2 && adversary != 3 && adversary != 1){
                    System.out.println("opponent not found");

                }else{
                    System.out.println("What is the archer's name?");
                    String archerName = scanner.nextLine();
                    Archer archer = new Archer(archerName);
                    System.out.println("What is your opponent's name?");
                    String opponnentName = scanner.nextLine();
                    if(adversary == 1){Mage mage = new Mage(opponnentName);
                        batlle(archer, mage);

                    } else if (adversary == 2) {
                        Archer archer1 = new Archer(opponnentName);
                        batlle(archer, archer1);

                    }else{
                        Warrior warrior = new Warrior(opponnentName);
                        batlle(archer, warrior);
                    }

                }
            }else if(chosenCharacter == 3){
                System.out.println("who will be your opponent?");
                System.out.println("1-Mage, 2-Archer, 3-Warrior");
                int adversary = scanner.nextInt();
                scanner.nextLine();
                if(adversary != 2 && adversary != 3 && adversary != 1) {
                    System.out.println("opponent not found");

                }else{
                    System.out.println("What is the warrior's name?");
                    String warriorName = scanner.nextLine();
                    Warrior warrior = new Warrior(warriorName);
                    System.out.println("What is your opponent's name?");
                    String opponnentName = scanner.nextLine();
                    if(adversary == 1){Mage mage = new Mage(opponnentName);
                        batlle(warrior, mage);

                    } else if (adversary == 2) {
                        Archer archer = new Archer(opponnentName);
                        batlle(warrior, archer);

                    }else{
                        Warrior warrior1 = new Warrior(opponnentName);
                        batlle(warrior, warrior1);
                    }


                }
            }else if(chosenCharacter == 0){
                System.out.println(".....");
                stopGame = 0;

            }else{
                System.out.println("option not found");

            }


        }while(stopGame != 0);

    }
    public void batlle(Character character, Character opponent){
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");

        System.out.println("The battle begins   epic music in the background ♪♪♪♪♪♫♫");


        int turn = 1;
        while(opponent.getLife()>0) {
            System.out.println("Turn: "+ turn);

            System.out.println("Attack: press 1");
            int attack = scanner.nextInt();
            scanner.nextLine();
            if(attack == 1) {
                //ataque perssonagem escolhido
                opponent.setLife(character.attack(opponent));
                opponent.setLife(opponent.defense());

                //ataque adversário
                character.setLife(opponent.attack(character));
                character.setLife(character.defense());

                if (opponent.getLife() <= 0) {
                    System.out.println(character.getName() + "is the champion of the battle");
                    break;
                } else if (character.getLife() <= 0) {
                    System.out.println(opponent.getName() + "is the champion of the battle");
                    break;
                } else {
                    System.out.println("status: " + character.getName() + " life: " + character.getLife() + "\n" +
                            opponent.getName() + " life: " + opponent.getLife());
                    turn++;
                }
            }
        }
    }
}







