package ru.ifmo.lab3.models;

public class MouthOrgan extends MusicalInstrument {
    @Override
    public String getName() {
        return "Губная гармошка";
    }

    @Override
    public boolean isMovable() {
        return true;
    }
}
