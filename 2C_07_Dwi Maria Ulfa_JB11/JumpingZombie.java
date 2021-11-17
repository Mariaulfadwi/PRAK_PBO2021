/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class JumpingZombie extends Zombie{
    public JumpingZombie(int health, int level) {
        super.health = health;
        super.level = level;
    }
    
    public void heal(){
        if(level == 1){
            health += 0.3;
        }else if(level == 2){
            health += 0.4;
        }else if(level == 3){
            health += 0.5;
        }else{
            System.out.println("energi tidak ada tambahan");
        }
    }
    
    public void destroyed(){
        health += 0.1;
    }
    
    public String getZombieInfo(){
        return "Jumping Zombie Data = \n"+
                "Health = "+health+"\n"+
                "Level = "+level+"\n";
    }
}
