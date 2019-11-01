package ru.ifmo.lab3;

import ru.ifmo.lab3.enums.Mood;
import ru.ifmo.lab3.models.Artifact;

import java.util.ArrayList;
import java.util.List;

public abstract class FantasticCreature {
    private boolean homebody;
    private Mood mood;
    private String location;
    private List<Artifact> artifacts = new ArrayList<>();

    public abstract String getRace();

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public String getLocation() {
        return location;
    }

    public void move(String place) {
        this.location = place;
    }

    public boolean isHomebody() {
        return homebody;
    }

    public void setHomebody(boolean homebody) {
        this.homebody = homebody;
    }

    public void addArtifact(Artifact artifact) {
        artifacts.add(artifact);
    }
}
