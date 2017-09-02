package com.hillel.gucul.vitaly.enums;

/**
 * Created by insomnia on 01.09.17.
 */
public class Enum {

    public enum Earth {
        STATUS_EARTH(0, "Earth") {
            public String onWhatPlanet(){
                return "We leave on Earth";
            }
        },
        STATUS_VENUS (1, "Venus"){
            public String onWhatPlanet(){
                return "We leave on Venus";
            }
        },
        STATUS_MARS (2, "Mars"){
            public String onWhatPlanet(){
                return "We leave on Mars";
            }
        },
        STATUS_JUPITER(3, "Jupiter"){
            public String onWhatPlanet(){
                return "We leave on Jupiter";
            }
        },
        STATUS_NEPTUN (4, "Neptun") {
            public String onWhatPlanet(){
                return "We leave on Neptun";
            }
        },
        STATUS_URAN (5, "Earth"){
            public String onWhatPlanet(){
                return "We leave on Uran";
            }
        },
        STATUS_SATURN (6, "SATURN"){
            public String onWhatPlanet(){
                return "We leave on Saturn";
            }
        },
        STATUS_MERCURY (7, "MERCURY"){
            public String onWhatPlanet(){
                return "We leave on Mercury";
            }
        };


        Earth(int aNumber, String aName){
            this.name = aName;
            this.number = aNumber;
        }

        public abstract String onWhatPlanet();
        private int number;
        private String name;

        public static void   validateName ( String name){
            for (Earth stat: Earth.values()) {
                if ( stat.name.equalsIgnoreCase(name)){
                    System.out.println(stat.onWhatPlanet());
                }
            }
        }
    }



    public static void main(String[] args) {
       Earth.validateName("SATURN");
    }
}
