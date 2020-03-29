package com.habr.triangles;

interface Shape extends Comparable {
    double getVolume();


    @Override
    default int compareTo(Object o) {
       return  Double.compare(getVolume(),((Shape) o).getVolume());
    }
}
