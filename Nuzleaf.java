package org.pokemon;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.SpecialMove;


public class Nuzleaf extends Pokemon {

    class ShadowBall extends SpecialMove {
        public ShadowBall() {
            super(Type.GHOST, 80, 100);
        }

        @Override
        protected String describe() {
            return "не знает что делать";
        }
    }

    class Confide extends StatusMove {
        public Confide() {
            super(Type.NORMAL, 0, 0);
        }

        @Override
        protected String describe() {
            return "убегаеи";
        }
    }

    class LeafBlade extends PhysicalMove {
        public LeafBlade() {
            super(Type.GRASS, 90, 100);
        }

        @Override
        protected String describe() {
            return "решает задачу";
        }
    }

    class Swagger extends StatusMove {
        public Swagger() {
            super(Type.NORMAL, 0, 85);
        }

        @Override
        protected String describe() {
            return "отдыхает";
        }
    }

    public Nuzleaf(String name, int level) {
        super(name, level);
        this.setStats(70, 70, 40, 60, 40, 60);
        this.setMove(new ShadowBall(), new Confide(), new LeafBlade(), new Swagger());
    }
}


