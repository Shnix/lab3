package ru.ifmo.lab3.models;

public abstract class MusicalInstrument implements Artifact {
    private long weightInGrams;
    private boolean movable;

    @Override
    public abstract String getName();

    @Override
    public long getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(long weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    @Override
    public boolean isMovable() {
        return movable;
    }

    public void setMovable(boolean movable) {
        this.movable = movable;
    }
}
