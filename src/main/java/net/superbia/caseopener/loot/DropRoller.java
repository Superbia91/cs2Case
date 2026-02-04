package net.superbia.caseopener.loot;
import java.util.List;

public class DropRoller {
    public static DropEntry giveDropRoll(List<DropEntry> Listweight){


        double totalWeight = 0.0;

        for(DropEntry i :Listweight){

            totalWeight +=i.weight;
            }

        double random = Math.random()* totalWeight;
        DropEntry givenСhoice1 = null;
        for(DropEntry givenСhoice :Listweight){             //; <Listweight.size()-1;++
            random -=givenСhoice.weight;// долго думал
            if(random <= 0.0){
                return givenСhoice;
            }
            givenСhoice1 = givenСhoice;
            
        }

        return givenСhoice1;



    }
    }

