package com.x5kids.NasaProject.models;

import java.util.Date;

public class NasaProjectNearEarthObjectModel {

    private String name;
    private int id;
    private boolean isPotentiallyHazardousAsteroid;
    private int count;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsPotentiallyHazardousAsteroid(boolean isPotentiallyHazardousAsteroid) {
        this.isPotentiallyHazardousAsteroid = isPotentiallyHazardousAsteroid;
    }

    public boolean getIsPotentiallyHazardousAsteroid() {
        return isPotentiallyHazardousAsteroid;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
