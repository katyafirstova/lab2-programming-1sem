package org.pokemon;

import ru.ifmo.se.pokemon.*;


public class Misdreavus extends Pokemon {

    class Psywave extends SpecialMove {
        public Psywave() {
            super(Type.PSYCHIC, 0, 100);
            this.accuracy = 2.0D;
        }

        protected boolean checkAccuracy(Pokemon att, Pokemon def) {
            return 0.75 * this.accuracy * att.getStat(Stat.ACCURACY) / def.getStat(Stat.EVASION) > Math.random();
        }

        @Override
        protected String describe() {
            return "нападает";
        }
    }

    class Swagger extends StatusMove {
        public Swagger() {
            super(Type.NORMAL, 0, 85);
        }

        @Override
        protected String describe() {
            return "бежит";
        }
    }

    class DazzlingGleam extends SpecialMove {
        public DazzlingGleam() {
            super(Type.FAIRY, 80, 100);
        }

        @Override
        protected String describe() {
            return "кричит";
        }

    }

    class MagicalLeaf extends SpecialMove {
        public MagicalLeaf() {
            super(Type.GRASS, 60, 0);
        }

        @Override
        protected String describe() {
            return "врывается";
        }
    }

    public Misdreavus(String name, int level) {
        super(name, level);
        this.setStats(60, 60, 60, 85, 85, 85);
        this.setType(Type.GHOST);
        this.setMove(new Psywave(), new Swagger(), new DazzlingGleam(), new MagicalLeaf());
    }
}


