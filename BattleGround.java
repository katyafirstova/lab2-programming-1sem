package org.battle;

import org.pokemon.*;
import ru.ifmo.se.pokemon.Battle;


public class BattleGround {

    public static void main(String[] args) {
        Battle field = new Battle();
        field.addAlly(new Misdreavus("Robert", 30));
        field.addAlly(new Mismagius("Leonardo", 28));
        field.addAlly(new Nuzleaf("Ryan", 27));
        field.addFoe(new Seedot("Keanu", 1));
        field.addFoe(new Shaymin("John", 30));
        field.addFoe(new Shiftry("Kevin", 1));
        field.go();
    }

}



