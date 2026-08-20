package ads.poo;

import java.util.Random;

public class Character {
    Random rnd = new Random();
    private int attack;
    private int speed;
    private int inteligence;
    private int agility;
    private int dex;
    private int luck;
    private int maxhealth;
    private int health;

    public void setCharacter(String buffer){
        String [] statsBuf = new String[6];
        statsBuf=buffer.split(buffer);
        IO.println(statsBuf);
        attack =Integer.parseInt(statsBuf[0]);
        speed =Integer.parseInt(statsBuf[1]);
        inteligence =Integer.parseInt(statsBuf[2]);
        agility =Integer.parseInt(statsBuf[3]);
        dex =Integer.parseInt(statsBuf[4]);
        luck =Integer.parseInt(statsBuf[5]);
        maxhealth =Integer.parseInt(statsBuf[6]);
    }
    public void getCharacterHealth(int newhealth){
        health=newhealth;
    }
    public void cureCharacter(int cure){
        if ((health+cure)>=maxhealth){
            health=maxhealth;
        }
        else {
            health+=cure;
        }
    }
    public String openChest(){
        String item ="";
        int seed =rnd.nextInt(1,(101));
        seed -=luck;
        if (seed<1) {
            seed = 1;
        }
        if (seed<=10){
            item="Legendary item";
        }else if(seed<=30){
            item="Epic item";
        }else if(seed<=50){
            item="Rare item";
        }else if(seed<=70){
            item="Uncommom item";
        } else{
            item="Commom item";
        }
        return item;
    }
    public double characterAttack(){
        double dammage = attack*((speed*0.2)+(inteligence*0.4)+(dex*1.5)+(agility*0.3));
        return dammage;
    }
}

