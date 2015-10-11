package com.parse.starter;

/**
 * Created by Eric on 10/10/15.
 */
public class Post {
    private String title;
    private String description;
    private Location loc;

    public Post(String title, String description, double lat, double lon) {
        title = title;
        description = description;
        loc = new Location(lat, lon);
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Location getLoc() {
        return loc;
    }

    class Location {
        private double lat;
        private double lon;

        Location(double lat, double lon) {
            lat = lat;
            lon = lon;
        }

        public double lat() {
            return lat;
        }

        public double lon() {
            return lon;
        }
    }

}
