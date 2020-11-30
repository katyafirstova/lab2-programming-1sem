package org.pokemon;

import ru.ifmo.se.pokemon.*;


public class Seedot extends Pokemon {


    class ShadowBall extends SpecialMove {
        public ShadowBall() {
            super(Type.GHOST, 80, 100);


        }
    }

    class Confide extends StatusMove {
        public Confide() {
            super(Type.NORMAL, 0, 0);
        }
        protected void applySelfEffects(Pokemon p) {
            p.setMod(Stat.SPECIAL_ATTACK,1);
            p.setMod(Stat.SPECIAL_DEFENSE,1);
        }

    }

    public Seedot(String name, int level) {
        super(name, level);
        this.setStats(40, 40, 50, 30, 30, 30);
        this.setMove(new ShadowBall(), new Confide());
    }
}
