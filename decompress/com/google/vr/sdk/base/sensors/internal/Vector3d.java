// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.base.sensors.internal;

public class Vector3d
{
    public double x;
    public double y;
    public double z;
    
    public static void add(final Vector3d vector3d, final Vector3d vector3d2, final Vector3d vector3d3) {
        vector3d3.set(vector3d.x + vector3d2.x, vector3d.y + vector3d2.y, vector3d.z + vector3d2.z);
    }
    
    public static void sub(final Vector3d vector3d, final Vector3d vector3d2, final Vector3d vector3d3) {
        vector3d3.set(vector3d.x - vector3d2.x, vector3d.y - vector3d2.y, vector3d.z - vector3d2.z);
    }
    
    public double length() {
        final double x = this.x;
        final double y = this.y;
        final double z = this.z;
        return Math.sqrt(x * x + y * y + z * z);
    }
    
    public void scale(final double n) {
        this.x *= n;
        this.y *= n;
        this.z *= n;
    }
    
    public void set(final double x, final double y, final double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public void set(final Vector3d vector3d) {
        this.x = vector3d.x;
        this.y = vector3d.y;
        this.z = vector3d.z;
    }
    
    public void setZero() {
        this.z = 0.0;
        this.y = 0.0;
        this.x = 0.0;
    }
    
    @Override
    public String toString() {
        return String.format("%+05f %+05f %+05f", this.x, this.y, this.z);
    }
}
