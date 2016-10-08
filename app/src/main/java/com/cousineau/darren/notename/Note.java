package com.cousineau.darren.notename;


import com.cousineau.darren.notename.enums.ModifiersEnum;
import com.cousineau.darren.notename.enums.NotesEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;


/**
 * Created by Darren on 9/30/2016.
 */
@Setter
@Getter
@AllArgsConstructor(suppressConstructorProperties = true)
public class Note {
    private NotesEnum noteValue;
    private ModifiersEnum modifier;

    private static final Random RANDOM = new Random();

    private void setRandomNoteValue() {
        noteValue = NotesEnum.values()[RANDOM.nextInt(NotesEnum.values().length)];
    }

    private void setRandomModifier() {
        modifier = ModifiersEnum.values()[RANDOM.nextInt(ModifiersEnum.values().length)];
    }

    public Note() {
        setRandomNoteValue();
        setRandomModifier();
    }

    @Override
    public String toString() {
        return noteValue.toString();
        // + " " + modifier;
    }
}
