/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class WalkingZombie extends Zombie{
     public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }
    
    @Override
    public void heal(){
        if(level == 1){
            health += 0.2;
        }else if(level == 2){
            health += 0.3;
        }else if(level == 3){
            health += 0.4;
        }else{
            System.out.println("energi sudah tidak ada");
        }
    }
    
    @Override
    public void destroyed(){
        health += 0.2;
    }
    
    @Override
    public String getZombieInfo(){
        System.out.println("Walking zombie");
        System.out.println("Healt" + "level");
        return "Walking Zombie Data = \n"+"Health = "+health+"\n"+"Level = "+level+"\n";
    }
}
