package com.cousineau.darren.notename.enums;

/**
 * Created by Darren on 9/30/2016.
 */
public enum ModifiersEnum {
    Sharp, None, Flat;

    @Override
    public String toString() {
        switch(this) {
            case Sharp:
                return "Sharp";
            case Flat:
                return "Flat";
            case None:
                return "";
            default:
                throw new IllegalArgumentException();
        }
    }
}
